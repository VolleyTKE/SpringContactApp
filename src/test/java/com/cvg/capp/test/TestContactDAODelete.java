/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cvg.capp.test;

import com.cvg.capp.config.SpringRootConfig;
import com.cvg.capp.dao.ContactDAO;
import com.cvg.capp.dao.UserDAO;
import com.cvg.capp.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author ccarr
 */
public class TestContactDAODelete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        
        
        ContactDAO contactDAO = ctx.getBean(ContactDAO.class);
        
        //TO DO: The user details will be deleted
        contactDAO.delete(115);
        
        System.out.print("!!---Data Deleted ---!!");
        
    }
    
}
