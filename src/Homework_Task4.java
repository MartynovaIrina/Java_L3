//Задача сапёр (*)
//https://acmp.ru/index.asp?main=task&id_task=234

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Homework_Task4 {
    public static void main(String[] args) throws IOException{

        String fileName = "INPUT";
        String format = ".TXT";
        String pathToFile = fileName + format;

        FileReader reader = new FileReader(pathToFile);
        Scanner sc = new Scanner(reader);
        int numberOfRows = sc.nextInt();
        int numberOfColumns = sc.nextInt();
        int numberOfMines = sc.nextInt();

        int matrix[][] = new int[numberOfRows + 2][numberOfColumns + 2]; //+2 for buffer lines alongside the rin

        int currRow;
        int currColumn;
        for (int i = 0; i < numberOfMines; i++){
            currRow = sc.nextInt();
            currColumn = sc.nextInt();
            matrix[currRow][currColumn] = -1;
        }
        reader.close();
        sc.close();

        int currMines = 0;
        int[] row_dx = {-1, 0, 1};
        int[] column_dx = {-1, 0, 1};
        int neighbour;

        //counting mines
        //dx - for possible neighbour combinations
        for (int i = 1; i < numberOfRows + 1; i++) {
            for (int j = 1; j < numberOfColumns + 1; j++) {
                currMines = 0;
                if (matrix[i][j] != -1){
                    for (int rowCurr : row_dx){
                        for (int columnCurr :column_dx){
                            neighbour = matrix[i + rowCurr][j + columnCurr];
                            if (neighbour == -1){
                                currMines++;
                            }
                        }
                    }
                    matrix[i][j] = currMines;
                }
            }
        }

        //printing out the field
            for (int i = 1; i < numberOfRows + 1; i++) {
                for (int j = 1; j < numberOfColumns + 1; j++) {
                    if (matrix[i][j] == -1) {
                        System.out.print("*");
                    } else if (matrix[i][j] == 0) {
                        System.out.print(".");
                    } else {
                        System.out.print(matrix[i][j]);
                    }
                }
                System.out.println();
        }
    }
}
