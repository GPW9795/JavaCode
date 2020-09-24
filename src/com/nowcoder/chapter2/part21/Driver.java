package com.nowcoder.chapter2.part21;

// 多态
public class Driver {

    /*
     * 1、运行时，实际传入的对象，可以是声明的类型或其子类
     * 2、编译时，只能调用声明的类型的成员变量和成员方法，不能调用其子类型的成员
     * 3、声明的类型也叫编译时类型，运行时存入的类型也叫运行时类型
     * */
    void drive(Vehicle vehicle) {
        System.out.println("drive:" + vehicle.brand);
        vehicle.run();

        // 类型判断
        if (vehicle instanceof Bus) {
            Bus bus = (Bus) vehicle;
            System.out.println(bus.passengers);
            bus.brush();
        } else if (vehicle instanceof Truck) {
            Truck truck = (Truck) vehicle;
            System.out.println(truck.capacity);
            truck.unload();
        }
    }

}
