/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection;

import java.util.List;
import User.User;
/**
 *
 * @author ADMIN
 */
public class UserService {
    private JDBC userDao;
    public UserService(){
        userDao=new JDBC();
    }
    public List<User> getAllBook(){
        return userDao.getAllBook();
    }
}
