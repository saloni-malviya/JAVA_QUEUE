/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//.......JAVA PROGRAM FOR INTERLEAVE 2 HALVES OF A QUEUE(EVEN LENGTH)
//INPUT : 1 2 3 4 5 6 7 8 9 10
//OUTPUT: 1 6 2 7 3 8 4 9 5 10

package queue_apna_college;
import java.util.*;
public class Interleave_2Halves {
    public static void interleave(Queue<Integer> q)
    {
        Queue<Integer> newq=new LinkedList<>();
        int size=q.size();
        for(int i=0;i<size/2;i++)
        {
            newq.add(q.remove());
        }
        while(!newq.isEmpty())
        {
            q.add(newq.remove());
            q.add(q.remove());
        }
    }
    public static void main(String[]args)
    {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
                 interleave(q);
                 //print
                 while(!q.isEmpty())
                 {
                     System.out.print(q.remove());
                 }
                 System.out.println();
        
    }
}
