//Вывод матрицы в обратном порядке.

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Homework_Task1_v2_withMatrix {
    public static void main(String[] args) throws IOException{
        String path = "src/";
        String fileName = "inputTest";
        String format = ".txt";
        String pathToFile = path + fileName + format;

        FileReader reader = new FileReader(pathToFile);
        Scanner sc = new Scanner(reader);
        int numberOfRows = sc.nextInt();
        int numberOfColumns = sc.nextInt();

        int matrix[][] = new int[numberOfRows][numberOfColumns];
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        reader.close();
        sc.close();

        int lastRow = numberOfRows - 1;
        int lastColumn = numberOfColumns - 1;
        //printing out the array in the reverse order
        for (int i = lastRow; i >= 0; i--) {
            for (int j = lastColumn; j >= 0; j--){
                System.out.print(matrix[i][j]);
                if (i != numberOfColumns) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
