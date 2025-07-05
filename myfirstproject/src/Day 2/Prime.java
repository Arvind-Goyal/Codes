import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter a number:");
        num = sc.nextInt();
        boolean isPrime = true;
        if (num ==1 || num ==0) {
            System.out.println("Neither Prime nor Composite");
        }
        else if(num == 2){
            System.out.println("Prime number");
        }
        else if(num%2 ==0){
            System.out.println("Not a Prime Number");
        }
        
        else{
            for(int i=3;i<=Math.sqrt(num);i=i+2){
            if(num%i == 0){
                System.out.println("Not a Prime number");
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println("Prime Number");
        }
        }
        
    }
}
