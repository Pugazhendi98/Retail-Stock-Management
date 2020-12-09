/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ctlab1;
import java.lang.Math;
/**
 *
 * @author PUGAZHENDI
 */
public class test {
    
    public int addNumbers(float a,float b)
    {
        double c=a+b;
        int d;
        d = (int)c;
        return d;
    }
    public static void main(String args[])
    {
        test t=new test();
        
        int a= t.addNumbers(1.1f,3.05f);
        System.out.println(a);
    }
    
}
