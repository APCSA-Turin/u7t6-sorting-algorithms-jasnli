package com.example.project.Insertion_Sort;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        insertionSort(arr);
        System.out.println();
        for (int i : arr) {
            System.out.print(i + ", ");
        }
    }

    // PART A. implementing insertion sort
    public static int[] insertionSort(int[] elements) {
        for (int i = 1; i < elements.length; i++) {
            int inthedex = i;
            System.out.println("ITD: " + inthedex);
            while (inthedex >= 1) {
                if (elements[inthedex] < elements[inthedex - 1]) {
                    System.out.println(elements[inthedex]);
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
            System.out.println("ITD: " + inthedex);
            while (inthedex >= 1) {
                if (words.get(inthedex).compareTo(words.get(inthedex - 1)) < 0) {
                    System.out.println(words.get(inthedex));
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