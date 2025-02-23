package phone.book;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ashour
 */
public class listnode {
    public node head;
    public int size;
    public listnode(){
        head=null;
    }
    //addddddddd //4
    public void addlast ( String fname, String lname, String num ){
        node current = head;
        contact c = new contact( fname, lname, num);
        if(head == null) 
            {
            head = new node(c,null,null);
            }
            else 
            {
            while (current.next != null ){
            current = current.next;
            }
            node n = new node(c, null, current);
            current.next=n;       
            }
        size++;
                
                }
    
    //removeeeeeeeeee //5
  public void remove (String lastname)
  {
      node remove = search(lastname);
      if (remove == null ){
      System.out.println("There are no data !");
      }
      else
      {
         if(remove == head)
             head = remove.next;
         else if(remove.next == null)
         {
             remove.prev = null;
             
         }   
         else  
         {
             remove.prev.next = remove.next;
             remove.next.prev = remove.prev;        
         
         }
         remove.next=null;
         remove.prev=null;
              size--;
      }
     
              
  }
  //sarch for a name by last name //3 
  public node search (String lastname){
   
      node current = head;
      while(current != null)
      {
        if(current.data.lname.equals(lastname))
        {
                System.out.println("\nFrist Name:" + current.data.fname);
                System.out.println("last Name:" + current.data.lname);
                System.out.println("Number:" + current.data.num);
                
        }
        
            current=current.next;
        
      }
      
       
      return  null;
      
  } 
  //add afterlast name //6
  public void addnode( String lastname , String fname, String lname, String num) {
      node after = search(lastname);
      
      if(after!=null)
      {
          contact c = new contact(fname, lname, num);
          if(after.next==null) addlast(fname, lname, num);
          else
          {
            node v = new node(c, after, after.next);
            after.next.prev = v;
            after.next = v;
          }
          
            size++;
          System.out.println("Done!");                 
      }else{System.out.println("not found name");}
      
}
  //sorting
  //1
    
  //Exit the phone book //9
  
   //all names and numbers with the letter //2
//   public String[] Display(char SS){
//     node current = head;
//     node count = head;
//     int numb = 0 ;
//     while (count != null)
//     { count = count.next;
//             numb ++; 
//     }
//     String  [] x = new String [numb];
//     String bb;
//     int i=0;
//     final int FIRST = 0;
//     while( current != null ){   
//         bb= current.data.lname;
//     if ( bb.charAt(FIRST)== SS ){
//         x[i] =   current.data.fname ;
//       x[i+1] =   current.data.fname; 
//       x[i+2] =   current.data.num ;
//       x[i+3]= "";
//         i ++;
//     
//     }current= current.next; 
//         }
//     return x;
//   } 
   
    public void display( char letter) {

        node current = head;

        while (current != null) {
            if (current.data.getFcharOfFname() == letter) {
                System.out.println("\nFrist Name:" + current.data.fname);
                System.out.println("last Name:" + current.data.lname);
                System.out.println("Number:" + current.data.num);
               
            }
             current = current.next;
        }

    }
     public void display(int sort_type) {   
//        
         
//        else if(sort_type==2)
//            selectionSort();
//        else
//            insertionSort();
//        
        node current = head;

        while (current != null) {
             
                System.out.println("\nFrist Name:" + current.data.fname);
                System.out.println("last Name:" + current.data.lname);
                System.out.println("Number:" + current.data.num);
               
             current = current.next;
        }

    }
   
   public void File(String filepath)
    {  
        PrintWriter pr = null;
        try {
           
            pr = new PrintWriter(filepath+".txt");
            node current = head;
        while (current != null) {
         pr.println(current.data.fname+" "+current.data.lname+" "+current.data.num);
            current = current.next;
        }        
         
        } catch (FileNotFoundException ex) {
            System.out.println("The file is not found");
        } finally {
            pr.close();
        }
        
    }
   public void load(String filepath) {
        
        File f = new File(filepath+".txt");
        
        try {
           Scanner sc = new Scanner(f);
           
            while (sc.hasNext()) 
            {
               String fname = sc.next();
               String lname = sc.next();
               String number = sc.next();
               int age = sc.nextInt();
                addlast(fname, lname, number);
            }
            sc.close();
            
        } catch (FileNotFoundException ex) {
        
        }

        
    }
    public void bubbelSort() {

        node current = head;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                
                if (current.data.fname.compareTo(current.next.data.fname)<0)
                {
                    contact temp = current.data;
                    current.data=current.next.data;
                    current.next.data=temp;
                }
                current = current.next;
            }
        }
        
//        node current = head;
//        contact[] arr = new contact[100];
//        int n =0;
//        if (head == null)
//        {
//            System.out.println("Empty");
//            return;
//        }
//        while (current != null){
//            arr[n] = current.data;
//            n++;
//            current = current.next;
//        }
//        for (int i=0;i<n-1;i++){
//        for(int j=0;i<n-i-1;j++){
//            if(arr[j].getFcharOfFname()> arr[j+1].getFcharOfFname())
//            {
//            contact temp = arr[j];
//            arr[j] = arr [j+1];
//            arr[j+1]=temp;
//            }
//        
//        
//        }
//        
//        }
//printArr(arr,n); 
    }     
        
    

    public void selectionSort() {

    }

    public void insertionSort() {

    }
    
//  public void printArr(contact[]arr,int n)
//  
//  {
//  for(int i = 0; i<n ; i++) 
//  {
//  System.out.print(arr[i].fname + arr[i].lname + arr[i].num);
//  }
//  }

    
}
