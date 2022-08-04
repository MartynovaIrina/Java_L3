import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

//Посчитать, сколько раз число встречалось в массиве (*).
public class Classwork1_Task1 {
    public static void main(String[] args) throws IOException {
        String path = "src/";
        String fileName = "inputTest";
        String format = ".txt";
        String pathToFile = path + fileName + format;
        FileReader reader = new FileReader(pathToFile);
        Scanner scanner = new Scanner(reader);
        int sizeOfArray = scanner.nextInt();
        int[] array = new int[sizeOfArray];
        int maxElementInArray = 10; //starting from 0
        int[] arrayAnswer = new int[maxElementInArray];

        for(int i = 0; i < sizeOfArray; i++) {
            array[i] = scanner.nextInt();
            System.out.println(array[i]);
            arrayAnswer[array[i]] = arrayAnswer[array[i]] + 1;
        }
        for(int i = 0; i < arrayAnswer.length; i++){
            if (arrayAnswer[i] != 0) {
                System.out.println("Number " + i + " repeats " + arrayAnswer[i]);
            }
        }
        reader.close();
        scanner.close();
    }
}
