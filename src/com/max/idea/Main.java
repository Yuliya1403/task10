package com.max.idea;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5}; // Задание 1
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp; // Задание 2
        int mid_index = Math.round(array.length / 2);
        System.out.println(array[0] + array[mid_index]); // Задание 3
    }
    }




