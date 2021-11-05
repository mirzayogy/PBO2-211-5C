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

        JenisBarangViewFrame jenisBarangViewFrame = new JenisBarangViewFrame();
        jenisBarangViewFrame.setVisible(true);
        
        JenisBarang jenisBarang = new JenisBarang();
        
        //contoh create data
//        jenisBarang.setNamaJenisBarang("Modul 5C");
//        if(jenisBarang.create()){
//            System.out.println("Simpan data berhasil");
//        } else {
//            System.out.println("Gagal menyimpan data");
//        }

        //contoh update data
//        jenisBarang.setId(17);
//        jenisBarang.setNamaJenisBarang("Modul 5C Baru");
//        if(jenisBarang.update()){
//            System.out.println("Ubah data berhasil");
//        } else {
//            System.out.println("Gagal menyimpan data");
//        }
        
//          contoh delete adat
//        jenisBarang.setId(14);
//        if(jenisBarang.delete()){
//            System.out.println("Hapus data berhasil");
//        } else {
//            System.out.println("Hapus data gagal");
//        }

        //contoh read data
//        ArrayList<JenisBarang> list = jenisBarang.read();
//        System.out.println(list.get(1).getNamaJenisBarang());

//        contoh find data
//        jenisBarang.setId(13);
//        System.out.println(jenisBarang.getNamaJenisBarang());
//        jenisBarang.find();
//        System.out.println(jenisBarang.getNamaJenisBarang());

//        contoh search data
//          ArrayList<JenisBarang> list = jenisBarang.search("Pakaian");
//          for (int i = 0; i < list.size(); i++) {
//              System.out.println(list.get(i).getNamaJenisBarang());
//          
//            }
        
    }
}
