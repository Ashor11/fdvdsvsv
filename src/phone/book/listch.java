/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package phone.book;

/**
 *
 * @author Ashour
 */
public abstract class listch extends listchild{

    public listch() {
        super();
    }
    @Override
   public abstract void addlast(String fname, String lname, String num);  
   public abstract void addnode(String lastname, String fname, String lname, String num);
   public abstract void bubbelSort();
   public abstract void remove(String lastname);
   public abstract void insertionSort() ;
   public abstract void load(String filepath) ;
   public abstract void setSize(int size) ;
   public abstract void display(char letter) ;
}
