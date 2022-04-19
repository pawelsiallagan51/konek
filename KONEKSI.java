/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aqua.fish;

import java.sql.*;
public class KONEKSI {
   static final String DRIVER= "com.MySQl.jdbc.Driver";
   static final String URL ="jdbc;mysql;//localhost/penjualan";
   static final String USER ="root";
   static final String UPAS_STRING ="";
   static Connection conn;
   static Statement Stat;
   
   public static void NANA (){
   try{
       Class.forName (DRIVER);
        conn= DriverManager.getConnection(URL, USER, UPAS_STRING);
        System.out.println ("koneksi berhasil");
   } catch(Exception e){
       System.out.println("koneksi gagal");
   }
   } 
    public static void main(String[] args) {
        NANA();
    }
}
