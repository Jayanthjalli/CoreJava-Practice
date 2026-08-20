

package com.DSAPrograms;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicatesInArrayPrintIt {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = s.nextInt();

        int arr[] = new int[size];
        

        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        int temp[] = new int[size];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            boolean duplicate = false;

            for (int j = 0; j < count; j++) {
                if (arr[i] == temp[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                temp[count++] = arr[i];
            }
        }

        System.out.println("Array without duplicates:");
        for (int i = 0; i < count; i++) {
            System.out.print(temp[i] + " ");
        }
        System.out.println(Arrays.toString(temp));
    }
}