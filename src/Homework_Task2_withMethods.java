//Сортировка массива пузырьком

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Homework_Task2_withMethods {
    public static int[] array;
    public static int sizeOfArray;

    public static void main(String[] args) throws IOException{
        fillTheArray();
        bubbleSort();
        printArray();
    }

    public static void fillTheArray() throws IOException{
        String path = "src/";
        String fileName = "inputTestArray";
        String format = ".txt";
        String pathToFile = path + fileName + format;

        FileReader reader = new FileReader(pathToFile);
        Scanner scanner = new Scanner(reader);
        sizeOfArray = scanner.nextInt();
        array = new int[sizeOfArray];

        for(int i = 0; i < sizeOfArray; i++) {
            array[i] = scanner.nextInt();
        }
        reader.close();
        scanner.close();
    }

    public static void bubbleSort(){
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
    }

    public static void printArray(){
        for(int i = 0; i < sizeOfArray; i++) {
            System.out.print(array[i]);
            if (i != sizeOfArray - 1){
                System.out.print(" ");
            }
        }
    }
}
