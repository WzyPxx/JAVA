package javaObject.Gzq;

/*
* javabean 使用
* */
public class JavaBeanTest {
    //1.成员变量使用private修饰
    private String name;
    private double height;
    private double salary;
    //2.提供成员变量对应的setXxx()/getXxx()方法
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    //3.提供无参构造器，有参构造器是可选的
    public JavaBeanTest() {
    }
    public JavaBeanTest(String name, double height, double salary) {
        this.name = name;
        this.height = height;
        this.salary = salary;
    }
}
