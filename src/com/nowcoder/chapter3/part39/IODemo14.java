package com.nowcoder.chapter3.part39;

import java.io.*;

/**
 * 自定义序列化
 */
public class IODemo14 {

    public static void main(String[] args) {
//        testSerialize();
        testDeserialize();
    }

    public static void testSerialize() {
        try (
                ObjectOutputStream oos = new ObjectOutputStream(
                        new FileOutputStream("C:/javacode/customer.txt"));
        ) {
            Customer c = new Customer("gpw", "123457");
            c.setEmail("vivian97985@163.com");
            oos.writeObject(c);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void testDeserialize() {
        try (
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:/javacode/customer.txt"));
        ) {
            Customer c = (Customer) ois.readObject();
            System.out.println(c);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class Customer implements Serializable {

    private static final long serialVersionUID = -4332797723908658766L;
    private String username;
    private String password;
    private String email;

    public Customer(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        System.out.println("写入对象...");
        out.writeObject(this.username);
        out.writeObject(new StringBuilder(this.password).reverse().toString()); // 简单加密
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        System.out.println("恢复对象...");
        this.setUsername(in.readObject().toString());
        this.setPassword(new StringBuilder(in.readObject().toString()).reverse().toString());
    }

}