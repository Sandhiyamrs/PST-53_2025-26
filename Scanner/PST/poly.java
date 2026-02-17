//method overloading

package PST;

public class poly {

    public static void main(String[] args) {
        method();
    }

    public static void method() {
        int a=11,b=13,c=15;
        
        System.out.println(method1(a,b));
        System.out.println(method1(a,b,c));
        
    }

    public static int method1(int a,int b) {
      
        return a+b;
    }
    public static int method1(int a,int b,int c) {
       
        return a+b+c;
    }
}