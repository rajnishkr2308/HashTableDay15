package com.bridgelabz;
    public class HashNode<K,V> {
        /*
          Initializing Data and Node using Generics
        */
        K key;
        V value;
        HashNode<K,V> next;

        public HashNode(K key, V value) {
        /*
         Parameter Constructor
        */
            this.key = key;
            this.value = value;
        }
    }

