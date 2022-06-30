package JavaOnt;

import java.util.Scanner;

public class FangFa {
    public static void main(String[] args) {
        int[] a  = {12,18,16,23,28,32,47,1};
        int[] b = new int[4];
        int[] c = {12,18,16,23,28,32,47,1};
        System.out.println(towArray(a,b));

    }
    /*
     标准格式方法
    */
    public static int sum(int a,int b){
        int c = a + b;
        return c;
    }

    /*
     无参数伍返回值方法
    */
    public static void print(){
        for (int i = 0; i < 3; i++) {
            System.out.println("你好");
        }
    }
    /*
      计算1-n的和并返回
    */
    public static int sumn(int a){
        int b = 0;
        for (int i = 1; i <= a ; i++) {
            b += i;
        }
        return b;
    }
    /*
    判断整数是奇数还是偶数
    */
    public static void jishuoshu(int a){
        if (a % 2 == 0) {
            System.out.println("偶数");
        }else {
            System.out.println("奇数");
        }
    }
    /*
    数组求最值
    */
    public static int max(int[] a){
        int b = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > b){
                b = a[i];
            }
        }
        return  b;
    }
    /*
      打印整数数组内容
    */
    public static void printLog(int[] a){
        System.out.println("[");
        if (a != null && a.length > 0){
            for (int i = 0; i < a.length; i++) {
                System.out.println(i == a.length-1? a[i] : a[i] + ",");
            }
        }
        System.out.println("]");
    }
    /*
        从数组中查找元素的引用
    */
    public static int indexArray(int[] a,int b){

        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                return i;
            }
        }
        return -1;
    }
    /*
       比较两个数组是否一样
    */
    public static boolean towArray(int[] a,int[] b){
        if (a.length == b.length) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    return false;
                }
            }
            return true;
        }else {
        return false;
        }
    }
}
