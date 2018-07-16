/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cvg.capp.test;

import com.cvg.capp.config.SpringRootConfig;
import com.cvg.capp.dao.UserDAO;
import com.cvg.capp.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author ccarr
 */
public class TestUserDAOUpdate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        
        
        UserDAO userDAO = ctx.getBean(UserDAO.class);
        
        //TO DO: The user details will be taken from Update user profile page
        User u = new User();
        u.setUserId(17);
        u.setName("test update");
        u.setPhone("7028675309");
        u.setEmail("test.update@youwish.org");
        u.setAddress("Mumbai, MS");
        u.setRole(1);//Admin Role
        u.setLoginStatus(1);//Active
        
        userDAO.update(u);
        System.out.print("!!---Data Updated ---!!");
        
    }
    
}
