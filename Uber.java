
package uber;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Fami
 */
class user{
    String name;
    int id;

    public user() {
    
    }

    public user(String name, int id) {
        this.name = name;
        this.id = id;
    }
    

}

class customer extends user{
    public String give_feedback(){
        //input string nd return that
         Scanner in=new Scanner(System.in);
         System.out.println("please enter feedbaack of driver");
         String temp=in.nextLine();
         return temp;
    }
}

class driver extends user{
   String no_plate;
   List<String> feedback=new ArrayList <String>();
   //String feedback;

    public driver() {
    }

    public driver(String no_plate) {
        this.no_plate = no_plate;
    }

    public driver(String no_plate, String name, int id) {
        super(name, id);
        this.no_plate = no_plate;
    }
    
   
}

class ride{
    int pickup;
    int destination;
    
    int rp_km=20;
    
    
    public int book_cab()
    {
        //input dest,pickup via options 
        //return kms by subtracting
        Scanner in=new Scanner(System.in);
        System.out.println("please enter serial no. of pickup point\n1.model town\n2.township\n3.iqbal town\n4.bahria\n5.kot lakhpat\n");
        pickup=in.nextInt();
        System.out.println("please enter serial no. of destination point\n6.model town\n7.township\n8.iqbal town\n9.bahria\n10.kot lakhpat\n");
        destination=in.nextInt(); 
        
        int km=destination-pickup;
        return km;
    }
    
    public int cal_fare(int km){
        return km*rp_km;
        
    }
    
}
//string str=leavefeedback(); 
//listname.get(driver).feedback.add(str);
public class Uber {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//driver list,add driver,book cab,make fare, give feedback, print
// TODO code application logic here
        List<driver>d=new ArrayList<driver>();
        
        driver d1;
        driver d2;
        d1 = new driver("LEB-1234","danish",1);
        d2 = new driver("LEB-1234","shazar",2);
        
        d.add(d1);
        d.add(d2);
        
        ride r1=new ride();
        int a=r1.book_cab();
        r1.cal_fare(a);
        
        Scanner in=new Scanner(System.in);
         
        String str=in.nextLine();
        d.get(0).feedback.add(str);
    }
    
}
