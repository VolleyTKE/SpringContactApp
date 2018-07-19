/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cvg.capp.test;

import com.cvg.capp.config.SpringRootConfig;
import com.cvg.capp.domain.User;
import com.cvg.capp.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author ccarr
 */
public class TestUserServiceRegister {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        
        
        UserService userService=ctx.getBean(UserService.class);
        
        //TO DO: The user details will be taken from User-Reg-Form
        User u = new User();
        u.setName("Service test");
        u.setPhone("7028675309");
        u.setEmail("testService@youwish.org");
        u.setAddress("Mumbai");
        u.setLoginName("ServTest");
        u.setPassword("test");
        u.setRole(UserService.ROLE_ADMIN);//Admin Role
        u.setLoginStatus(UserService.LOGIN_STATUS_ACTIVE);//Active
        userService.register(u);
        System.out.print("!!---User Registered Successfully ---!!");
        
    }
    
}
