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
public class contact {
      //first name 
    public String fname;
    //last name
    public String lname;
    //phone number
    public String num;
    public contact(String fname, String lname, String num) {
        this.fname = fname;
        this.lname = lname;
        this.num = num;
    }

        public char getFcharOfFname()
    {
        return fname.charAt(0);
    }
  
    
}
