package com.mirzayogy.pbo2.c.model;

import com.mirzayogy.pbo2.c.db.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JenisBarang {
    private int id;
    private String namaJenisBarang;
    
    private Database database;
    private Connection connection;
    
    
    public boolean create(){
        String insertSQL = "INSERT INTO jenisbarang VALUES (NULL, ? )";
        
        this.database = new Database();
        this.connection = database.getConnection();
        
        try {
            PreparedStatement ps = this.connection.prepareStatement(insertSQL);
            ps.setString(1, this.namaJenisBarang);
            ps.execute();
            return true;
        } catch (SQLException ex) {
            
        }
        
        return false;
    }
    
    public boolean update(){
        String updateSQL = "UPDATE jenisbarang SET namajenisbarang = ? "
                + "WHERE id = ?";
        
        this.database = new Database();
        this.connection = database.getConnection();
        
        try {
            PreparedStatement ps = this.connection.prepareStatement(updateSQL);
            ps.setString(1, this.namaJenisBarang);
            ps.setInt(2, this.id);
            ps.execute();
            return true;
        } catch (SQLException ex) {
            
        }
        
        return false;
    }
    
    public boolean delete(){
        String deleteSQL = "DELETE FROM jenisbarang WHERE id = ?";
        
        this.database = new Database();
        this.connection = database.getConnection();
        
        try {
            PreparedStatement ps = this.connection.prepareStatement(deleteSQL);
            ps.setInt(1, this.id);
            ps.execute();
            return true;
        } catch (SQLException ex) {
            
        }
        
        return false;
    }
    
    public ArrayList<JenisBarang> read(){
        ArrayList<JenisBarang> list = new ArrayList<>();
        String selectSQL = "SELECT * FROM jenisbarang";
        
        this.database = new Database();
        this.connection = database.getConnection();
        
        try {
            PreparedStatement ps = this.connection.prepareStatement(selectSQL);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
//                System.out.println(rs.getString(2));
                JenisBarang jb = new JenisBarang();
                jb.setId(rs.getInt("id"));
                jb.setNamaJenisBarang(rs.getString("namajenisbarang"));
                list.add(jb);
            }
            return list;
        } catch (SQLException ex) {
            
        }
        return null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamaJenisBarang() {
        return namaJenisBarang;
    }

    public void setNamaJenisBarang(String namaJenisBarang) {
        this.namaJenisBarang = namaJenisBarang;
    }
    
    
}
