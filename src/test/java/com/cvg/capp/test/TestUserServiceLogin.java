/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cvg.capp.test;

import com.cvg.capp.config.SpringRootConfig;
import com.cvg.capp.domain.User;
import com.cvg.capp.exception.UserBlockedException;
import com.cvg.capp.service.UserService;
import java.io.PrintWriter;
import java.io.StringWriter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author ccarr
 */
public class TestUserServiceLogin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UserBlockedException {
        // TODO code application logic here
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        
        
        UserService userService=ctx.getBean(UserService.class);
        
        //TO DO: The user details will be taken from User-Reg-Form
        
        String un = "v";
        String pw = "v123";
        
        
        User u = userService.login(un,pw);
        
        System.out.println("!!---User Logged in Successfully ---!!\n");
        
                String un1 = "tester";
        String pw1 = "test";
        
        try {
        User u1 = userService.login(un1,pw1);
        
    }
        catch (UserBlockedException e1) {
            
            System.out.println(e1.toString());
        }
 
        System.out.println("!!---User1 Denied Log in Successfully ---!!");
        
    
        
    }
}
        
        

    
    
    

