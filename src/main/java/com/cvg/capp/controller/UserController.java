/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cvg.capp.controller;

import com.cvg.capp.command.LoginCommand;
import com.cvg.capp.domain.User;
import com.cvg.capp.exception.UserBlockedException;
import com.cvg.capp.service.UserService;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *Handles User related operations
 * @author ccarr
 */
@Controller
public class UserController {
    
    @Autowired
    private UserService userService;
    
    //giving value means you can add multiple mappings
    //"/" is the default mapping
    @RequestMapping(value = {"/", "/index"})
    public String index(Model m) {
        m.addAttribute("command", new LoginCommand());
        //index is the page name 
        //prefix is /web-inf/view
        //suffix is .jsp
        return "index"; //JSP - /WEB-INF/view/index.jsp
    }
    
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String handleLogin(@ModelAttribute("command") LoginCommand cmd, Model m, HttpSession session) {
        try {
            User loggedInUser = userService.login(cmd.getLoginName(), cmd.getPassword());
            if (loggedInUser == null) {
                //FAILED
                //add error message and go back to login-form
                m.addAttribute("err", "Login Failed! Enter valid credentials.");
                return "index";//JSP - Login FORM
            } 
            else //SUCCESS
            //check the role and redirect to a appropriate dashboard 
            {
                if (loggedInUser.getRole().equals(UserService.ROLE_ADMIN)) {
                    //add user detail in session (assign session to logged in user)
                    addUserInSession(loggedInUser, session);
                    return "redirect:admin/dashboard";
                } 
                else if (loggedInUser.getRole().equals(UserService.ROLE_USER)) {
                    //add user detail in session (assign session to logged in user)
                    addUserInSession(loggedInUser, session);
                    return "redirect:user/dashboard";
                } 
                else {
                    //add error message and go back to login-form
                    m.addAttribute("err", "Invalid User ROLE");
                    return "index";//JSP - Login FORM
                }
            }
        } catch (UserBlockedException ex) {
            //add error message and go back to login-form
            m.addAttribute("err", ex.getMessage());
            return "index";//JSP - Login FORM
        }
    }
    
    @RequestMapping(value ="/user/dashboard")
    public String userDashboard() {
        
        return "dashboard_user"; //JSP->dashboard_user.jsp
    }
    
    @RequestMapping(value ="/admin/dashboard")
    public String adminDashboard() {
        return "dashboard_admin"; //JSP->dashboard_admin.jsp
    }
    
    
    //binds user with a session
    private void addUserInSession(User u, HttpSession session) {
        session.setAttribute("user", u);
        session.setAttribute("userId", u);
        session.setAttribute("role", u);
        
    }
}
