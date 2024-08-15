/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//...........JAVA PROGRAM FOR IMPLEMENT DEQUE USING COLLECTION FRAMEWORK...............
//[A Deque is subinterface of queue that allow elements to be added and removed from both ends(front and rear)
//and also peek(get) elements from both sides]
package queue_apna_college;
import java.util.*;
public class Deque_using_collectionframework {
    public static void main(String[]args)
    {
        Deque<Integer> deque=new LinkedList<>();
        
        //Add First operations
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);
        System.out.println(deque);
        
        //Add Last operations
        deque.addLast(4);
        deque.addLast(5);
        deque.addLast(6);
        System.out.println(deque);
        
        //Remove operations
        deque.removeFirst();
        deque.removeLast();
        System.out.println(deque);
        
        //peek operations
        System.out.println("The first element is:"+deque.getFirst());
        System.out.println("The last element is:"+deque.getLast());
    }
    
}
