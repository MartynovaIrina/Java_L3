//Найти максимальный элемент матрицы.

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Classwork2_Task2 {
    public static void main(String[] args) throws IOException {
        Random random = new Random();
        int randomNumber;
        int maxNumber = Integer.MIN_VALUE;

        String fileName = "matrixTestOutput";
        String format = ".txt";
        String pathToFile = fileName + format;
        FileWriter writer = new FileWriter(pathToFile);

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of rows");
        int numberOfRows = sc.nextInt();
        System.out.println("Please enter the number of columns");
        int numberOfColumns = sc.nextInt();
        System.out.println("Please enter a random possible number");
        int maxRandomNumber = sc.nextInt();

        writer.write(Integer.toString(numberOfRows));
        writer.write(" ");
        writer.write(Integer.toString(numberOfColumns));
        writer.write("\n");

        sc.close();

        for (int j = 1; j <= numberOfRows; j++) {
            for (int i = 1; i <= numberOfColumns; i++) {
                randomNumber = random.nextInt(maxRandomNumber);
                String line = Integer.toString(randomNumber);
                writer.write(line);
                if (i != numberOfColumns) {
                    writer.write(" ");
                }
                if (randomNumber > maxNumber){
                    maxNumber = randomNumber;
                }
            }
            writer.write("\n");
        }
        writer.write(Integer.toString(maxNumber));
        writer.close();
    }
}
