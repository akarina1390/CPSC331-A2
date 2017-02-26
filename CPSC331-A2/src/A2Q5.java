import java.util.Scanner;
import static java.lang.Integer.parseInt;
import java.util.HashSet;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.math.BigInteger;

/**
 * A class to check for strobogrammatic numbers.
 * 
 * @author Parthasarathi Das
 * @version 1.0
 *
 */
public class A2Q5{
    
    /**
     * Tests if a given string is a strobogrammatic number or not.
     * @param D Character deque to be checked
     * @param str input
     * @return boolean. True if str is a strobogrammatic number and false otherwise.
     */
       
    public static boolean isSGN(BoundedDeque<Character> D, BigInteger bi) { 
        //
        //YOUR IMPLEMENTATION HERE
        //
    	
    	/**
    	 * Precondition:
    	 * 	a) A non negative integer and an instance of a bounded deque as parameters.
    	 * Postcondition:
    	 *  a) Value returned is true if the integer is a strobogrammatic number, and false otherwise.
    	 * 
    	 * @parameters: non-negative integer
    	 * @return: true if the deque is empty
    	 * @exception: An InvalidInputException is thrown if the input is a negative integer.
    	 */	
    	
    	return false;
    }
    
    /**
     * Prints a message describing proper usage with respect to required command line parameters
     * and exits.
     */
    public static void usage() {
    	System.out.println("Usage: java A2Q5 type infile");
        System.out.println("    type - 0 for array deque, linked deque otherwise");    
        System.out.println("    infile - name of input file containing one string per line");
        System.exit(1);
    }
    
    /**
     * A command line interface to the strobogrammatic checker
     * @param args[]
     */
    public static void main(String args[]) {
        //gather command line arguments
        if (args.length != 2) usage();
        
        int type = parseInt(args[0]);
        
        
        // Use a try-catch block to handle any exceptions thrown by
	// reading from the input file
        try{
            // Create a Scanner object to read from the file args[1]
	    //  (in current folder), which will be used to read in lines
	    //  of the input file
            File inputFile = new File(args[1]);
            Scanner in = new Scanner(inputFile);
            
            //read and process each line of input file
            while(in.hasNextLine()) {
                String str = in.nextLine();
                try {
                    //Convert to BigInteger                    
                    BigInteger bi = new BigInteger(str);

		    // Create a BoundedDeque with capacity equal to the
		    // number of digits of the integer
            //BoundedDeque<Character>  D;
            //        if (type == 0)
            //            D = new ArrayBoundedDeque<Character>(str.length());
            //        else
            //            D = new LinkedListBoundedDeque<Character>(str.length());
                    
            //        boolean value = isSGN(D,bi);
            //      System.out.println(value);
                }
                catch (NumberFormatException e) {
           //         System.out.println("Invalid input");
                }
            //    catch(InvalidInputException e) {
           //         System.out.println("Invalid input");
                }
            }
        //}
        //Print a message to standard output if there was a problem
        //opening or processing the input file.
        catch(FileNotFoundException e){
            System.out.println(e);
            System.exit(0);
        }
    }
}