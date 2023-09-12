/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import Utils.DBUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Popun
 */
public class UserDAO {
    
Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public UserDTO checkUser(String user_email, String user_pass) {
        try {
            String query = "select * from users where user_email = ? and user_pass = ?";
            conn = new DBUtils().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, user_email);
            ps.setString(2, user_pass);
            rs = ps.executeQuery();
            while (rs.next()) {
                UserDTO user = new UserDTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                return user;
            }
        } catch (Exception e) {
        }
        return null;
    }
    
    public void updateUser(int user_id, String user_name, String user_pass) {
      String sql = "update users set user_name =? , user_pass = ? where user_id = ?";
        try {
            conn = new DBUtils().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, user_name);
            ps.setString(2, user_pass);
            ps.setInt(3, user_id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public UserDTO checkAcc(String user_email){
            try {
                String query = "select * from users where user_email = ?";
                conn = new DBUtils().getConnection();
                ps = conn.prepareStatement(query);
                ps.setString(1, user_email);
                rs = ps.executeQuery();
                while(rs.next()){
                   UserDTO a = new UserDTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                   return a;
                }
            } catch (Exception e) {
            }
        return null;
    }
    
    public void signup(String user_email, String user_pass){
            try {
                String query = "insert into users values(?,?,?,?)";
                conn = new DBUtils().getConnection();
                ps = conn.prepareStatement(query);
                ps.setString(1, "");
                ps.setString(2, user_email); 
                ps.setString(3, user_pass);
                ps.setString(4, "False"); 
                ps.executeUpdate();
            } catch (Exception e) {
            };
    }
    
    public List<UserDTO> getUser() {
        List<UserDTO> list = new ArrayList<>();
        String sql = "select * from users";
        try {
            conn = new DBUtils().getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new UserDTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }
    
    public void setAdmin(int user_id, String isAdmin){
        String sql = "update users set isAdmin= ? where user_id = ?";
        try {
        conn = new DBUtils().getConnection();
        ps = conn.prepareStatement(sql);
        ps.setInt(2, user_id);
        ps.setString(1, isAdmin.toUpperCase());
        ps.executeUpdate();
        } catch (Exception e) {
        }
        
    }

}
