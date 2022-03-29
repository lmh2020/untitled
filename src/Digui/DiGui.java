package Digui;

public class DiGui {
    public static double digui(int n) {
        if (n==0){
            return 1;
        }
        if (n==1){
            return n;
        }else {
            return n*digui(n-1);
        }
    }
}
