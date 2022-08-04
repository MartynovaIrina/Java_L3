//Найти сумму элементов на побочной диагонали.

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Classwork2_Task1 {
    public static void main(String[] args) throws IOException {
        Random random = new Random();
        int maxRandomNumber = 20;
        int randomNumber;
        int sumSecondDiagonal = 0;

        Scanner sc = new Scanner(System.in);
        int squareSize = sc.nextInt();
        int lengthOfLine = squareSize - 1;

        sc.close();

        String fileName = "matrixTestOutput";
        String format = ".txt";
        String pathToFile = fileName + format;
        FileWriter writer = new FileWriter(pathToFile);

        writer.write(Integer.toString(squareSize));
        writer.write(" ");
        writer.write(Integer.toString(squareSize));
        writer.write("\n");

        for (int i = 0; i < squareSize; i++) {
            for (int j = 0; j < squareSize; j++) {
                randomNumber = random.nextInt(maxRandomNumber);
                String line = Integer.toString(randomNumber);
                writer.write(line);
                if (i + j + 1 == squareSize){
                    sumSecondDiagonal += randomNumber;
                }
                if (j != lengthOfLine) {
                    writer.write(" ");
                }
            }
            writer.write("\n");
        }
        writer.write(Integer.toString(sumSecondDiagonal));
        writer.close();
    }
}
