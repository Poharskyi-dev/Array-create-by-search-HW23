package com.gmail.Poharksyi;

public class Util {
    public static int[] arraySearchAndRecreate(int[] arr, int numSearch){
        int newArrLength = 0;
        for(int i = 0; i < arr.length; i++){
            if (arr[i] != numSearch){
                newArrLength++;
            }
            continue;
        }

        int[] newArr = new int[newArrLength];
        int newArrIdx = 0;
        for (int i = 0; i < arr.length; i++){
            if (numSearch == arr [i]){
                continue;
            }

            newArr[newArrIdx++] = arr[i];

        }
        return newArr;
    }

}
