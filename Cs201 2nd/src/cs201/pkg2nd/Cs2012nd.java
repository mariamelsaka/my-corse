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

public class Cs2012nd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("please enter the book number ,the name of the book and the price of it ");
        classbook book = new classbook();
        book.member();
        book.purchase();
        System.out.println("please enter the book number ,the name of the book and the price of it ");
        classbook book1 = new classbook();
        book1.member();
        book1.purchase();
        System.out.println("please enter the book number ,the name of the book and the price of it ");
        classbook book2 = new classbook();
        book2.member();
        book2.purchase();
    }
    
}
