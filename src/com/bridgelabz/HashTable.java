package com.bridgelabz;
import java.util.ArrayList;
import java.util.List;

    public class HashTable <K,V> {
        /*
        Initializing
         */
        int bucketSize;
        List<HashLinkedList<K, V>> bucketArray = new ArrayList<>(bucketSize);
     /*
        Array List size increases at run-time, so it is called dynamic array
     */

        public HashTable() {

        }

        public HashTable(int bucketSize) {
        /*
        parameter constructor
         */
            this.bucketSize = bucketSize;
            for (int i = 0; i < bucketSize; i++) {
                bucketArray.add(i, null);
            }
        }

        public int getIndex(K key) {
        /*
        //h(k) = hashcode of k % m;
         */
            int index = Math.abs(key.hashCode()) % bucketSize;
            return index;
        }

        public void addOrUpdate(K key, V value) {
        /*
        Creating new linkList
         */
            int index = getIndex(key);
            HashLinkedList<K, V> hashLinkedList = bucketArray.get(index);
            if (hashLinkedList == null) {
                hashLinkedList = new HashLinkedList<>();
                bucketArray.add(index, hashLinkedList);
                hashLinkedList.append(key, value);
            } else {
            /*
            When linkList already exists and whether the linked list word already present or not
             */
                HashNode<K, V> currentNode = hashLinkedList.search(key);
                if (currentNode != null)
                    currentNode.value = value; //updating the node when the current node is not null
                else
                    hashLinkedList.append(key, value);

            }
        }

        public V get(K key) {
        /*
        to know the frequency of the word
         */
            int index = getIndex(key);
            HashLinkedList<K, V> hashLinkedList = bucketArray.get(index);
            if (hashLinkedList == null) {
                return null;
            }
            HashNode<K, V> currentNode = hashLinkedList.search(key);
            if (currentNode != null) {
                return currentNode.value;
            } else
                return null;
        }

        /*
        To print array list
         */
        @Override
        public String toString() {
            return "HashTable{" +
                    "bucketArray=" + bucketArray +
                    '}';

        }
    }
