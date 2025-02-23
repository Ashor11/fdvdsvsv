package phone.book;




/**
 *
 * @author Ashour
 */
public class node {
    //next
    public node next;
    //previous
    public node prev;
    //data
    public contact data;
    public node(contact d, node next, node prev) {
            this.data = d;
            this.next = next;
            this.prev = prev;
        }
}
    
    
    
    

