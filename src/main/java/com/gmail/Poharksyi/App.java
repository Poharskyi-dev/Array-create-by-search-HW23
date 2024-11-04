package com.gmail.Poharksyi;

import static com.gmail.Poharksyi.Util.arraySearchAndRecreate;

public class App
{
    public static void main( String[] args ) {
        int[] arr = {5, 65, 2, 5, 12, 0};
        int[] newArr = arraySearchAndRecreate(arr, 5);
        for (int num : newArr){
            System.out.println(num);
        }
    }


}
