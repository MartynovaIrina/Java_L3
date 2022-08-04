//Найти среднее значение элементов массива.

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Classwork1_Task4 {
    public static void main(String[] args) {
        String path = "src/";
        String fileName = "inputTest";
        String format = ".txt";
        String pathToFile = path + fileName + format;

        try {
            FileReader reader = new FileReader(pathToFile);
            Scanner scanner = new Scanner(reader);
            int sizeOfArray = scanner.nextInt();
            int[] array = new int[sizeOfArray];

            for(int i = 0; i < sizeOfArray; i++) {
                array[i] = scanner.nextInt();
            }

            int sumArray = 0;

            for(int i = 0; i < sizeOfArray; ++i) {
                sumArray += array[i];
            }
            int averageResult = sumArray/sizeOfArray;

            System.out.println("Average amount is: " + averageResult);
        } catch (FileNotFoundException var11) {
            var11.printStackTrace();
        }
    }
}
