package com.bridgelabz;
    public class HashNode<K,V> {
        /*
          Initializing Data and Node using Generics
        */
        K key;
        V value;
        HashNode<K, V> next;

        public HashNode(K key, V value) {
        /*
         Parameter Constructor
        */
            this.key = key;
            this.value = value;
        }

        public String toString() {
            StringBuilder nodeString = new StringBuilder();
            nodeString.append("Node: " + " K = ").append(key).append(", V = ").append(value).append("\n");
            if (next != null)
                nodeString.append(" , ").append(next);
            return nodeString.toString();
        }
    }

