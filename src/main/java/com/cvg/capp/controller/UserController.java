/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cvg.capp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *Handles User related operations
 * @author ccarr
 */
@Controller
public class UserController {
    
    
    //giving value means you can add multiple mappings
    //"/" is the default mapping
    @RequestMapping(value = {"/", "/index"})
    public String index() {
        //index is the page name 
        //prefix is /web-inf/view
        //suffix is .jsp
        return "index"; //JSP - /WEB-INF/view/index.jsp
    }
    
}
