package javaObject;

import javaObject.ObjectOriented;

public class TheCallingObject {
    public static void main(String[] args) {
        //创建对象
        ObjectOriented objectOriented = new ObjectOriented();
        objectOriented.name = "卡迪拉克";
        System.out.println(objectOriented.name);

        objectOriented.start();
        objectOriented.price = 123.5;
        System.out.println(objectOriented.price);

        objectOriented.ren();
    }
}
