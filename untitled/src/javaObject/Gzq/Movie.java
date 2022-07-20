package javaObject.Gzq;

public class Movie {
    //1.封装成员变量
    private String name;
    private double score;
    private String actor;
    //定义方法
    public void start(){
        System.out.println("启动"+name);
    }
    //无参构造器
    public Movie() {
    }
    //有参构造器
    public Movie(String name, double score, String actor) {
        this.name = name;
        this.score = score;
        this.actor = actor;
    }
    //JavaBean
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getScore() {
        return score;
    }
    public void setScore(double score) {
        this.score = score;
    }
    public String getActor() {
        return actor;
    }
    public void setActor(String actor) {
        this.actor = actor;
    }
}











