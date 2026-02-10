/* Create a program that will use some common ArrayList algorithms. In main, create an ArrayList of Integers. 
 Use a for loop to fill the ArrayList with 50 random Integers in the range 0 to 100.  
Create static methods to return the following values:
- The sum of the ArrayList
- The average of the ArrayList
- The maximum value in the ArrayList
- The minimum value in the ArrayList
Call each of the methods in the main method and print out the results.  Be sure to label your output with what each number represents.
  */

import java.util.*;

public class ArrayListHW1 {

  public static int Sums(ArrayList<Integer>arr){
    int sums = 0;    
    for(int i:arr){
            sums+= i;
        }

        return sums;
   }
  public static double Averages(ArrayList<Integer>arr){
    int sums = 0;   
    double averages = 0; 
    for(int i:arr){
            sums+= i;
        }
    averages = (double)(sums)/arr.size();
    return averages;
        
   }
  
  public static int Max(ArrayList<Integer>arr){
    int max = 0;    
    for(int i:arr){
            if(i>max){
              max = i;
            }
        }

        return max;
   }
     public static int Min(ArrayList<Integer>arr){
    int min = arr.get(0);    
    for(int i:arr){
            if(i>min){
              min = i;
            }
        }

        return min;
   }
      public static void main(String[] args) {
    ArrayList<Integer>ints = new ArrayList<>();
    for(int i = 0; i<50; i++){
        ints.add((int)Math.random()*50);
    }

    System.out.println(Sums(ints));
    System.out.println(Averages(ints));
    System.out.println(Max(ints));
    System.out.println(Min(ints));
   }

}
