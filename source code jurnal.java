package jurnalno1;

import java.util.Scanner;
/**
 *
 * @author Praktikan 6706154161
 */
public class Jurnalno1 {
  public static void main(String[]args) {
        Scanner show = new Scanner(System.in);
        System.out.print("Masukan Jumlah Deret Fibonacci : ");
        int n = show.nextInt();
        long fib[] = new long[n];
         
        fib[0] = 0;
        fib[1] = 1;
         
        for(int i = 2; i < n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
         
        for (int i = 0; i < n; i++) {
            System.out.print(fib[i] +  " ");
        }
  }
  
  public static void mengambilSpecialKarakter(String kalimat){
        String kalimatBaru = kalimat.replaceAll("[a-zA-Z0-9 ]*", "");
        System.out.println("Spesial Karakter : " + kalimatBaru);
        String [] splitKalimat = kalimatBaru.split("");
        System.out.println("Jumlah special karakter : " + splitKalimat.length);
        
    }

}
