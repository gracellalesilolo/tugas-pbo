/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parent;

/**
 *
 * @author HP
 */
public class Parent {
    protected String name;
    protected String pekerjaan;
    protected String tempatLahir;
    protected int tanggalLahir;

    public Parent(String name, String pekerjaan, String tempatLahir, int tanggalLahir) {
        this.name = name;
        this.pekerjaan = pekerjaan;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
    }

    public void displayInfo() {
        System.out.println("Nama: " + name);
        System.out.println("Pekerjaan: " + pekerjaan);
        System.out.println("Tempat Lahir: " + tempatLahir);
        System.out.println("Tanggal Lahir: " + tanggalLahir);
    }
}

