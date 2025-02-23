package phone.book;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
//package phone book

/**
 *
 * @author Ashour
 */
public class PhoneBook {

    /**
     * @param args the command line arguments 
     */
    public static void main(String[] args) {
     listnode l= new listnode();
     disblayMinue();
        Start(l);
     
     
    }
    


    
public static void disblayMinue()
    {
         System.out.println("Choose one of the following:\n" +
"1. Display all names and phone numbers sorted by First name\n" +
"2. Display all names and phone numbers starting with a given letter\n" +
"3. Search for a name (by last name)\n" +
"4. Add a new contact as last element in the phone book\n" +
"5. Delete a person from4 the list (using his/her last name)\n" +
"6. Add a new contact after specific contact (last name)\n" +
"7. Print the Phone Book to a file named by user\n" +
"8. Load Phone Book data from a file.\n" +
"9. Exit the phone book."); 
        
    } 
    public static void Start(listnode l) 
    {
        Scanner sc= new Scanner(System.in);
        int number;
        number=sc.nextInt();
        int n;
        String temp;
        String Fname,Lname,Number,afterLname;
        
       
         while(number!=9)
        {
            switch(number)
            {
                case 1:
                    System.out.println("Choose Type of sorting :\n 1- Bubbel sorting. \n 2- Selection sorting \n 3-Insertion sortig");
                     n=sc.nextInt();
                    l.display(n);
                    break;
                case 2:
 
                     System.out.println("Enter the letter");
                     temp=sc.next();
                    l.display(temp.charAt(0));
                    break;
                case 3:
                    System.out.println("Enter the last name");
                    temp=sc.next();
                    l.search(temp);
                    break;
                case 4:
                    System.out.println("Enter Frist name");
                    Fname=sc.next();
                    
                    System.out.println("Enter Last name");
                    Lname=sc.next();
                    
                    System.out.println("Enter phone Number");
                    Number=sc.next();
                    
                    l.addlast(Fname, Lname, Number);
                    break;
                case 5:
                    System.out.println("Enter the Last Name");
                    temp=sc.next();
                    l.remove(temp);
                    break;
                case 6:
                    System.out.println("Enter the last Name of the contact you want to add after ");
                    afterLname =sc.next();
                    System.out.println("Enter Frist name");
                    Fname=sc.next();
                    
                    System.out.println("Enter Last name");
                    Lname=sc.next();
                    
                    System.out.println("Enter phone Number");
                    Number=sc.next();
                    
                    l.addnode(Fname, Lname, Number, afterLname);
                    
                    break;
                    
                case 7:
                    System.out.println("Enter tha file path");
                    temp=sc.next();
                    l.File(temp);
                    break;
                    
                case 8:
                    System.out.println("Enter tha file path");
                    temp=sc.next();
                    l.load(temp);
                    break;
                default:
                    System.out.println("Unvalid input");
                    
                    
            }
           disblayMinue();
            number=sc.nextInt();
        }
    }
}


    
    
         
            


