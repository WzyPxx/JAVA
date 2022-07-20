package javaObject.Gzq;

/*
* 封装
* */
public class FengZhuang {
    //成员变量 使用private修饰，只能在本类中使用
    private int age;
    //提供public修饰的成套的getter和setter方法暴漏其取值和赋值
    public void setAge(int age){
        if (age > 0 && age <= 200) {
            this.age = age;
        }else {
            System.out.println("年龄错误！");
        }
    }
    public int getAge(){
        return  age;
    }
}
