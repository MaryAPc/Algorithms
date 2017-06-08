package com.maryapc.algorithms.trees.BinaryTree;

public class Node<K, V> {

    private K key;
    private V value;
    private Node<K, V> left;
    private Node<K, V> right;

    public Node(K key, V value) {
        this.key = key;
        this.value = value;
    }
}
