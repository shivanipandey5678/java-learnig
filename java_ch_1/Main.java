 public class Main {
//   public static void main(String[] args) {
//     System.out.println("Hello world!");
//   }

// }

//variables in java
import java.util.*;
public class Main {
  public static void main(String args[]) {
    int a = 10;
    int b = 20;
    System.out.println(a + b);
    String name = "shivu";
    System.out.println(name);
    a = 60;
    System.out.println(a);
    a = b;
    System.out.println(a);

    // type promotion in java(only occur in expressions)
    char c = 'a';
    short d = 50;
    System.out.println((int) (c));
    System.out.print(c + d);

    // lossy conversion(not posible to con)
   
    short e = 5;
    byte f = 25;
    char g = 'c';
    int sum = e + f + g; // Store the sum in an int
    byte bt = (byte) sum; // Then cast it to byte
    System.out.println("ans:" + bt);

    int h=10;
    float i=20.25f;
    long j=25;
    double k=30;
    int ans2=a+b+c+d;
    System.out.println(ans2);
    
    // some common mistake(type promotion occue and it will 
     // convert byte to int)
    // byte l=5;
    // l=l*2;
    // how to correct above code
     byte l=5;
    byte m=(byte)(l*2);
    System.out.println(m);


    // type conversion byte-->short-->float-->long-->double
     // smaller to bigger data type mei conversion easy hai automatic ho jata h 


    //input taking
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int o=sc.nextInt();
    int sumi=n+o;
    System.out.println(sumi);
    
      
  }
}
