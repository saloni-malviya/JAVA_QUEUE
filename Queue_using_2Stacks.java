/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//............JAVA PROGRAM FOR QUEUE USING 2 STACKS...........................
//TIME COMPLEXITY OF ADD OPERATIONS: O(n)
//TIME COMPLEXITY OF REMOVE AND PEEK OPERATIONS: O(1)
package queue_apna_college;
import java.util.*;
public class Queue_using_2Stacks {
    static class Queue{
        static Stack<Integer> s1=new Stack<>();
        static Stack<Integer> s2=new Stack<>();
        
        public static boolean isEmpty()
        {
            return s1.isEmpty();
        }
        
        //add
        public static void add(int data)
        {
            while(!s1.isEmpty())
            {
                s2.push(s1.pop());
            }
            s1.push(data);
            while(!s2.isEmpty())
            {
                s1.push(s2.pop());
        }
        }
        
        //remove
        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("queue is empty");
                return -1;
            }
            return s1.pop();
        }
        
        //peek
        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("queue is empty");
                        return -1;
            }
            return s1.peek();
        }
    }
    public static void main(String[]args)
    {
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(45);
        q.add(36);
        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }
    }
    
}
