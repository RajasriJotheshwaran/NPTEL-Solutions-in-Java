/*Complete the code segment to find the perimeter and area of a circle given a value of radius.
You should use Math.PI constant in your program. If radius is zero or less than zero then print
" please enter non zero positive number ".*/
package Nptel1.Week1;
import java.util.Scanner;
public class Question1 {
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        double r= s.nextDouble();
        double Perimeter,Area;
        s.close();
        if(r<=0){
            System.out.println("please enter non zero positive number");
        }
        else{
            //Calculate the perimeter 
            Perimeter= 2*Math.PI*r;
            System.out.println(Perimeter);
            //Calculate the area 
            Area=Math.PI*r*r;
            System.out.println(Area);
        }
    }
    
}
