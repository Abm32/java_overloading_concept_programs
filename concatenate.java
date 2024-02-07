import java.util.*;
class concatenate{
    concatenate(int a, int b){
        System.out.println("Concatenated value: "+a+b);
    }
    concatenate(String a, String b){
        System.out.println("Concatenated value: "+a+b);
    }
    public static void main(String[] args){
        concatenate c = new concatenate(5,6);
        concatenate c1 = new concatenate("Hello ","World");
    }
}