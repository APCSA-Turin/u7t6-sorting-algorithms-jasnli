package com.example.project.Insertion_Sort;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arrA = {8, 10, 7, 16, 3, 12, 5, 2, 13, 4, 15, 9, 6, 1, 14, 11};
        InsertionSort.selectionSort(arrA);
        System.out.println(Arrays.toString(arrA));
        System.out.println();
        int[] arrB = {8, 10, 7, 16, 3, 12, 5, 2, 13, 4, 15, 9, 6, 1, 14, 11};
        InsertionSort.insertionSort(arrB);
        System.out.println(Arrays.toString(arrB));

    }

    // PART A. implementing insertion sort
    public static int[] insertionSort(int[] elements) {
        for (int i = 1; i < elements.length; i++) {
            int inthedex = i;
            while (inthedex >= 1) {
                if (elements[inthedex] < elements[inthedex - 1]) {
                    int temp = elements[inthedex - 1];
                    elements[inthedex - 1] = elements[inthedex];
                    elements[inthedex] = temp;   
                }
                inthedex --;
                
            }
        }
        return elements;
    }

   
    public static void selectionSort(int[] elements) {
        
    }

    // PART B. sorting a 1000-word list
    public static ArrayList<String> insertionSortWordList(ArrayList<String> words) {
        for (int i = 1; i < words.size(); i++) {
            int inthedex = i;
            while (inthedex >= 1) {
                if (words.get(inthedex).compareTo(words.get(inthedex - 1)) < 0) {
                    words.set(inthedex, words.set(inthedex - 1, words.get(inthedex)));
                }
                inthedex --;
                
            }
        }
        return words;
    }

    public static void selectionSortWordList(ArrayList<String> words) {
    }

    public static ArrayList<String> loadWordsInto(ArrayList<String> wordList) {
        try {
            Scanner input = new Scanner(new File("src/main/java/com/example/project/Selection_Sort/words.txt"));
            while (input.hasNext()) {
                String word = input.next();
                wordList.add(word);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return wordList;
    }

   
}