package com.bridgelabz;

    public class HashLinkedList <K,V> {

        HashNode<K,V> head;
        HashNode<K,V> tail;

        public void append(K key, V value) {
            /*
             * New Node is created in the Linked list.so the head and tail is new node.
             * if head is not equal to null, then tail.next will be new node.
             * And tail is New node.
             */
            HashNode<K,V> newNode = new HashNode<>(key,value);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }
        }

        public HashNode<K,V> search(K searchData) {
        /*
         when temp node is head,and temp is not equal to null then its data equals to search data
         */
            HashNode<K,V> temp = head;
            while (temp != null) {
                if (temp.key.equals(searchData))
                    return temp;
                temp = temp.next;
            }
            return null; //when temp = null;
        }
        public void display() {
        /*
        Display the linked list
         */
            HashNode<K,V> temp = head;
            ;
            while (temp != null) {
                System.out.print(temp.key + " = " +temp.value+ " -> ");
                temp = temp.next;
            }
            System.out.println();
        }
        @Override
        public String toString() {
            return " \n{" + head + "}";
        }
    }


