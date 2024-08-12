/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//..........JAVA PROGRAM FOR QUEUE USING DEQUE.........................
package queue_apna_college;
import java.util.*;

public class Queue_using_deque {
    static class Queue{
        Deque<Integer> d=new LinkedList<>();
        
        //add elements
        public void add(int data)
        {
            d.addLast(data);
        }
        
        //remove
        public int remove()
        {
            return d.removeFirst();
        }
        
        //peek
        public int peek()
        {
            return d.getFirst();
        }
    }
    public static void main(String[]args)
    {
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println("peek="+q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
    
}
