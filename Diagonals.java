import java.util.Scanner;
import java.util.Random;

/** 
 * ACS-1904 Assignment X Question Y
 * @author 
 */

public class Diagonals{
    public static void main(String[] args) {
        final int ROWS = 15;
        final int COLUMNS = 15;
        int n = 0;


        int table[][] = new int[ROWS][COLUMNS];

        fillTable(table, ROWS, COLUMNS, n);
        // set the diagonals to 1
        fillDiagonal(table, ROWS, COLUMNS, 1);
        
        // Print the table so we can verify that the diagonals have been set correctly
        printTable(table, ROWS, COLUMNS);

        System.out.println("end of program");
    }


    public static void fillDiagonal(int[][] t, int rows, int columns, int filler){
        for(int i = 0; i < rows; i++){
            t[i][i] = filler;
            t[i][columns - 1 - i] = filler;
        }// end i
    }
    public static void fillTable(int[][] t, int rows, int columns, int value){
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                t[i][j] = value;
            }// end for j
        }// end for i
    }
    
    public static void loadTable(int[][] t, int rows, int columns){
    
        Random r = new Random();
        
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                t[i][j] = r.nextInt(10) + 1;
            }// end for j
        }// end for i    
    }// end load tab le

    public static void printList(int[] list, int size){
        for(int i = 0; i < size; i++){
            System.out.println(list[i]);
        }//end i
    }// end print list

    public static void printTable(int[][] t, int r, int c){
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                System.out.print(t[i][j] + " ");
            }// end j
            System.out.println();
        }//end i
    }// end printtable
}
