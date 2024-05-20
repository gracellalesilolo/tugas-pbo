/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parent;

/**
 *
 * @author HP
 */
public class Child {
    protected String name;
    protected String hobi;
    protected String tempatLahir;
    protected int tanggalLahir;
    protected Parent father;
    protected Parent mother;

    public Child(String name, String hobi, String tempatLahir, int tanggalLahir, Parent father, Parent mother) {
        this.name = name;
        this.hobi = hobi;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
        this.father = father;
        this.mother = mother;
    }

    public void displayInfo() {
        System.out.println("Nama: " + name);
        System.out.println("Hobi: " + hobi);
        System.out.println("Tempat Lahir: " + tempatLahir);
        System.out.println("Tanggal Lahir: " + tanggalLahir);
        System.out.println("Ayah: " + father.name);
        System.out.println("Ibu: " + mother.name);
    }
}
