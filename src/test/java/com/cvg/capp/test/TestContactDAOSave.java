/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cvg.capp.test;

import com.cvg.capp.config.SpringRootConfig;
import com.cvg.capp.dao.ContactDAO;
import com.cvg.capp.domain.Contact;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author ccarr
 */
public class TestContactDAOSave {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        
        
        ContactDAO contactDAO = ctx.getBean(ContactDAO.class);
        
        //TO DO: The user details will be taken from User-Reg-Form
        Contact c = new Contact();
        
        c.setContactId(115);
        c.setUserId(4);
        c.setName("115testContact");
        c.setPhone("7028675309");
        c.setEmail("test115@youwish.org");
        c.setAddress("Mumbai");
        c.setRemark("This test the contact");
        
        contactDAO.save(c);
        System.out.print("!!---Data Saved ---!!");
        
    }
    
}
