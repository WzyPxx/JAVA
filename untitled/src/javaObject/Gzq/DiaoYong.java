package javaObject.Gzq;

import java.net.Socket;

/*
*  认识调用构造器
*/
public class DiaoYong {
    public static void main(String[] args) {
        //调用无参构造器得到对象
        GouZhaoQi gouZhaoQi = new GouZhaoQi();
        gouZhaoQi.name = "奔驰";
        gouZhaoQi.price = 30000000;
        System.out.println(gouZhaoQi.name);
        System.out.println(gouZhaoQi.price);
        //调用有参构造器得到对象
        GouZhaoQi gouZhaoQi1 = new GouZhaoQi("宝马",300000);
        System.out.println(gouZhaoQi1.name);
        System.out.println(gouZhaoQi.price);
        //调用查看this
        ThisGJZ thisGJZ = new ThisGJZ();
        thisGJZ.ren();
        thisGJZ.run("越野");
        System.out.println(thisGJZ);
        ThisGJZ thisGJZ1 = new ThisGJZ("奥迪",1111);
        System.out.println(thisGJZ1.name);
        System.out.println(thisGJZ1.price);
        //封装调用
        FengZhuang fengZhuang = new FengZhuang();
        fengZhuang.setAge(-23);
        System.out.println(fengZhuang.getAge());
        //JavaBean调用,无参构造器封装信息
        JavaBeanTest javaBeanTest = new JavaBeanTest();
        javaBeanTest.setHeight(182);
        javaBeanTest.setName("新乡郭富城");
        javaBeanTest.setSalary(13000);
        System.out.println(javaBeanTest.getName());
        System.out.println(javaBeanTest.getHeight());
        System.out.println(javaBeanTest.getSalary());
        //JavaBean调用,有参构造器封装信息
        JavaBeanTest javaBeanTest1 = new JavaBeanTest("新乡彭于晏",182,11000);
        System.out.println(javaBeanTest1.getName());
        System.out.println(javaBeanTest1.getHeight());
        System.out.println(javaBeanTest1.getSalary());
       /*
        实际案例电影页面
        1.设计电影类
        2.创建3个电影对象封装信息
        3.定义数组，存储对象
        4.遍历数组内一个电影对象，获取信息展示
        */
        Movie[] movies = new Movie[3];
        movies[0] = new Movie("《战狼》",9.7,"吴京");;
        movies[1] = new Movie("《叶问》",9.6,"甄子丹");;
        movies[2] = new Movie("《海贼王》",9.5,"路飞");;
        for (int i = 0; i < movies.length; i++) {
            Movie movie = movies[i];
            System.out.println(movie.getName());
            System.out.println(movie.getScore());
            System.out.println(movie.getActor());
        }
    }
}
