/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//..............JAVA PROGRAM FOR STACK USING DEQUE...............................
package queue_apna_college;
import java.util.*;
public class Stack_using_Deque {
    static class Stack{
        Deque<Integer> deque=new LinkedList<>();
        
        public void push(int data)
        {
            deque.addLast(data);
        }
        
        public int pop()
        {
            return deque.removeLast();
        }
        
        public int peek()
        {
            return deque.getLast();
        }
        
    }
    public static void main(String[]args)
    {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("peek="+s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        
    }
}
