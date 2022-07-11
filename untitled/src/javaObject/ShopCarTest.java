package javaObject;

import java.util.Scanner;

/**
  购物车模块模拟
 */
public class ShopCarTest {
    public static void main(String[] args) {
        //1.定义商品类，创建商品对象Goods
        //2.定义购物车对象，使用一个数组
        Goods[] shopCar = new Goods[100];
        //3.搭建操作架构
        boolean zhenjia = true;
        while (zhenjia) {
            System.out.println("请您选择一下命令操作：");
            System.out.println("添加商品：add");
            System.out.println("查询商品：query");
            System.out.println("修改商品数量：update");
            System.out.println("结算商品：pay");
            Scanner scanner = new Scanner(System.in);
            System.out.println("请你输入命令：");
            String mingling = scanner.next();
            switch (mingling){
                case "add":
                    //添加商品方法
                    addGoods(shopCar,scanner);
                    break;
                case "query":
                    //查询商品方法
                    queryGoods(shopCar);
                    break;
                case "update":
                    //修改商品方法
                    updateGoods(shopCar,scanner);
                    break;
                case "pay":
                    //结算商品方法
                    payGoods(shopCar);
                    zhenjia = false;
                    System.out.println("欢迎下次光临~~~~~`");
                    break;
                case "jiesu":
                    //结束程序
                        zhenjia = false;
                        System.out.println("欢迎下次光临~~~~~`");
                    break;
                default:
                    System.out.println("命令错误，请检查！");
                    break;
            }

        }
    }



    //添加商品方法
    public static void addGoods(Goods[] shopCar,Scanner scanner) {
        //1.录入商品
        System.out.println("添加商品编号：");
        int id = scanner.nextInt();
        System.out.println("添加商品名称：");
        String name = scanner.next();
        System.out.println("添加商品价格：");
        double price = scanner.nextDouble();
        System.out.println("添加商品数量");
        int buyNumber = scanner.nextInt();
        //2.封装一个商品对象
        Goods g = new Goods();
        g.id = id;
        g.name = name;
        g.price = price;
        g.buyNumber = buyNumber;
        //3.商品对象添加到购物车数组中去
        for (int i = 0; i < shopCar.length; i++) {
            if (shopCar[i] == null) {
                //说明索引位没有元素
                shopCar[i] = g;
                break;
            }
        }
        System.out.println("商品："+g.name+"添加成功！！！！");
    }
    //查询商品方法
    public static void queryGoods(Goods[] shopCar) {
        System.out.println("=========查询购物车现在商品信息如下=========");
        System.out.println("编号\t\t商品名称\t\t商品价格\t\t购买数量\t\t");
        for (int i = 0; i < shopCar.length; i++) {
            if (shopCar[0] == null){
                System.out.println("没有添加任何商品请添加商品!!!");
                break;
            }else {
                Goods g = shopCar[i];
                if (g != null) {
                    //遍历商品
                    System.out.println(g.id+"\t\t"+g.name+"\t\t\t"+g.price+"\t\t\t"+g.buyNumber+"\t\t");
                }else {
                    //遍历结束
                    break;
                }
            }

        }
    }
    //修改商品方法
    public static void updateGoods(Goods[] shopCar,Scanner scanner) {
        //让用户输入商品编号根据商品编号查询对象
        while (true) {
            System.out.println("请输入需要修改商品编号：");
            int id = scanner.nextInt();
            Goods g = getGoodsByid(shopCar,id);
            if (g == null) {
                System.out.println("没有对应编号商品，请确认！");
            }else {
                System.out.println("请您输入"+g.name+"商品的修改的购买数量：");
                int buyname = scanner.nextInt();
                g.buyNumber =buyname;
                System.out.println("修改完成！");
                queryGoods(shopCar);
                break;
            }
        }
    }
    //根据数据id遍历数数组查询对应编号返回
    public static Goods getGoodsByid(Goods[] shopCar,int id){
        for (int i = 0; i < shopCar.length; i++) {
            Goods g = shopCar[i];
            if (g != null) {
                //判断这个商品对象的id是否是我们要找的
                if (g.id == id){
                    return g;
                }
            }else {
                return null;//找完存在商品，都没有找到
            }
        }
        return null; //找完商品数组不存在对应编号数据
    }
    //结算商品方法
    private static void payGoods(Goods[] shopCar) {
        //定义求和变量累加金额
        double[] money = new double[shopCar.length];
        //遍历购物车数组中的全部商品对象,累加的单价*数量
        for (int i = 0; i < shopCar.length; i++) {
            Goods g = shopCar[i];
            if (g != null) {
                money[i] += (g.price*g.buyNumber);
            }else {
                break;
            }
        }
        queryGoods(shopCar);
        double sum = 0;
        for (int i = 0; i < money.length;i++) {
            Goods g = shopCar[i];
            if (g != null) {
                System.out.println("商品"+g.name+"的总价为："+(g.buyNumber*g.price));
                sum +=(g.buyNumber*g.price);
            }else {
                break;
            }
        }
        System.out.println("所有商品总价为："+sum);
    }
}
