package Digui;

import java.util.Scanner;

public class Shuru {
    public static void main(String[] args) {
        System.out.println("输入递归的值");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextByte();
        DiGui s=new DiGui();

        s.digui(n);
        System.out.println(s.digui(n));


    }

}
