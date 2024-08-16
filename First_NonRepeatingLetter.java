/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//........JAVA PROGRAM FOR FIRST NON REPEATING LETTER IN A STREAM OF CHARACTER...........
// INPUT:  a a b c c x b
// OUTPUT: a -1 b b b b x
package queue_apna_college;
import java.util.*;
public class First_NonRepeatingLetter {
    public static void repeat(String str)
    {
        Queue<Character> q=new LinkedList<>();
        int freq[]=new int[26];
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            q.add(ch);
            freq[ch-'a']++;
            
            while(!q.isEmpty() && freq[q.peek()-'a']>1)
            {
                q.remove();
            }
            if(q.isEmpty())
            {
                System.out.print(-1+" ");
                
            }
            else
            {
                System.out.print(q.peek()+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[]args)
    {
        String str="aabccxb";
        repeat(str);
    }
}
