import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;
/** 
 * ACS-1904 Lab 2
 * @author  Sveinson
 */

public class Lab25000mTimes{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String skaterName = "";  // search key
        int skaterIndex = -1;   // index of skater search
        int nthTime = -1;       // time search key

        // Prallel arrays
        String[] skaters = {"Peol", "Eskil", "Koss", "Kulizhnikov",
                "Koolman", "Roest","Lunde"};

        double[][] times = {{628.54, 625.34, 628.49},
                {618.95, 628.62},
                {603.73, 629.08, 612.12},
                {602.14, 619.69, 607.98, 613.47},
                {620.77, 604.39, 608.10, 618.36, 638.66},
                {639.94, 630.45, 606.86, 639.44},
                {621.98, 613.47}};

        // get times for a specific skater
        System.out.println("enter a skater name:");
        skaterName = scanner.next();
        //System.out.println("skater to search: " + bandName);

        // get the index of the skater search key
        skaterIndex = getSkaterIndex(skaters, skaterName);
        //System.out.println(bandIndex);

        // print the list of times
        if(skaterIndex >= 0)
            printTimes(times, skaterIndex);
        else
            System.out.println("Skater not found.");

        System.out.println("\n");

        // print the nth time
        System.out.println("Enter the time you want to see.(1-7), 0 to quit");
        nthTime = scanner.nextInt();

        while(nthTime > 0){
            System.out.println("Time #" + nthTime + ":");
            printNthTime(times, skaters, nthTime);

            System.out.println();
            System.out.println("Enter another time.(1-7), or 0 to quit");
            nthTime = scanner.nextInt();
        }// end while

        // end of program message
        System.out.println("\nend of program");
    }//end main
    /*****************************************
     * brief description of the methods purpose
     * 
     * @param        each parameter of the method should be listed with an @param
     * @param        parametername description of parameter
     * 
     * @return       any return value will be noted here
     * ****************************************/

    /*****************************************
     * print the nth time of each skater
     *              if the nth time exists
     * 
     * @param        double[][] w the 2d-array of times
     * @param        Sting[] d array of skaters
     * @param        int n the nth time
     * ****************************************/        
    public static void printNthTime(double[][] w, String[] d, int n){
        for(int i = 0; i < w.length; i++){
            if(w[i].length >= n)
                System.out.println(d[i] + ": " + w[i][n - 1]);
        }// end for
    }// end printNtTime

    /*****************************************
     * print all of the times  of a specific skater

     * @param        double[][] 2d array of times
     * @param        int dIndex index of specific skater
     * ****************************************/    
    public static void printTimes(double[][] w, int dIndex){
        for(int j = 0; j < w[dIndex].length; j++)
            System.out.print(w[dIndex][j] + ", ");

    }// end pirntWins

    /*****************************************
     * return the index of the skater search key
     * 
     * @param        String[] d array of skater names
     * @param        String key skater to search for
     * 
     * @return       int: index of skater search key
     * ****************************************/    
    public static int getSkaterIndex(String[] d, String key){
        int dIndex = -1;
        //System.out.println(key.toLowerCase());
        
        /* an alternative, also acceptable
        ArrayList<String> names = new ArrayList<>();
        Collections.addAll(names, d);
        dIndex = names.indexOf(key);
        end of alternative search for skater index */

        for(int i = 0; i < d.length; i++){
            //System.out.println(d[i].toLowerCase());
            if(d[i].toLowerCase().equals(key.toLowerCase()))
                dIndex = i;
            //System.out.println(dIndex);
        }// end for

        return dIndex;
    }// end getDriverIndex
}
