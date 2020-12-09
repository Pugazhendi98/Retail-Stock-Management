/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ctlab1;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author PUGAZHENDI
 */
public class test2 {
     
    public static void main(String args[])
    {
       int a[]={1,5,3,4,2,4,8,6};
       int i,j,c=0,k=3,m=0,n=0;
       
       for(i=0;i<a.length;i++)
       {
           for(j=0;j<a.length;j++)
           {
               if(j==i)
                   continue;
               if(a[i]+k==a[j])
               {
                   c++;
                   System.out.println(a[i]+" "+a[j]);
                   break;
               }
           }
       }
       System.out.println(c);
       
        
    }
}
