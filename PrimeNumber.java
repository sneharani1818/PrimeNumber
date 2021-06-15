/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primenumber;

/**
 *
 * @author Sushil Kumar
 */
import java.util.Scanner;
public class PrimeNumber {

    /**
     * @param args the command line arguments
     */
    private int num;
    PrimeNumber()
    {
        num=3;
    }
    PrimeNumber(int num)
    {
        this.num=num;
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        num=sc.nextInt();
    }
    boolean isPrime()
    {
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
                return false;
        }
        return true;
    }
    void display()
    {
        boolean b=isPrime();
        if(b==true)
            System.out.println(num+" IS A PRIME NUMBER");
        else
            System.out.println(num+" IS NOT PRIME. IT IS COMPOSITE");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        PrimeNumber num1=new PrimeNumber();
        num1.display();
        PrimeNumber num2=new PrimeNumber();
        num2.input();
        num2.display();
        PrimeNumber num3=new PrimeNumber(45);
        num3.display();
        PrimeNumber num4=new PrimeNumber(17);
        num4.display();
    }
    
}
