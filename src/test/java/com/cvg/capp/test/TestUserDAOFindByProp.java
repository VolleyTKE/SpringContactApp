/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cvg.capp.test;

import com.cvg.capp.config.SpringRootConfig;
import com.cvg.capp.dao.UserDAO;
import com.cvg.capp.domain.User;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author ccarr
 */
public class TestUserDAOFindByProp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        UserDAO userDAO = ctx.getBean(UserDAO.class);
        
        
        //TO DO: The user details will be found
       //List<User> users = userDAO.findByProperty("userId", 4);
         List<User> users = userDAO.findByProperty("role", 1);
       for (User u : users) {
           System.out.println(u.getUserId()+ " " + u.getName() + " " + u.getRole());
           
       }
        
        
        
    }
    
}
