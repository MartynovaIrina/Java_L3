//Сортировка массива пузырьком

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Homework_Task2 {
    public static void main(String[] args) throws IOException {
        String path = "src/";
        String fileName = "inputTestArray";
        String format = ".txt";
        String pathToFile = path + fileName + format;

        FileReader reader = new FileReader(pathToFile);
        Scanner scanner = new Scanner(reader);

        int sizeOfArray = scanner.nextInt();
        int[] array = new int[sizeOfArray];

        for(int i = 0; i < sizeOfArray; i++) {
            array[i] = scanner.nextInt();
        }

        reader.close();
        scanner.close();

        //bubble sort
        int temp;
        for(int i = 0; i < sizeOfArray; i++){
            for(int j = 0; j < sizeOfArray - i - 1; j++){
                if (array[j] > array[j + 1]){
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                 }
            }
        }
        for(int i = 0; i < sizeOfArray; i++) {
            System.out.print(array[i]);
            if (i != sizeOfArray - 1){System.out.print(" ");}
        }
    }
}
