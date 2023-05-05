package com.bridgelabz;

public class HashTableMain {
    public static void main(String[] args) {
        String paraGraph = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        String[] arrayWords =  paraGraph.split(" ");      //split based on Sentence;
        HashTable<String, Integer> hashTable = new HashTable<>(3);

        for (String word : arrayWords) {
//            System.out.println(word.hashCode());     //to find hashCode of each word;
 //           int index = hashTable.getIndex(word);     //to find index of each word;
 //           System.out.println(word + " => " +word.hashCode()+ " => " +index);
            Integer currentFrequency = hashTable.get(word);
            if (currentFrequency == null)
                currentFrequency = 1;
            else
                currentFrequency++;

            hashTable.addOrUpdate(word,currentFrequency);
        }
        System.out.println(hashTable);
        }
    }


