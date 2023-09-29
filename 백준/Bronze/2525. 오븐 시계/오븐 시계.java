import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        //시
        int A = sc.nextInt();
        //분
        int B = sc.nextInt();
        //소요시간
        int C = sc.nextInt();
        
        B = 60 * A + B;
        B += C;
        
        A = (B/60)%24;
        B = B%60;
        
        System.out.print(A + " " + B);
    }
}