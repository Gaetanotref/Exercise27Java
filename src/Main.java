public class Main {
    public static void main(String[] args) {
    /*
    [A]: considering that a=1, b=3, c=a*b, d=c: (d / c + 2) >= b || !(c + b - c / a == 3)
    [B]: considering that x=5, y=6, t=false and f=true: (x * x - y * y / 2 != 12) || !t && f
     */

        //A True
        int a =1;
        int b = 3;
        int c= a*b;
        int d=c;

        boolean A= (d / c + 2) >= b || !(c + b - c / a == 3);

        //B True
        int x=5;
        int y=6;
        boolean t=false;
        boolean f=true;
        boolean B = (x * x - y * y / 2 != 12) || !t && f;


        System.out.println("A is "+A);
        System.out.println("B is "+B);
    }
}