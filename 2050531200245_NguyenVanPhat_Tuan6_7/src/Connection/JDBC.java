/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection;

import java.util.List;
import User.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author ADMIN
 */
public class JDBC {
    public List<User> getAllBook(){
        List<User> Users= new ArrayList<User>();
        Connection connection=ConnectionJDBC.getJDBCConnection();
        String sql="SELECT * FROM Books";
        try{
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            ResultSet rs=preparedStatement.executeQuery();
            while (rs.next()){
                User user=new User();
                user.setId(rs.getInt("Id"));
                user.setTiltle(rs.getString("tiltle"));
                user.setPrice(rs.getDouble("Price"));
            
                
              
                
                Users.add(user);
            }
            }catch (SQLException e){
                e.printStackTrace();
            }
            return Users;
        }
    
}
