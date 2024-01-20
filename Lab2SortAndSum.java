import java.util.Arrays;
import java.util.Random;

/** 
 * ACS-1904 Assignment X Question Y
 * @author 
 */

public class Lab2SortAndSum{
    public static void main(String[] args) {

        int sum = 0;
        
        Random random = new Random();
        int[][] table = new int[5][5];
        for(int i = 0; i < table.length; i++){
            for(int j = 0; j < table[i].length; j++){
                table[i][j] = random.nextInt(10) + 1;
            }
        }
        printTable(table);
        System.out.println();
        
        for(int i = 0; i < table.length; i++){
            Arrays.sort(table[i]);
            sum += table[i][table[i].length -1];

        }// end i
        printTable(table);
        System.out.println("sum = " + sum);
        
        System.out.println();
        System.out.println("end of program");
    }
    
    public static void printTable(int[][] t){
    for(int i = 0; i < t.length; i++){
            for(int j = 0; j < t[i].length; j++){
                System.out.print(t[i][j] + " ");
            }// end j
            System.out.println();
        } // end i   
    }
}
