/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cvg.capp.controller;

import org.slf4j.LoggerFactory;
import com.cvg.capp.domain.Contact;
import com.cvg.capp.service.ContactService;
import java.util.List;
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
import org.springframework.web.bind.annotation.RequestBody;
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
    
  
    //single contact
//    @RequestMapping(value = "/{contactId}", method = RequestMethod.GET)
//    public Contact singleContact(@PathVariable("contactId") int contactId) {
//        System.out.println(contactService.findById(contactId));
//    return contactService.findById(contactId);
//    }
    
    //single contact
    //Session based
    @RequestMapping(value = "/{contactId}", method = RequestMethod.GET)
    public Contact singleSessionContact(@PathVariable("contactId") int contactId, 
            Model m, HttpSession session) {
        Integer userId = (Integer) session.getAttribute("userId");
        m.addAttribute("scontact", contactService.findById(contactId, userId));
        System.out.println(contactService.findById(contactId, userId));
        System.out.println(session.getId());
        
    return contactService.findById(contactId, userId);
    }
    
    //All Users Contacts
    //Session Based
    @RequestMapping(value ="/getAllContacts", method = RequestMethod.GET)
    public List<Contact> getAllContacts(Model m, HttpSession session) {
        Integer userId = (Integer) session.getAttribute("userId");
        m.addAttribute("contactList", contactService.findUserContact(userId));
        System.out.println(contactService.findUserContact(userId));
        return contactService.findUserContact(userId);
    }
    
    
   
   //Update contact, probably need updateDAO by id
//   @RequestMapping(value = "/{contactId}", method = RequestMethod.PUT)
//   public Contact updateContact(@PathVariable("id") long id, @RequestBody Contact c, HttpSession session) {
//       Integer contactId = (Integer) session.getAttribute("aContactId");
//       c.setContactId(contactId);
//       contactService.update(c);
//       session.removeAttribute("aContactId");
//       Integer userId = (Integer) session.getAttribute("userId");
//       
//       return contactService.update(c);
//   }
    
    @RequestMapping(value = "/delete/{contactId}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("contactId") int contactId) {
        contactService.delete(contactId);
    }
        
          
    
}
