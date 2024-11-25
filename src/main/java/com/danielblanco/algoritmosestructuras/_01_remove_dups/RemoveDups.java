package com.danielblanco.algoritmosestructuras._01_remove_dups;

import com.danielblanco.algoritmosestructuras._00_linkedlist.Node;

import java.util.HashSet;
import java.util.Set;

/*
 * Escribe un algoritmo para eliminar los elementos duplicados en una Lista enlazada
 *
 * Ejemplo:
 *  Input: 1->2->2->3->4->1
 *  Output: 1->2->3->4
 *
 * Complejidad Lineal O(N)
 *
 * Follow-up: ¿Cuál sería tu solución si no pudieras utilizar memoria adicional?
 */
public class RemoveDups {

  public static void removeDups(Node head) {
    if (head == null) return;

    Set<Integer> foundValues = new HashSet<>();
    Node current = head;
    foundValues.add(current.value);

    while (current != null && current.next != null) {

      if (!foundValues.add(current.next.value)) {
        current.next = current.next.next;
      }

      current = current.next;
    }

  }

  public static void main(String[] args) {

    Node head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(2);
    head.next.next.next = new Node(3);
    head.next.next.next.next = new Node(4);
    head.next.next.next.next.next = new Node(1);

    removeDups(head);
  }

}
