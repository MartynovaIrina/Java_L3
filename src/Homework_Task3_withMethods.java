//Бинарный поиск.

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Homework_Task3_withMethods {
    public static int[] array;
    public static int sizeOfArray;
    public static FileReader reader;
    public static Scanner scanner;

    public static void main(String[] args) throws IOException {
        fillTheArray();
        binarySearch();
    }

    public static void fillTheArray() throws IOException{
        String path = "src/";
        String fileName = "inputTestBinarySearch";
        String format = ".txt";
        String pathToFile = path + fileName + format;

        reader = new FileReader(pathToFile);
        scanner = new Scanner(reader);
        sizeOfArray = scanner.nextInt();
        array = new int[sizeOfArray];

        for(int i = 0; i < sizeOfArray; i++) {
            array[i] = scanner.nextInt();
        }
    }
    public static void binarySearch() throws IOException{
        int low = 0;
        int high = array.length - 1;
        int mid;
        int guess;
        int element = scanner.nextInt();
        boolean isElementInTheArray = false;

        reader.close();
        scanner.close();

        while (low <= high){
            mid = (low + high) / 2;
            guess = array[mid];
            if (guess == element){
                System.out.println("The element " + element + " in the array.");
                isElementInTheArray = true;
                break;
            }
            if (guess > element){
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        if (!isElementInTheArray){
            System.out.println("There is no such element.");
        }
    }
}