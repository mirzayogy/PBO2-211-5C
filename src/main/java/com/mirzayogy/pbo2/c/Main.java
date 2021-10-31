package com.mirzayogy.pbo2.c;

import com.mirzayogy.pbo2.c.frame.LoginFrame;
import com.mirzayogy.pbo2.c.frame.MainPublicFrame;
import com.mirzayogy.pbo2.c.frame.admin.JenisBarangViewFrame;
import com.mirzayogy.pbo2.c.model.JenisBarang;
import com.mirzayogy.pbo2.c.model.Pengguna;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Pengguna pengguna = new Pengguna();
//        pengguna.setUsername("user");
//        pengguna.setPassword("user");
//        if(pengguna.login()){
//            System.out.println(pengguna.getNamaLengkap());
//            System.out.println(pengguna.isIsAdmin());
//        } else {
//            System.out.println("Username/Password Salah");
//        }

//        LoginFrame loginFrame = new LoginFrame();
//        loginFrame.setVisible(true);

//        JenisBarangViewFrame jenisBarangViewFrame = new JenisBarangViewFrame();
//        jenisBarangViewFrame.setVisible(true);
        
        JenisBarang jenisBarang = new JenisBarang();
//        jenisBarang.setId(14);
//        jenisBarang.setNamaJenisBarang("Ini percobaan hasil edit");
//        if(jenisBarang.delete()){
//            System.out.println("Hapus data berhasil");
//        } else {
//            System.out.println("Hapus data gagal");
//        }

        ArrayList<JenisBarang> list = jenisBarang.read();
        System.out.println(list.get(1).getNamaJenisBarang());
        
    }
}
