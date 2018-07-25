/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cvg.capp.controller;

import com.cvg.capp.domain.Contact;
import com.cvg.capp.service.ContactService;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author ccarr
 */

@Controller
public class ContactController {
    
    @Autowired
    private ContactService contactService;
    
    
    //TODO make contacts ReST-ful
    //Check in the new>webservices
    
    
    @RequestMapping(value = "/user/contact_form")
    public String contactForm(Model m) {
        Contact contact = new Contact();
        m.addAttribute("command", contact);
        return "contact_form"; //JSP form view
    }
    
    @RequestMapping(value = "/user/save_contact")
    public String saveContact(@ModelAttribute("command") Contact c, Model m, HttpSession session) {
        
        try {
            
        Integer userId = (Integer) session.getAttribute("userId");
        c.setUserId(userId); //FK; logged in userId
        contactService.save(c);
        return "redirect:clist?act=sv"; //JSP form view got to clist
        }
        catch(Exception e) {
            e.printStackTrace();
            m.addAttribute("err", "Failed to save Contact");
            return "contact_form";
        }
        
    }
    
    @RequestMapping (value = "/user/clist")
    public String contactList(Model m, HttpSession session) {
        Integer userId = (Integer) session.getAttribute("userId");
        m.addAttribute("contactList", contactService.findUserContact(userId));
        return "clist"; //JSP
    }
    
    @RequestMapping (value = "/user/del_contact")
    public String deleteContact(@RequestParam("cid") Integer contactId) {
        contactService.delete(contactId);
        return "redirect:clist?act=del"; //JSP
    }
    
}
