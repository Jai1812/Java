import java.util.*;
public class loops {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number : ");
        int n = sc.nextInt();
        boolean prime = true;
        for (int i = 2 ; i<= Math.sqrt(n); i++){
            if(n%i==0){
                prime = false;
            }
        }
        if(prime == true){
            System.out.println("number is prime");
        }
        else{
            System.out.println("number is not prime");
        }
    }
    
}
