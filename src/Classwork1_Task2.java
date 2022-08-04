//Найти минимум в массиве.
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Classwork1_Task2 {
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

            int min = Integer.MAX_VALUE;

            for(int i = 0; i < sizeOfArray; ++i) {
                if (array[i] < min) {
                    min = array[i];
                }
            }

            System.out.println("Minimum element in the given array is " + min);
        } catch (FileNotFoundException var11) {
            var11.printStackTrace();
        }
    }
}