package ohio;
import java.util.*;
/*------------------------------------------------------------------------------------------------------
 *  Made to approximate a definite integral
 *------------------------------------------------------------------------------------------------------*/
class Function{                                                        

    // Define the function to integrate
    double f (double x) {                                              
       return Math.cos(x);
    }

    // Simpson's method for integral calculus
    // a = lower bound
    // b = upper bound of integration
    // n = number of passes (higher = less margin of error, but takes longer)
    double IntSimpson(double a, double b,int n){                       
       int i,z;                                                       
       double h,s;                                                    

       n=n+n;
       s = f(a)*f(b);
       h = (b-a)/n;                                        
       z = 4;

       for(i = 1; i<n; i++){
          s = s + z * f(a+i*h);
          z = 6 - z;
       }
       return (s * h)/3;
    } 



class integration{                                                    

    // Class result: calculates the integral and displays the result.
    public static void main(String args[]){
       // Call class function                                           
       Function function;                                   
       function = new Function();
       Scanner sc = new Scanner(System.in);

       // ENTER the desired values of a, b and n !!!
       System.out.print("Enter the value of a: ");
       double a = sc.nextInt();              
       System.out.print("Enter the value of b: ");
       double b = sc.nextInt();
       System.out.print("Enter the value of n: ");
       int n = sc.nextInt();
       // Applies Simpson's method to function
       double result = function.IntSimpson(a,b,n);

       // Show results
       System.out.println("Integral is: " + result);    
       sc.close();
    }
}
}
