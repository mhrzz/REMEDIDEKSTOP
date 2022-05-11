/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis;


import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;
import kuis.db.DBHelper;

public class SSDDataModel {
    
    private final  Connection conn;

    public SSDDataModel() throws SQLException {
        this.conn =DBHelper.getConnection();
    }
    
    public void addVGAcard(ssd vga){
    String insertvga = "INSERT INTO vga_card ( `tanggal_pembelian`, `merek`, `harga`, `jenis`, `ukuran`)"
            + "VALUES ('"
            +vga.getTanggal_pembelian()+"','"
            +vga.getMerek()+"','"
            +vga.getHarga()+"','"
            +vga.getJenis()+"','"
            +vga.getUkuran()+"')";
    try {
    
    PreparedStatement card = (PreparedStatement) conn.prepareStatement(insertvga);
//    
////    card.setString(1, vga.getTanggal_pembelian());
////    card.setString(2, vga.getMerek());
////    card.setInt(3, vga.getHarga());
////    card.setString(4, vga.getJenis());
////    card.setString(5, vga.getWarna());
//    
    card.execute();
    }
    catch(Exception e){
        System.out.println("eror "+e);
    }
    }
    
}
