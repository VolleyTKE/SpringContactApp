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
public class TestUserDAOFindSingleRecord {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        UserDAO userDAO = ctx.getBean(UserDAO.class);
        
        
        //TO DO: The user details will be found
        User u = userDAO.findById(4);
        
        
        System.out.println("!!---User Detail---!!");
        System.out.println(u.getUserId());
        System.out.println(u.getName());
        System.out.println(u.getPhone());
        System.out.println(u.getEmail());
        System.out.println(u.getLoginName());
        System.out.println(u.getLoginStatus());
        System.out.println(u.getRole());
        
        
        
    }
    
}
