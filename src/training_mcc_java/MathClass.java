/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training_mcc_java;

/**
 *
 * @author Aldyth M. V. Nahak (672017081)
 */
public class MathClass {
    public static int findMax(int arr[]) {
        int max = 0;
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        int[] number = {5,6,7,9,18};
        int result = findMax(number);
        System.out.println(result);
    }
}
