/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cvg.capp.controller;

import org.slf4j.LoggerFactory;
import com.cvg.capp.domain.Contact;
import com.cvg.capp.service.ContactService;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.HttpMediaTypeNotAcceptableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 *
 * @author ccarr
 */
@RestController
@RequestMapping(value = "/user/api/contact")
@EnableWebMvc
public class restContactController {
    
  
    @Autowired
    private ContactService contactService;
    
//Things I used for testing    
    
//    @RequestMapping(value = "/test2", method = RequestMethod.GET)
//    public ResponseEntity<Contact> test(){
//        Contact test2 = new Contact(205, 11, "test2", "4178490260", "blank", "blank", "remaks");
//        System.out.println(test2.getContactId());
//        return ResponseEntity.ok().body(test2);
//    }
    
    
    
    //single contact
    @RequestMapping(value = "/{contactId}", method = RequestMethod.GET)
    public Contact singleContact(@PathVariable("contactId") int contactId) {
        System.out.println(contactService.findById(contactId));
    return contactService.findById(contactId);
    }
    
          
    
}
