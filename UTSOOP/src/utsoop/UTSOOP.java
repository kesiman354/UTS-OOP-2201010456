/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utsoop;

/**
 *
 * @author Windows 10
 */
public class UTSOOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                    databuku Dbuku = new databuku ();
//        BTeman.Storedata();
//        BTeman.viewdata();
        String ul = "YA";
        do{
            System.out.println("A. View Data");
            System.out.println("B. Add Data");
            System.out.println("C. Edit Data");
            System.out.println("D. Delete Data");
            System.out.println("E. Exit");
            System.out.println("Choose Option (A/B/C/D/E): ");
            String mPIL = Dbuku.dtIN.nextLine();
            switch (mPIL) {
            case"A":
                Dbuku.viewdata();
                break;
            case"B":
                Dbuku.Storedata();
                break;
            case"C":
                Dbuku.Update(0);
                break;
            case"D":
                Dbuku.Destroy(0);
                break;
            case"E":
                ul = "tidak";
                break;
            default:
                System.out.println("wwwwww");
            }
        }while(ul.equals("YA"));
    }
    }
    

