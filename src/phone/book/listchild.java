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
public abstract class listchild extends listnode{

    public listchild() {
        super();
    }

    @Override
    public void addlast(String fname, String lname, String num) {
        super.addlast(fname, lname, num); 
    }

    @Override
    public void addnode(String lastname, String fname, String lname, String num) {
        super.addnode(lastname, fname, lname, num); 
    }

    @Override
    public void bubbelSort() {
        super.bubbelSort();
    }

    @Override
    public void remove(String lastname) {
        super.remove(lastname); 
    }

    @Override
    public void insertionSort() {
        super.insertionSort(); 
    }

    @Override
    public void load(String filepath) {
        super.load(filepath); 
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void display(char letter) {
        super.display(letter); 
    }
      
}
