//Вывод массива в обратном порядке.

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Homework_Task1 {
    public static void main(String[] args) throws IOException{
        String path = "src/";
        String fileName = "inputTestArray";
        String format = ".txt";
        String pathToFile = path + fileName + format;

        FileReader reader = new FileReader(pathToFile);
        Scanner scanner = new Scanner(reader);

        int sizeOfArray = scanner.nextInt();
        int[] array = new int[sizeOfArray];

        //getting array
        for(int i = 0; i < sizeOfArray; i++) {
            array[i] = scanner.nextInt();
        }

        reader.close();
        scanner.close();

        //printing out array in the reverse order
        int lastElement = sizeOfArray - 1;
        for(int i = lastElement; i >= 0; i--) {
            System.out.print(array[i]);
            if (i != 0){
                System.out.print(" ");
            }
        }
    }
}
