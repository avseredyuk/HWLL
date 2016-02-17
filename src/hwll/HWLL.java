/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hwll;

/**
 *
 * @author lenfer
 */
public class HWLL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyLinkedList my = new MyLinkedList();
        my.addFirst(1);
        my.addFirst(2);
        my.addFirst(3);
        my.addLast(4);
        my.addLast(5);
        my.addLast(6);
        my.removeFirst();
        my.removeLast();
        my.addLast(7);
        my.removeFirst();
//        my.removeFirst();
//        my.removeFirst();
//        my.removeFirst();
//        my.removeFirst();
//        my.removeFirst();
        for(Object o : my){
            System.out.println(o);
        }
    }
    
}
