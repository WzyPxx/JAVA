package JavaOnt;
import java.util.Random;
import java.util.Scanner;


public class ShuZhu {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        /*//静态初始化方式定义数组
        String[]  a = {"位","裴","王","李","张","孔","任","胡","伍"};
        //访问数组元素
        System.out.println(a[b]);
        //访问数组的长度
        System.out.println(a.length);*/
        //动态初始化数组定义
        /*int[]  dongtai = new int[3];
        dongtai[2] = 100;
        System.out.println(dongtai[2]);
        System.out.println(dongtai[1]);*/
        //元素默认值
        /*int[]  ints = new int[3];  //整型
        char[] chars = new char[3];  //  字符
        double[] doubles = new double[3];  //浮点
        boolean[] booleans = new boolean[3];  //布尔型
        String[] strings = new String[3];  //引用类型
        System.out.println(ints[0]);
        System.out.println((int) chars[0]);
        System.out.println(doubles[0]);
        System.out.println(booleans[0]);
        System.out.println(strings[0]);*/
        //数组的遍历
        /*int[] intsb = {52,70,68,48,45,761,101};
        for (int i = 0; i < intsb.length; i++) {

            System.out.println(intsb[i]);
        }*/
        //数组元素求和
        /*int sum = 0;
        for (int i = 0; i < intsb.length; i++) {
            sum += intsb[i];
        }
        System.out.println(sum);*/
        //数组求最值
        //定义静态初始化数组
        /*int[] ac = {21,45,212,11,15,58};
        //定义变量，建议默认存储第一个元素值作为参照
        int bc = ac[0];
        //变量数组每个元素，依次比较取值，较大替换
        for (int i = 1; i < ac.length; i++) {
            if (ac[i]>bc){
                bc = ac[i];
            }
        }
        System.out.println(bc);*/
        //猜数字游戏
        /*//定义动态初始化数组
        int[] intb = new int[5];
        //循环变量随机数进行数值赋值
        for (int i = 0; i < intb.length; i++) {
            intb[i] = random.nextInt(1,21);
        }
        //死循环用户进行猜测
        OUT:
        while (true){
            System.out.println("请输入数字");
            int scc = scanner.nextInt();
            //遍历数组每个元素和用户输入进行比较，相同结束死循环
            for (int i = 0; i < intb.length; i++) {
                if (scc == intb[i]){
                    System.out.println("运气不错"+i);
                    break OUT;
                }
            }
            System.out.println("未命中继续猜测");
        }
        //遍历数组元素进行查看
        for (int i = 0; i < intb.length; i++) {
            System.out.println(intb[i]);
        }*/
        //随机排名
        /*//定义动态数组
        int[]  intsshuiji = new int[5];
        //录入数字五次
        for (int i = 0; i < intsshuiji.length; i++) {
            //录入数字存入数组
            intsshuiji[i] = scanner.nextInt();
        }
        //循环遍历数组，随机一个下标出来，当前元素与随机元素值进行交换
        for (int i = 0; i < intsshuiji.length; i++) {
            //获取随机数
            int index = random.nextInt(intsshuiji.length);
            //临时变量存储交换前值
            int linshi = intsshuiji[i];
            intsshuiji[i] = intsshuiji[index];
            intsshuiji[index] = linshi;
        }
        for (int i = 0; i < intsshuiji.length; i++) {
            System.out.println("交换完成随机值"+intsshuiji[i]);
        }*/
        //数值排序
        //冒泡排序
        /*int[] paixu = {5,9,2,7};
        //定义外部循环控制总共需要几轮（数值长度-1）
        for (int i = 0; i < paixu.length -1; i++) {
            //定义内部循环控制每轮依次往后比较一个位置（数值长度-i-1）
            for (int j = 0; j < paixu.length - i -1; j++) {
                //当前位置元素大于后一个位置元素进行交换
                if (paixu[j] < paixu[j+1]) {
                    int acacac = paixu[j+1];
                    paixu[j+1] = paixu[j];
                    paixu[j] = acacac;
                }
            }
        }
        for (int i = 0; i < paixu.length; i++) {
            System.out.println(paixu[i]);
        }*/
    }
}
