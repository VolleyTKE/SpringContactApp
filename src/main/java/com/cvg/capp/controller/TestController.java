/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cvg.capp.controller;

import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author ccarr
 */

@Controller
public class TestController {
    
    @RequestMapping("/test/hello")
    public String helloWorld()  {
        return "hello"; // -> /WEB-INF/view/hello.jsp
    }
    
    @RequestMapping("/test/ajaxtest")
    public String testPage() {
        return "test";
    }
    
    @RequestMapping("/test/get_time")
    @ResponseBody
    public String getServerTime() {
        System.out.println(" getServerTime() ");
        Date d = new Date();
        return d.toString();
    }
    
    
}
