package org.bcit.comp2522.labs.lab08;

public class Node<K, V> {
  K key;
  V value;
  Node[] children;
  Node parent;

  public Node(Node parent, K key, V value) {
    children = new Node[0];
    this.key = key;
    this.value = value;
  }
}
