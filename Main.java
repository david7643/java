import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
          int sum=scan.nextInt();
            int a=0;
             int b=0;
            int v=sum;
          for(int i=0;i<sum;i++){
               for(int k=0;k<v;k++){
                       System.out.print(" ");
                   }
               for(int j=0;j<=a;j++){
                   System.out.print("*");
              }
              if(b==sum)
                  break;
              else {
                  a+=2;
                  b++;
                  v-=1;
                  System.out.println("");
                  continue;
              }
          }
        }
    }