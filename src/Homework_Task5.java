/*
Вывод массива по спирали (*).
На вход подаётся одно число n = размеру квадратной матрицы,
на выходе должен получиться массив из чисел от 1 до n выведенный по спирали.
 */

import java.io.IOException;
import java.util.Scanner;

public class Homework_Task5 {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter a size of square spiral-filled matrix.");
        Scanner sc = new Scanner(System.in);
        int numberOfElement = sc.nextInt();
        int matrix[][] = new int[numberOfElement][numberOfElement];

        int upperBorder = 0;
        int rightBorder = numberOfElement - 1; //-1 because indexes are starting with 0
        int bottomBorder = numberOfElement - 1; //-1 because indexes are starting with 0
        int leftBorder = 0;

        int currNumber = 1;

        if (numberOfElement == 1){
            for (int i = 0; i < numberOfElement; i++){
                for (int j = 0; j < numberOfElement; j++){
                    matrix[i][j] = currNumber;
                    currNumber++;
                }
            }
        }
        if (numberOfElement != 1){
            while (currNumber <= numberOfElement*numberOfElement){
                //going from left to right
                for (int i = leftBorder; i <= rightBorder; i++){
                    if (currNumber > numberOfElement * numberOfElement){
                        break;
                    }
                    matrix[upperBorder][i] = currNumber;
                    currNumber++;

                }
                upperBorder++;

                //going downwards
                for (int j = upperBorder; j <= bottomBorder; j++){
                    if (currNumber > numberOfElement * numberOfElement){
                        break;
                    }
                    matrix[j][rightBorder] = currNumber;
                    currNumber++;

                }
                rightBorder--;

                //going from right to left
                for (int k = 0; k <= rightBorder - leftBorder; k++){
                    if (currNumber > numberOfElement * numberOfElement){
                        break;
                    }
                    matrix[bottomBorder][rightBorder - k] = currNumber;
                    currNumber++;
                }
                bottomBorder--;

                //going upward
                for (int l = 0; l <= bottomBorder - upperBorder; l++){
                    if (currNumber > numberOfElement * numberOfElement ){
                        break;
                    }
                    matrix[bottomBorder - l][leftBorder] = currNumber;
                    currNumber++;
                }
                leftBorder++;
            }
        }

        //printing out the result
        for (int i = 0; i < numberOfElement; i++){
            for (int j = 0; j < numberOfElement; j++){
                if (j != numberOfElement) {
                    System.out.print(" ");
                }
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
