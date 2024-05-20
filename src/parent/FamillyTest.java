/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parent;

/**
 *
 * @author HP
 */
public class FamillyTest {
    public static void main(String[] args) {
        
        Parent father = new Parent("George", "Dokter", "Jakarta", 19750101);
        Parent mother = new Parent("Mintje", "PNS", "Bandung", 19770202);
        
        Child child1 = new Child("Grace", "Menari", "Jayapura", 20040518, father, mother);
        Child child2 = new Child("Roland", "Main Bola", "Jayapura", 20120315, father, mother);
        

        System.out.println("Informasi Anak 1:");
        child1.displayInfo();
        System.out.println("\nInformasi Anak 2:");
        child2.displayInfo();
    }
}
