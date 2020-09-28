package com.nowcoder.chapter3.part39;

import java.io.*;

/**
 * transient关键字
 */
public class IODemo13 {

    public static void main(String[] args) {
//        testSerialize();
        testDeserialize();
    }

    public static void testSerialize() {
        try (
                ObjectOutputStream oos = new ObjectOutputStream(
                        new FileOutputStream("C:/javacode/user.txt"));
        ) {
            User user = new User("gpw", "123457");
            user.setEmail("vivian97985@163.com");
            user.setPhone("18511338883");
            oos.writeObject(user);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void testDeserialize() {
        try (
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:/javacode/user.txt"));
        ) {
            User user = (User) ois.readObject();
            System.out.println(user);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class User implements Serializable {

    private static final long serialVersionUID = -7169563013077451214L;
    private String username;
    private transient String password;
    private String email;
    private String phone;

    public User(String username, String password) {
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}