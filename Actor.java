/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actor;

/**
 *
 * @author ELCOT
 */
public class Actor {
String name;String fathername;int dob;String address;String othernames;
String occupation;int year;String spouse;String children;String relatives;
String awards;int awardsyear;
public void display()
{
    System.out.println("BORN:"+ name);
    System.out.println(""+fathername);
    System.out.println(""+ dob);
    System.out.println(""+address);
    System.out.println("OTHERNAMES:"+othernames);
    System.out.println("OCCUPATION:"+occupation);
    System.out.println("YEAR OF ACTIVE:"+year);
    System.out.println("SPOUSE:"+spouse);
    System.out.println("CHILDREN:"+children);
    System.out.println("RELATIVES:"+relatives);
    System.out.println("AWARDS:"+awards);
    //System.out.println("enter the awardsyear"+awardsyear);
 }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
      Actor a1=new Actor();
      a1.name="Rajinikanth";
      a1.fathername="SHIVAJI RAO GAIWARSD";
      a1.dob=1950;
      a1.address="BANGALORE,MYSORE STATE,KARNATIKA,INDIA";
      a1.othernames="RAJINI,SUPERSTAR,THALIVA,THALIVAR";
      a1.occupation="ACTOR,PRODUCER,SCREENWRITER";
      a1.year=1975;
      a1.spouse="LATHA RAJINIKANTH";
      a1.children="AISWARYA,SOUNDARYA";
      a1.relatives="RAJINIKANTH FAMILY";
      a1.awards="DADASAHEB 2021,PADMAVIBHUSAN 2016,NTR 2016,PADMA BHUSHAN 2000";
      //a1.awardsyear=2021,2016,2016,2000;
      a1.display();
              }
}
      
      
     
    

