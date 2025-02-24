package com.example.project.Selection_Sort;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1, 10, 7, 3, 5, 2, 4, 9, 6, 8};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        arr = SelectionSort.selectionSort(arr);
        for (int i = 0; i < arr.length ; i ++ ) {
            System.out.println(arr[i]);
        }
    }
    // PART A. implementing selection sort
    public static int[] selectionSort(int[] elements) {
        for (int i = 0 ; i < elements.length ; i++ ) {
            int smallest = Integer.MAX_VALUE;
            int smallestIdx = 0;
            for (int j = i ; j < elements.length ; j++) {
                if (elements[j] < smallest) {
                    smallest = elements[j];
                    smallestIdx = j;
                }
            }
            int temp = elements[i];
            elements[i] = smallest;
            elements[smallestIdx] = temp;

        }
        return elements;
    }


    // PART B. sorting a 1000-word list
    public static ArrayList<String> selectionSortWordList(ArrayList<String> words) {
        for (int i = 0 ; i < words.size() ; i++ ) {
            String smallest = "zzz";
            int smallestIdx = 0;
            for (int j = i ; j < words.size() ; j++) {
                if (words.get(j).compareTo(smallest) < 0) {
                    smallest = words.get(j);
                    smallestIdx = j;
                }
            }
            words.set(i, words.set(smallestIdx, words.get(i)));
        }
        return words;
    }

    //call this method to load 1000 words into list. Use it to test Part B
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
