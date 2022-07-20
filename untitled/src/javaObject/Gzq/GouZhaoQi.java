package javaObject.Gzq;


/*
  构造器、this关键字
*/
public class GouZhaoQi {
    String name;
    double price;
    //无参数构造器
    public GouZhaoQi(){
        System.out.println("无参调用this");
    }
    //有参数构造器
    public GouZhaoQi(String a,double b){
        System.out.println("有参构造this");
        name = a;
        price = b;
    }
}
