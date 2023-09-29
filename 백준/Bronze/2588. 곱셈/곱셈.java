import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        long Sum = 0;
        
        for(int i=0; i<3; i++){
            Sum += A * (B%10) * Math.pow(10, i);
            System.out.println(A * (B%10));
            B /= 10;
        }
        System.out.println(Sum);
    }
}