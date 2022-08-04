//Найти сумму элементов лежащих выше главной диагонали матрицы (не вкл элементы главной диагонали).

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Classwork2_Task3 {
    public static void main(String[] args) throws IOException {

        int minNumberInLine;
        int minNumberInLineColumn;
        int counterForMaxElement = 0;

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

        boolean toPrint = true;
        //reading matrix and looking for the point
        for (int i = 0; i < numberOfRows; i++) {
            minNumberInLine = Integer.MAX_VALUE;
            minNumberInLineColumn = 0;
            counterForMaxElement = 0;
            toPrint = true;
            for (int j = 0; j < numberOfColumns; j++) {
                if (matrix[i][j] < minNumberInLine){
                    minNumberInLine = matrix[i][j];
                    minNumberInLineColumn = j;
                }
                //action upon last element in the row
                outer:
                if (j == numberOfColumns - 1){
                    for (int k = 0; k < numberOfRows; k++){
                        if (matrix[k][minNumberInLineColumn] != matrix[i][minNumberInLineColumn] & matrix[k][minNumberInLineColumn] >= matrix[i][minNumberInLineColumn]){
                            counterForMaxElement++;
                        }
                        if (counterForMaxElement > 0){
                            toPrint = false;
                            break outer;
                        }
                    }
                }
                }
            if (counterForMaxElement == 0 & toPrint){
                System.out.println("The point is:\n" + "row: " + i + "\n" + "column: " + minNumberInLineColumn + "\n" + "price: " + matrix[i][minNumberInLineColumn]);
            }
        }
        if (!toPrint){
                System.out.println("There is no such point.");
        }
    }
}
