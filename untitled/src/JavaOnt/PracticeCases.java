package JavaOnt;

import java.util.Random;
import java.util.Scanner;

public class PracticeCases {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        /*System.out.println("输入原价：");
        double money = scanner.nextDouble();
        System.out.println("输入月份：");
        int month = scanner.nextInt();
        System.out.println("输入舱位：");
        String type = scanner.next();
        System.out.println("最总价格为："+PlaneTicket(money,month,type));*/
        /*String Cide = VerificationCode(4);
        System.out.println(Cide);*/
        /*int[] a1 = {21,54,41,51,61};
        int[] a2 = new int[5];
        Array(a1,a2);
        Array(a1);
        Array(a2);*/
        /*int ac = random.nextInt(6,11);
        int[] luru = new int[5];
        for (int i = 0; i < luru.length; i++) {
            System.out.println("输入第"+(i+1)+"位数：");
            int a = scanner.nextInt();
            luru[i] = a;
        }*/
        //double count = Fraction(luru);
        //System.out.println("平均分得分："+count);
        //DigitalEncryption(luru);
        int[] zhongjiang = Two_colorBall();
        int[] shuru = Cwo_colorBall();
        Cwo_colorBall(zhongjiang,shuru);
    }

    /*
     买飞机票
    */
    public static double PlaneTicket(double a, int b, String c) {
        if (b >= 5 && b <= 10) {
            switch (c) {
                case "头等舱":
                    a *= 0.9;
                    break;
                case "经济舱":
                    a *= 0.85;
                    break;
                default:
                    System.out.println("仓位有误！");
                    a = -1;
            }
        } else if (b <= 4 && b >= 1 || b == 11 || b == 12) {
            switch (c) {
                case "头等舱":
                    a *= 0.7;
                    break;
                case "经济舱":
                    a *= 0.65;
                    break;
                default:
                    System.out.println("仓位有误！");
                    a = -1;
            }
        } else {
            System.out.println("输入月份有误！");
            a = -1;
        }
        return a;
    }

    /*
      找素数
    */
    public static void PrimeNumber() {
        for (int i = 101; i <= 201; i++) {
            boolean flag = true;
            for (int j = 2; j < i / 2; j++) {
                if (i % j == 0) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.println(i);
            }
        }
    }

    /*
      随机验证码
    */
    public static String VerificationCode(int a) {
        String code = "";
        Random random = new Random();
        for (int i = 1; i <= a; i++) {
            int type = random.nextInt(3);
            switch (type) {
                case 0:
                    char ca = (char) (random.nextInt(26) + 65);
                    code += ca;
                    break;
                case 1:
                    char ca1 = (char) (random.nextInt(26) + 97);
                    code += ca1;
                    break;
                case 2:
                    code += random.nextInt(10);
                    break;
            }

        }
        return code;
    }

    /*
      数组元素复制
    */
    public static void Array(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
    }

    public static void Array(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(i == a.length - 1 ? a[i] : a[i] + ",");
        }
    }

    /*
      评委评分
    */
    public static double Fraction(int[] a) {
        int max = a[0];
        int min = a[0];
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            } else if (min > a[i]) {
                min = a[i];
            }
            sum += a[i];
        }
        return (sum - max - min) / (a.length - 2);
    }

    /*
      数字加密
    */
    public static void DigitalEncryption(int[] a) {
        int[] ac = new int[a.length];


        for (int i = 0; i < a.length; i++) {
            ac[i] = (a[i] + 5) % 10;
        }
        System.out.println("两次加密结果");
        Array(ac);
        for (int i = 0, j = ac.length - 1; i < j; i++, j--) {
            int jiaohuan = ac[j];
            ac[j] = ac[i];
            ac[i] = jiaohuan;
        }
        System.out.println("最值加密结果");
        Array(ac);
    }

    /*
      模拟双色球
    */
    //生成中奖号码
    public static int[] Two_colorBall() {
        Random random = new Random();
        int[] haoma = new int[7];
        //生成六个红色号码
        for (int i = 0; i < haoma.length - 1; i++) {
            //为当前位置找不重复的数字
            while (true) {
                int congfu = random.nextInt(1, 33);
                boolean ssss = true;
                for (int j = 0; j < i; j++) {
                    if (congfu == haoma[j]) {
                        ssss = false;
                        break;
                    }
                }
                if (ssss) {
                    haoma[i] = congfu;
                    break;
                }
            }
        }
        //生成一位蓝球号码
        haoma[haoma.length - 1] = random.nextInt(1, 16);
        return haoma;
    }

    //用户输入号码
    public static int[] Cwo_colorBall() {
        Scanner scanner = new Scanner(System.in);
        int[] shuru = new int[7];
        for (int i = 0; i < shuru.length - 1; i++) {
            System.out.println("输入第" + (i + 1) + "位红球号码(1-33)：");
            int cs = scanner.nextInt();
            shuru[i] = cs;
        }
        System.out.println("请您输入蓝球号码(1-16)：");
        shuru[shuru.length - 1] = scanner.nextInt();
        return shuru;
    }

    //判断是否中奖
    public static void Cwo_colorBall(int[] a, int[] b) {
        int hongqiu = 0;
        int lanqiu = 0;
        for (int i = 0; i < b.length - 1; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (b[i] == a[j]) {
                    lanqiu++;
                    break;
                }
            }
        }
        lanqiu = a[6] == b[6] ? 1 : 0;
        System.out.println("中奖号码是：");
        Array(a);
        System.out.println("投注号码是：");
        Array(b);
        System.out.println("红球命中数为："+hongqiu);
        System.out.println("蓝球"+(lanqiu == 1?"中了":"没中"));
        if (lanqiu == 1 && hongqiu < 3) {
            System.out.println("恭喜你再见您了，六等奖5元！！！");
        } else if (lanqiu == 1 && hongqiu == 3 || lanqiu == 0 && hongqiu == 4) {
            System.out.println("恭喜你别玩彩票，五等奖10元！！！");
        } else if (lanqiu == 1 && hongqiu == 4 || lanqiu == 0 && hongqiu == 5) {
            System.out.println("恭喜你小小运气，四等奖200元！！！");

        } else if (lanqiu == 1 && hongqiu == 5) {
            System.out.println("恭喜你人气佳人，三等奖3000元！！！");

        }else if (lanqiu == 0 && hongqiu ==6){
            System.out.println("恭喜你万中无一，二等奖500万元！！！");

        }else if (lanqiu == 1 && hongqiu ==6){
            System.out.println("恭喜你天选之子，一等奖500万元！！！");
        }else {
            System.out.println("手气巨烂！小菜鸡");
        }
    }
}