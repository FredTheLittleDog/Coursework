// Project2.java
 
import java.io.*; // BufferedReader
import java.util.*; // Scanner
 
public class Project2
{
    public static void main (String args[]) throws Exception
    {
        // ALWAYS TEST FIRST TO VERIFY USER PUT REQUIRED CMD ARGS
        if (args.length < 3)
        {
            System.out.println("\nusage: C:\\> java Project2 <input file name> <lo>  <hi>\n\n"); 
            // i.e. C:\> java Project2 P2input.txt 1 30
            System.exit(0);
        }
        String infileName = args[0]; // i.e. L2input.txt
        int lo = Integer.parseInt( args[1] );   // i.e. 1
        int hi = Integer.parseInt( args[2] );   // i.e. 30
 
        // STEP #1: OPEN THE INPUT FILE AND COMPUTE THE MIN AND MAX. NO OUTPUT STATMENTS ALLOWED
        Scanner infile = new Scanner( new File(infileName) );
        int min,max;
        min=max=infile.nextInt(); // WE ASSUME INPUT FILE HAS AT LEAST ONE VALUE
        while ( infile.hasNextInt() )
        {
            int next=infile.nextInt();
             
            if(Math.abs(next-(min+max)/2)-(max-min)/2>0)
                if(next>max)
                    max=next;
                else if(next<min)
                    min=next;
 
            // YOUR CODE HERE FIND THE MIN AND MAX VALUES OF THE FILE
            // USING THE LEAST POSSIBLE NUMBER OF COMPARISONS
            // ASSIGN CORRECT VALUES INTO min & max INTHIS LOOP. 
            // MY CODE BELOW WILL FORMAT THEM TO THE SCREEN
            // DO NOT WRITE ANY OUTPUT TO THE SCREEN
        }
        System.out.format("min: %d max: %d\n",min,max); // DO NOT REMOVE OR MODIFY IN ANY WAY
 
 
        // STEP #2: DO NOT MODIFY THIS BLOCK
        // TEST EVERY NUMBER BETWEEN LO AND HI INCLUSIVE FOR
        // BEING PRIME AND/OR BEING PERFECT 
        for ( int i=lo ; i<=hi ; ++i)
        {
            System.out.print( i );
            if ( isPrime(i) ) System.out.print( " prime ");
            if ( isPerfect(i) ) System.out.print( " perfect ");
            System.out.println();
        }
    } // END MAIN
     
    // *************** YOU FILL IN THE METHODS BELOW **********************
     
    // RETURNs true if and only if the number passed in is perfect
    static boolean isPerfect( int n )
    {   
        boolean result=false;   
        int  total=0;   
        for(int i=1;i<=(n/2);i++)
            if(n%i==0)
                total+=i;
        if(n==total)
            result=true;
         
        return result;
    }
    // RETURNs true if and only if the number passed in is prime
    static boolean isPrime( int n )
    {   
        boolean result=true;
        if(n==1)
            result=false;
 
        for(int i=2;i<=(n/2);i+=1)
                if(n%i==0) result=false;
        return result;
    }
 
} // END PROJECT2 CLASS
