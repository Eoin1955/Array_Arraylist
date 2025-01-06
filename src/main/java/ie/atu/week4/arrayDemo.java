package ie.atu.week4;

import java.util.Scanner;

public class arrayDemo {
    public static void main(String[] args) {
        int[] Array;
        Array = new int[10];
for(int i = 0; i < Array.length; i++){
    System.out.print("Element at index ");
    System.out.print(Array[i] + ":");
    System.out.println(Array[i] = (i+1)*100);
}
    }
}
