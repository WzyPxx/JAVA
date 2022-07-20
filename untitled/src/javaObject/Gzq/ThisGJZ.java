package javaObject.Gzq;

/*
* this 关键字
* */
public class ThisGJZ {
    String name;
    double price;
    String baba = "模特";
    //无参构造器this
    public ThisGJZ(){
        System.out.println("无参构造器this"+this);
    }
    //方法this
    public void ren(){
        System.out.println("方法中的this"+this);
    }
    public void run(String baba){
        System.out.println(this.baba+"和"+baba);
    }
    //有参构造器
    public ThisGJZ(String name,double price){
        this.name = name;
        this.price = price;
    }
}
