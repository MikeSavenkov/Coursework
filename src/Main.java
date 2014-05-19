
/**
 * Created by mikesavenkov on 4/21/14.
 */
/**
 * Created with IntelliJ IDEA.
 * User: Ирина
 * Date: 13.04.14
 * Time: 19:07
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String [] args) {
       /* byte a;
        int b;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите дестичное число: ");
        a = in.nextByte();
        binar(a);
        invert(a);
        first(a); */
        //multiplication(false,false,false,false,false,true,false,true,
                //false,false,false,false,false,true,true,true);
        //plus3(false,false,false,false,false,true,false,true,
             //false,false,false,false,false,true,true,true);
        //minus(false,false,false,false,false,true,true,true,
                //false,false,false,false,false,false,false,true);
    }
    public static void binar(int a){
        int b;
        String temp = "";
        while(a !=0){
            b = a%2;
            temp = b + temp;
            a = a/2;
        } System.out.println("Двоичное представление введенного числа"+temp);
    }
    private static void invert(byte a) {
        int b;
        b = ~a;
        String c = Integer.toBinaryString(b);
        System.out.print("Инвертированное число"+c);
    }
    private static void first(byte a){
        int b;
        binar(a);
        invert(a);
        System.out.print(a);

    }
    private static void second(byte a){
        int b;
        binar(a);
        invert(a);
        b =a++;
        System.out.println(b);
    }


    public static void plus3(boolean a8,boolean a7,boolean a6, boolean a5, boolean a4, boolean a3, boolean a2, boolean a1,
                            boolean b8, boolean b7, boolean b6, boolean b5, boolean b4, boolean b3, boolean b2, boolean b1){
        boolean c1,c2,c3,c4,c5,c6,c7,c8;
        boolean a[]={a1,a2,a3,a4,a5,a6,a7,a8};
        boolean b[]={b1,b2,b3,b4,b5,b6,b7,b8};
        boolean c[]={c1=false,c2=false,c3=false,c4=false,c5=false,c6=false,c7=false,c8=false};
        boolean d=false;

        for(int i=0; i<=c.length+1; i++){
            c[i]=a[i]^b[i];
            b[i]=false;
            b[i+1]=a[i]&b[i];
            a[i]=c[i];
        }

        for(int i=0; i<=c.length; i++){
            System.out.print(a[i] ? 1:0);
        }
    }

    public static void plus(boolean a8,boolean a7,boolean a6, boolean a5, boolean a4, boolean a3, boolean a2, boolean a1,
                            boolean b8, boolean b7, boolean b6, boolean b5, boolean b4, boolean b3, boolean b2, boolean b1){
        boolean c1,c2,c3,c4,c5,c6,c7,c8;
        boolean a[]={a1,a2,a3,a4,a5,a6,a7,a8};
        boolean b[]={b1,b2,b3,b4,b5,b6,b7,b8};
        boolean c[]={c1=false,c2=false,c3=false,c4=false,c5=false,c6=false,c7=false,c8=false};
        boolean d=false;

        for(int i=0; i<c.length; i++){
            boolean k=a[i]^b[i];
            c[i] = k^d;
            d = a[i] & b[i];
            System.out.print(c[i] ? 1:0);
        }
    }

    public static void minus (boolean a1,boolean a2,boolean a3, boolean a4, boolean a5, boolean a6, boolean a7, boolean a8,
                              boolean b8, boolean b7, boolean b6, boolean b5, boolean b4, boolean b3, boolean b2, boolean b1) {
        int c1, c2, c3, c4, c5, c6, c7, c8;
        boolean a[] = {a1, a2, a3, a4, a5, a6, a7, a8};
        boolean b[] = {b1, b2, b3, b4, b5, b6, b7, b8};
        int c[] = {c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0, c6 = 0, c7 = 0, c8 = 0};
        //boolean d = false;
        for(int i=0; i<c.length; i++){
            int f=~(b[i]?1:0);
            f++;
            c[i] = (a[i] ? 1:0)^f;
            System.out.print(c[i]);
        }
    }
    public static void multiplication (boolean a8,boolean a7,boolean a6, boolean a5, boolean a4, boolean a3, boolean a2, boolean a1,
                                       boolean b8, boolean b7, boolean b6, boolean b5, boolean b4, boolean b3, boolean b2, boolean b1){
        int c1, c2, c3, c4, c5, c6, c7, c8;
        boolean a[] = {a1, a2, a3, a4, a5, a6, a7, a8};
        boolean b[] = {b1, b2, b3, b4, b5, b6, b7, b8};
        int c[] = {c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0, c6 = 0, c7 = 0, c8 = 0};
        int sum = 0;
        for (int i=0; i<c.length; i++) {
            for(int j=8; j<c.length; j--) {
                sum = (a[j]?1:0)&(b[i]?1:0);

                //c[j] = c[j]^c[j-1];
                System.out.print(sum);
            }
        }
    }
}
