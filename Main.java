import java.util.Random;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        int[] arr1 = new int[5];
        int[] arr2 = new int[5];

        // ARRAY 1 2
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * (9 - 0 + 1) + 0);
            arr2[i] = (int) (Math.random() * (9 - 0 + 1) + 0);
        }
        // ARRAY 3
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr3.length; i++) {

            if (i < arr1.length) {
                arr3[i] = arr1[i];
            } else {
                arr3[i] = arr2[i-arr1.length];
            }

        }

        //ARRAY 4

        int[] pomocniczy = new int[arr3.length];

        for(int i = 0; i < arr3.length; i++){
            pomocniczy[i] = -1;
        }

        // PRZECHODZI PRZEZ PIERWSZEGO ARRAYA
        for (int i = 0; i < arr1.length; i++) {
            int zmienna = arr1[i];

            // PRZECHODZI PRZEZ DRUGIEGO DLA KAŻDEJ WARTOŚCI PIERWSZEGO
            for (int j = 0; j < arr2.length; j++) {
                // JEŚLI DRUGI RÓWNA SIĘ PIERWSZEMU
                if (arr2[j] == zmienna) {
                    // PRZECHODZI PRZEZ RESZTĘ PIERWSZEGO DLA DANEJ WARTOŚCI PIERWSZEGO
                    for(int k = i + 1, l = 0; k <= arr1.length; k++){
                        // JEŚLI KOLEJNY NIE RÓWNA SIĘ SPRAWDZANEJ WARTOŚCI
                        if(arr1[i] != arr1[k - 1]){
                            l++;
                        }
                        // JEŚLI WSZYSTKIE KOLEJNE NIE BYŁY RÓWNE
                        if(l == arr1.length - i - 1){
                            pomocniczy[i] = zmienna;
                        }
                    }
                }
            }
        }
        //SIMPLIFYING THE ARRAY
        int zmienna2 = 0;
        for(int i = 0; i < pomocniczy.length; i++){
            if (pomocniczy[i] != -1){
                zmienna2++;
            }
        }
        int[] arr4 = new int[zmienna2];
        for(int i = 0, k = 0; i  < pomocniczy.length; i++){
            if(pomocniczy[i] != -1){
                arr4[k] = pomocniczy[i];
                k++;
            }
        }

        //ARRAY 5

        int max = 0, min = 9, a = 0;

        for(int i = 0; i < arr3.length; i++){
            max = (Math.max(max, arr3[i]));
            min = (Math.min(min, arr3[i]));
        }
        int[] pomocniczy3 = new int[arr3.length];
        for(int i = 0; i < arr3.length; i++){
            pomocniczy3[i] = -1;
        }

        for(int i = 0; i < arr3.length; i++){
            for(int j = 0, k = 0; j < arr3.length; j++){
                if(i != arr3[j]) {
                    k++;
                }
                if(k == arr3.length && i > min && i < max){
                    pomocniczy3[i] = i;
                }
            }
        }

        //SIMPLIFYING THE ARRAY
        int zmienna3 = 0;
        for(int i = 0; i < pomocniczy3.length; i++){
            if (pomocniczy3[i] != -1){
                zmienna3++;
            }
        }
        int[] arr5 = new int[zmienna3];
        for(int i = 0, k = 0; i  < pomocniczy3.length; i++){
            if(pomocniczy3[i] != -1){
                arr5[k] = pomocniczy3[i];
                k++;
            }
        }
        //.....................


        System.out.print("\u001B[31mArray 1: \u001B[37m");
        for(int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }System.out.print("\n\u001B[31mArray 2: \u001B[37m");
        for(int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.print("\n\u001B[31mArray 3: \u001B[37m");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
        System.out.print("\n\u001B[31mArray 4: \u001B[37m");
        for(int i = 0; i < arr4.length; i++){
            System.out.print(arr4[i] + " ");
        }
        System.out.print("\n\u001B[31mArray 5: \u001B[37m");
        for(int i = 0; i < arr5.length; i++){
            System.out.print(arr5[i] + " ");
        }
    }
}
