/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//...........JAVA PROGRAM FOR IMPLEMENTATION OF CIRCULAR QUEUE....................... 
package queue_apna_college;
import java.util.*;
public class Circular_Queue {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;
        
        Queue(int n)
        {
            arr=new int[n];
            size=n;
            rear=-1;
            front=-1;
            
        }
        public static boolean isEmpty()
        {
            return rear==-1 && front==-1;
        }
        public static boolean isFull()
        {
            return (rear+1)%size==front;
        }
        
        //add
        public static void add(int data)
        {
            if(isFull())
            {
                System.out.println("Queue is full");
                return;
            }
            
            //add 1st elements
            if(front==-1)
            {
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }
        
        //remove
        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("Queue is empty");
                return -1;
            }
            int result=arr[front];
            
            //last element delete
            if(rear==front)
            {
                rear=front=-1;
            }
            else{
            front=(front+1)%size;
        }
            return result;
        }
        
        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
        
        public static void main(String[]args)
        {
            Queue q=new Queue(5);
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
            q.add(5);
            System.out.println("the remove element is"+q.remove());
            q.add(6);
            System.out.println("the 2nd time remove element is:"+q.remove());
            q.add(7);
            while(!q.isEmpty())
            {
                System.out.println(q.peek());
                q.remove();
            }
        }
        
    }
}
