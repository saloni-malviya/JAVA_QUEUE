/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queue_apna_college;
import java.util.*;
public class Queue_using_Linkedlist {
    static class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    static class Queue{
        public static Node head=null;
        public static Node tail=null;
        
        public static boolean isEmpty()
        {
            return head==null && tail==null;
        }
        
        //add element
        public static void add(int data)
        {
            Node newnode=new Node(data);
            if(isEmpty())
            {
                head=tail=newnode;
            }
            tail.next=newnode;
            tail=newnode;
            
        }
        
        //remove element
        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("Queue is empty");
                return -1;
            }
            int front=head.data;
            if(head==tail)
            {
                head=tail=null;
            }
            else{
            head=head.next;
            }
            return front;
        }
        
        //peek element
        public static int peek()
        {
            if(isEmpty())
            {
              System.out.println("Queue is empty");
              return -1;
            }
            return head.data;
        }
        
        public static void main(String[]args)
        {
            Queue q=new Queue();
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
            while(!q.isEmpty())
            {
                System.out.println("the elements are:"+q.peek());
               q.remove(); 
               //System.out.println("the remove element is:"+q.remove());
            
                
            }
        }
    }
}
