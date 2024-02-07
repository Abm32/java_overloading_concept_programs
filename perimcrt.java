import java.util.*;
class perimcrt{
    perimcrt(int r){
        System.out.println("Perimeter of circle: "+2*3.14*r);
    }
    perimcrt(int l,int b){
        System.out.println("Perimeter of rectangle: "+2*(l+b));
    }
    public static void main(String[] args){
        perimcrt p = new perimcrt(5);
        perimcrt p1 = new perimcrt(5,6);
    }
}