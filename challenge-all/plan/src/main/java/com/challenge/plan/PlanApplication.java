package com.challenge.plan;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class PlanApplication {

    public static void main(String[] args) {
        String s = "NQ";
        String t = "NQ";
        while(s != "Q" && t == "NQ") {
            System.out.println("请输入需要计算的活动,可输入ABCD或结束请输入Q:");
            Scanner sc1 = new Scanner(System.in);
            s = sc1.next();
            switch (s) {
                case "A":
                    plan1();
                    //break和continue之间的主要区别是break⽤于⽴即终⽌循环。
                    // 另⼀⽅⾯，continue终⽌当前迭代并将控制恢复到循环的下⼀个迭代。
                    break;
                case "B":
                    plan2();
                    break;
                case "C":
                    plan3();
                    break;
                case "D":
                    plan4();
                    break;
                case "Q":
                    System.out.println("感谢使用本服务!");
                    t = "QQ";
                    break;
                default:
                    System.out.println("活动字母输入错误!请输入A或B或C或D");
            }
        }
    }

    private static void plan1() {
        System.out.println("请输入顾客购买的苹果斤数8元/斤:");
        Scanner sc1 = new Scanner(System.in);
        int num1 = sc1.nextInt();
        System.out.println("请输入顾客购买的草莓斤数13元/斤:");
        Scanner sc2 = new Scanner(System.in);
        int num2 = sc2.nextInt();
        int sum = num1*8+num2*13;
        System.out.println("顾客购买的商品总价为:"+sum+"元");
        boolean result = bool1(num1,num2,sum);
        System.out.println(result?"计算正确":"计算错误");
    }
    private static  void plan2(){
        System.out.println("请输入顾客购买的苹果斤数8元/斤:");
        Scanner sc1 = new Scanner(System.in);
        int num1 = sc1.nextInt();
        System.out.println("请输入顾客购买的草莓斤数13元/斤:");
        Scanner sc2 = new Scanner(System.in);
        int num2 = sc2.nextInt();
        System.out.println("请输入顾客购买的芒果斤数20元/斤:");
        Scanner sc3 = new Scanner(System.in);
        int num3 = sc3.nextInt();
        int sum = num1*8+num2*13+num3*20;
        System.out.println("顾客购买的商品总价为:"+sum+"元");
        boolean result = bool2(num1,num2,num3,sum);
        System.out.println(result?"计算正确":"计算错误");
    }
    private static  void plan3(){
        System.out.println("请输入顾客购买的苹果斤数8元/斤:");
        Scanner sc1 = new Scanner(System.in);
        int num1 = sc1.nextInt();
        System.out.println("请输入顾客购买的草莓斤数13元/斤:");
        Scanner sc2 = new Scanner(System.in);
        int num2 = sc2.nextInt();
        System.out.println("请输入顾客购买的芒果斤数20元/斤:");
        Scanner sc3 = new Scanner(System.in);
        int num3 = sc3.nextInt();
        double sum = num1*8+num2*13*0.8+num3*20;
        System.out.println("顾客购买的商品总价为:"+sum+"元");
        boolean result = bool3(num1,num2,num3,sum);
        System.out.println(result?"计算正确":"计算错误");
    }
    private static  void plan4(){
        System.out.println("请输入顾客购买的苹果斤数8元/斤:");
        Scanner sc1 = new Scanner(System.in);
        int num1 = sc1.nextInt();
        System.out.println("请输入顾客购买的草莓斤数13元/斤:");
        Scanner sc2 = new Scanner(System.in);
        int num2 = sc2.nextInt();
        System.out.println("请输入顾客购买的芒果斤数20元/斤:");
        Scanner sc3 = new Scanner(System.in);
        int num3 = sc3.nextInt();
        double sum = num1*8+num2*13*0.8+num3*20;
        int n = (int) Math.floor(sum/100);
        double sum_finnal = sum-n*10;
        System.out.println("顾客购买的商品总价为:"+sum_finnal+"元");
        boolean result = bool4(num1,num2,num3,sum_finnal);
        System.out.println(result?"计算正确":"计算错误");
    }

    private  static  boolean bool1(int a,int b,int c){
        return c == a*8+b*13;
    }
    private  static  boolean bool2(int a,int b,int c,int d){
        return d == a*8+b*13+c*20;
    }
    private  static  boolean bool3(int a,int b,int c,double d){
        return d == a*8+b*13*0.8+c*20;
    }
    private  static  boolean bool4(int a,int b,int c,double d){
        double sum = a*8+b*13*0.8+c*20;
        int n = (int) Math.floor(sum/100);
        double sum_finnal = sum-n*10;
        return d == sum_finnal;
    }
}
