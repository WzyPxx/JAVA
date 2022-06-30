package JavaOnt;


public class XunHuan {
    public static void main(String[] args) {
        //while死循环   验证密码登录技术
        /*int c = 520;
        System.out.println("输入密码：");
        Scanner a = new Scanner(System.in);
        while(true){
            int b = a.nextInt();
            if (b == c){
                System.out.println("登录成功");
                break;
            }else {
                System.out.println("登录失败");
            }
        }*/
        //嵌套循环
        /*for (int i = 1; i <= 5; i++) {
            System.out.println("第"+i+"天");
            for (int j = 1; j <= 3; j++) {
                System.out.println("第"+j+"次我爱你");
            }
        }*/
         //break  continue 使用方法
        /*for (int i = 0; i < 5; i++) {
            System.out.println("洗碗");
            if (i == 2){
                break;
            }
        }
        for (int i = 0; i < 5; i++) {

            if (i == 2){
                continue;
            }
            System.out.println("洗碗");
        }*/
        //Random随机数技术

        /*Random random = new Random();
        int a = random.nextInt(10,20);
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("随机数已经生成请猜测：");
            int b = scanner.nextInt();
            if (a>b){
                System.out.println("猜测过小");
            }else if (a<b){
                System.out.println("猜测过大");
            }else {
                System.out.println("猜测正确");
                break;
            }
        }*/

    }
}
