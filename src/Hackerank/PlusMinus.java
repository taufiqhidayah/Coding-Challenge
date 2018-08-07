package Hackerank;

import java.util.Scanner;

public class PlusMinus {
    public static void main(String[] args) {
        int n;
        double zero = 0,min = 0,plus = 0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int [] num = new int[n];
        for (int i = 0; i<n; i++){
            num[i]= scanner.nextInt();
        }
        for (int i = 0; i<n; i++){
            if(num[i]<0 ){
                min+=1;
            }else if(num[i]==0){
                zero+=1;
            }else  if(num[i]>0){
                plus+=1;
            }
        }

        System.out.println(plus/n);
        System.out.println(min/n);
        System.out.println(zero/n);
    }
}
