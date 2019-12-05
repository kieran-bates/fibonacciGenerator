/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fibonaccigenerator;

/**
 *
 * @author kibat6204
 */
import java.util.Scanner;
public class FibonacciGenerator {

    /**
     * @param args the command line arguments
     */
    
    public static void fibonacciGenerator(int input)
    {
        int[]numbers = new int[input];
        
        int termThree = 2;
        
        numbers[0] = 0;
        numbers[1] = 1;
        for(int i = 0; i<input-2; i++)
        {
            numbers[termThree] = numbers[termThree - 1]+numbers[termThree - 2];
            termThree = termThree+1;
        }
        int count = 0;
        for(int i = 0; i<input; i++);
        {
            System.out.println(numbers[count]);
            count = count + 1;
        }
    }
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("***FIBONACCI GENERATOR***");
        System.out.print("\nHow many terms would you like to generate? -->");
        int terms = input.nextInt();
        fibonacciGenerator(terms);
    }
    
}
