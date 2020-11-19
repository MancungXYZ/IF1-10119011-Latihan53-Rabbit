/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119011.latihan53.rabbit;

/**
 *
 * @author 
 *  Nama    : Reihan Wiyanda
 *  Kelas   : IF1
 *  Nim     : 10119011
 */
public class IF110119011Latihan53Rabbit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Rabbit kelinci = new Rabbit("Peter", false, "grass", 4, "grey");
        System.out.println("Hello, his name is ".concat(kelinci.getName()));
        System.out.println(kelinci.getName().concat(" is Vegetarian? ") + (kelinci.isVegetarian()));
        System.out.println(kelinci.getName().concat(" eats ") + kelinci.getEats());
        System.out.println(kelinci.getName().concat(" has ") + kelinci.getNoOfLegs() + " legs ");
        System.out.println(kelinci.getName().concat(" has ") + kelinci.getColor());
    }
    
}
