/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author yusuf
 */
public class Koneksi {
    private String database_name = "muhammad_yusuf_karimi_2210010339";
    private String username = "root";
    private String password = "";
    public Connection koneksiDB; 
    
    public Koneksi(){
    
        try {  
            String lokasi = "jdbc:mysql://localhost/" + database_name ;
            Class.forName("com.mysql.cj.jdbc.Driver");
            koneksiDB = DriverManager.getConnection(lokasi, username, password);
            
            System.out.println("Database Terkoneksi");
        } catch (Exception e) {
            System.out.println(e.getMessage());          
        }
        
    }
    //dekan
    public void SimpanDekan (String id_Dekan, String nama, String ttd){
        try {
            String sql = "INSERT INTO dekan (id_Dekan, nama, ttd) VALUE (?,?,?)";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            
            perintah.setString(1, id_Dekan);
            perintah.setString(2, nama);
            perintah.setString(3, ttd);

            
            perintah.executeUpdate();
            System.out.println("Berhasil Disimpan");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
    public void UbahDekan(String id_Dekan, String nama, String ttd){
        try {
            String sql = "UPDATE dekan SET nama=?, ttd=? where id_Dekan=?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            
            
            perintah.setString(1, nama);
            perintah.setString(2, ttd);
            perintah.setString(3, id_Dekan);

            
            perintah.executeUpdate();
            System.out.println("Berhasil Diubah");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
    public void HapusDekan(String id_Dekan){
        try {
            String sql = "DELETE FROM dekan where id_Dekan=?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);

            perintah.setString(1, id_Dekan);
            
            perintah.executeUpdate();
            System.out.println("Berhasil Dihapus ");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    // dosen
    public void SimpanDosen (String id_dosen, String nama, String nidn, String jabatan, String status){
        try {
            String sql = "INSERT INTO dosen (id_dosen, nama, nidn, jabatan,status) VALUE (?,?,?,?,?)";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            
            perintah.setString(1, id_dosen);
            perintah.setString(2, nama);
            perintah.setString(3, nidn);
            perintah.setString(4, jabatan);
            perintah.setString(5, status);
            
            perintah.executeUpdate();
            System.out.println("Berhasil Disimpan");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
    public void UbahDosen(String id_dosen, String nama, String nidn, String jabatan, String status){
        try {
            String sql = "UPDATE dosen SET nama=?, nidn=?, jabatan=?,status=? where id_dosen=?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            
            
            perintah.setString(1, nama);
            perintah.setString(2, nidn);
            perintah.setString(3, jabatan);
            perintah.setString(4, status);
            perintah.setString(5, id_dosen);
            
            perintah.executeUpdate();
            System.out.println("Berhasil Diubah");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
    public void HapusDosen(String id_dosen){
        try {
            String sql = "DELETE FROM dosen where id_dosen=?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);

            perintah.setString(1, id_dosen);
            
            perintah.executeUpdate();
            System.out.println("Berhasil Dihapus ");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
    
    // mata kuliah
    public void SimpanMataKuliah (String kode_mk, String mk, String sks, String semester){
        try {
            String sql = "INSERT INTO matakuliah (kode_mk, mk, sks, semester) VALUE (?,?,?,?)";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            
            perintah.setString(1, kode_mk);
            perintah.setString(2, mk);
            perintah.setString(3, sks);
            perintah.setString(4, semester);
            
            perintah.executeUpdate();
            System.out.println("Berhasil Disimpan");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
    public void UbahMataKuliah(String kode_mk, String mk, String sks, String semester){
        try {
            String sql = "UPDATE matakuliah SET mk=?, sks=?, semester=? where kode_mk=?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            
            
            perintah.setString(1, mk);
            perintah.setString(2, sks);
            perintah.setString(3, semester);
            perintah.setString(4, kode_mk);
            
            perintah.executeUpdate();
            System.out.println("Berhasil Diubah");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
    public void HapusMataKuliah(String kode_mk){
        try {
            String sql = "DELETE FROM matakuliah where kode_mk=?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);

            perintah.setString(1, kode_mk);
            
            perintah.executeUpdate();
            System.out.println("Berhasil Dihapus ");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
    //surat
    public void SimpanSurat (String id_sk, String no, String id_dosen, String id_prodi, String id_ta, String semester, String kode_mk, String tanggal){
        try {
            String sql = "INSERT INTO surat (id_sk, no, id_dosen, id_prodi, id_ta,semester,kode_mk,tanggal) VALUE (?,?,?,?,?,?,?,?)";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            
            perintah.setString(1, id_sk);
            perintah.setString(2, no);
            perintah.setString(3, id_dosen);
            perintah.setString(4, id_prodi);
            perintah.setString(5, id_ta);
            perintah.setString(6, semester);
            perintah.setString(7, kode_mk);
            perintah.setString(8, tanggal);
            
            perintah.executeUpdate();
            System.out.println("Berhasil Disimpan");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
    public void UbahSurat (String id_sk, String no, String id_dosen, String id_prodi, String id_ta, String semester, String kode_mk, String tanggal){
        try {
            String sql = "UPDATE surat SET no=?, id_dosen=?, id_prodi=?,id_ta=?,semester=?,kode_mk=? ,tanggal=?  where id_sk=?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            
            
            perintah.setString(1, no);
            perintah.setString(2, id_dosen);
            perintah.setString(3, id_prodi);
            perintah.setString(4, id_ta);
            perintah.setString(5, semester);
            perintah.setString(6, kode_mk);
            perintah.setString(7, tanggal);
            perintah.setString(8, id_sk);
            
            perintah.executeUpdate();
            System.out.println("Berhasil Diubah");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
    public void HapusSurat (String id_sk){
        try {
            String sql = "DELETE FROM surat where id_sk=?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);

            perintah.setString(1, id_sk);
            
            perintah.executeUpdate();
            System.out.println("Berhasil Dihapus ");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
}
