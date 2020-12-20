/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs201.pkg2nd;

/**
 *
 * @author wafaa wael
 */
import java.util.Scanner;
public class classbook {
    private int no ;
    private String booktitle ;
    private float price ;
    private int n ;
    private float total;
   public  Scanner cin=new Scanner(System.in);
    private float total_cost(int n)
    {
       // System.out.println("enter the number of copies");
       // n=cin.nextInt();
        total=n*price;
        return total;
    }
    public void member ()
    {
        
        no =cin.nextInt();
        booktitle=cin.nextLine();
        Scanner input= new Scanner(System.in);
        price =input.nextFloat();
    }
    public void purchase()
    {
        Scanner inin=new Scanner(System.in);
        System.out.println("enter the number of copies");
        n=inin.nextInt();
        System.out.println(total_cost(n));
    }
}
