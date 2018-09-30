import java.util.Scanner;

public class fibonnaci{
    //this will take forever to compile the second the number gets a tiny bit bigger such as 100
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
        //calling onto the scanner for the input from the user
        int number= keyboard.nextInt();
        int b = fibonnaci(number);
        //test out this code for integers 5, 35, 45, 100. Compiling time would vastly vary
        System.out.println(b);
        
        
    }
    
    
}