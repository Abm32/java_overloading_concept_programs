class box{
    int l,b,h;
    box(int l,int b,int h){
        this.l = l;
        this.b = b;
        this.h = h;
        int v = l*b*h;
        System.out.println("volume: "+v);
    }
    public static void main(String args[]){
        box b = new box(2,3,4);
    }
}