import java.util.Scanner;

public class fibonnaci{
    
    public static int fibonnaci(int x){
        if(x == 0){
            return 0;
        }
        else if (x == 1){
            return 1;
        }
        else{
            return fibonnaci(x-1)+fibonnaci(x-2); 
        }
    }
    
    public static void main (String[] args){
        Scanner keyboard= new Scanner(System.in);
        
        System.out.println("Please input the fibonnaci number that you wish to find");
        
        int number= keyboard.nextInt();
        
        int b = fibonnaci(number);
        
        System.out.println(b);
        
        
    }
    
    
}