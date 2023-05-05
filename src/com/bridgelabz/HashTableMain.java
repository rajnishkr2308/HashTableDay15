package com.bridgelabz;

public class HashTableMain {
    public static void main(String[] args) {
        String sentence = "To be or not to be";
        String[] arrayWords = sentence.split(" ");      //split based on Sentence;
        HashTable<String, Integer> hashTable = new HashTable<>(3);

        for (String word : arrayWords) {
//            System.out.println(word.hashCode());     //to find hashCode of each word;
            int index = hashTable.getIndex(word);     //to find index of each word;
            System.out.println(word + " => " +word.hashCode()+ " => " +index);
        }
    }
}

