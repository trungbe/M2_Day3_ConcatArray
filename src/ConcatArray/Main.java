package ConcatArray;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array1, array2, array3;

        System.out.print("Enter size of array 1: ");
        int size1 = input.nextInt();
        array1 = new int[size1];
        createElementOfArray(array1, size1);
        System.out.printf("Array 1: ");
        printArray(array1);

        System.out.print("Enter size of array 2: ");
        int size2 = input.nextInt();
        array2 = new int[size2];
        createElementOfArray(array2, size2);
        System.out.printf("Array 2: ");
        printArray(array2);

        array3 = new int[array1.length + array2.length];
        System.out.print("Array New: ");
        arrayConcat(array3, array1, array2);
        printArray(array3);
    }

    public static void arrayConcat(int[] arrayNew, int[] array1, int[] array2) {
        for (int i = 0; i < array1.length; i++) {
            arrayNew[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            arrayNew[array1.length + i] = array2[i];
        }
    }

    public static void createElementOfArray(int[] array, int size) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            System.out.print("Enter Element " + i + ": ");
            array[i] = input.nextInt();
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf(array[i] + "\t");
        }
        System.out.println();
    }

}
