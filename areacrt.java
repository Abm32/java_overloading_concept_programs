import java.util.*;
class areacrt{
    double area(int r){
        return 3.14*r*r;
    }
    double area(int l,int b){
        return l*b;
    }
    double area(int a, int b, int c){
        int s = a+b+c/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    public static void main(String[] args){
        areacrt a = new areacrt();
        System.out.println(a.area(5));
        System.out.println(a.area(5,6));
        System.out.println(a.area(5,6,7));
    }
}