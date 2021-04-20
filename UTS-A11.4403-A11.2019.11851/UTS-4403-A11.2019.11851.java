package uts;
import java.util.Scanner;

public class UTS {
    private static boolean Palindroms(int N){
         Scanner input=new Scanner(System.in);
         boolean pal;
         int i,j;
         String []A=new String[N];
         System.out.println("Masukkan karakter :");
         for(i=0;i<N;i++){
             System.out.print("Karakter ke-"+i+":\t");
             A[i]=input.next();
         }
         i=0;
         j=N-1;
         pal=true;
         while(i<= j && pal){
             if(!A[i].equals(A[j])){
                 pal=false;
             }
             i++;
             j--;
         }
         return pal;
    }
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int N;
        System.out.print("Masukkan banyak Karakter :\t");
        N=input.nextInt();
        if(Palindroms(N)){
            System.out.println("Karakter Palindrom!!!");
        }
        else{
            System.out.println("Bukan Karakter Palindrom!!!");
        }
    }
    
}