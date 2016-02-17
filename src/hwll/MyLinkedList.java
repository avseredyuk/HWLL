/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hwll;

import java.util.Iterator;

/**
 *
 * @author lenfer
 */
public class MyLinkedList<E> implements Iterable<E> {
    
    int size;
    Node first;
    Node last;

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>(){
            private Node curr = first;
            
            @Override
            public boolean hasNext() {
                return curr != null;
            }

            @Override
            public E next() {
                Node temp = curr;
                curr = curr.next;
                return (E)temp.value;
            }  
        };
    }
    
    private class Node{
        
        Node(){    
        }
        
        E value;
        Node next;
        Node prev;
        
    }

    public MyLinkedList() {
        
    }
    
    public void removeFirst(){
        if(size != 0){
            Node secondNode = first.next;
            first = secondNode;
            secondNode.prev = null;
            size--;
        }
    }
    
    public void removeLast(){
        if(size != 0){
            Node preLast = last.prev;
            last = preLast;
            preLast.next = null;
            size--;
        }
    }
    
    public void addLast(E value){
        if(size == 0){
            Node tmpNode = new Node();
            tmpNode.value = value;
            first = tmpNode;
            last = tmpNode;
        } else {
            Node tmpNode = new Node();
            tmpNode.value = value;
            tmpNode.prev = last;
            last.next = tmpNode;
            last = tmpNode;
        }
        size++;
    }
    
    public void addFirst(E value){
        if(size == 0){
            Node tmpNode = new Node();
            tmpNode.value = value;
            first = tmpNode;
            last = tmpNode;
        } else {
            Node tmpNode = new Node();
            tmpNode.value = value;
            tmpNode.next = first;
            first.prev = tmpNode;
            first = tmpNode;
        }
        size++;
    }
    
}
