/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//.......JAVA PROGRAM FOR IMPLEMENTATION OF QUEUE USING COLLECION FRAMEWORK................
package queue_apna_college;
import java.util.*;
public class Queue_using_collectionframework {
    public static void main(String[]args)
    {
        //Queue<Integer> q=new ArrayDeque<>();
        Queue<Integer> q=new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
