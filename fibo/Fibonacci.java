import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * Compter et afficher les N premiers nombres Fibonacci.
 */
public class Fibonacci {

  public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     int N = sc.nextInt();

     //afficher les N premiers nombre Fibonacci
     for(int i = 1 ; i <= N ; i++)//commencer de n=1
        System.out.println(i + ": " + fib(i));
  }

  private static int fib(int n) {
     if (n <= 1) return n;
     else return fib(n-1) + fib(n-2);
  }   
}