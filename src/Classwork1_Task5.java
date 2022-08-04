//Проверить, присутствует ли элемент в отсортированном массиве.

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Classwork1_Task5 {
    public static void main(String[] args) throws IOException {
        String path = "src/";
        String fileName = "inputTest";
        String format = ".txt";
        String pathToFile = path + fileName + format;

        FileReader reader = new FileReader(pathToFile);
        Scanner scanner = new Scanner(reader);
        int elementToFind = scanner.nextInt();
        int sizeOfArray = scanner.nextInt();
        //int[] array = new int[sizeOfArray];
        boolean elementPresent = true;
        int currElement;

        for (int i = 0; i < sizeOfArray; i++) {
            currElement = scanner.nextInt();
            //array[i] = currElement;
            if (currElement == elementToFind){
                System.out.println("Here is your element!");
                elementPresent = false;
                break;
            }
        }
        if (elementPresent){
            System.out.println("There is no such element in the array.");
        }
        reader.close();
        scanner.close();
    }
}
