
import java.util.Scanner;

public class PowerOf10 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        while(sc.hasNext()){
            int n = sc.nextInt();
            findPower(n);
//            int q =(int) Math.log10(n);
//            if(Math.pow(10,q)==n)
//                System.out.println("its 10 power of "+ q);
//            else
//                System.out.println("not a power of 10");



        }
    }

    private static void findPower(int n) {
        while(n>9 && n%10==0){
            n/=10;
        }

        if(n==1) System.out.println("its 10 power of ");
        else System.out.println("not a power of 10");
    }
}
