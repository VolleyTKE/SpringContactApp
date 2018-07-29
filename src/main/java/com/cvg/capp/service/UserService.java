/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cvg.capp.service;

import com.cvg.capp.domain.User;
import com.cvg.capp.exception.UserBlockedException;
import java.util.List;

/**
 *
 * @author ccarr
 */
public interface UserService {
    
    public static final Integer LOGIN_STATUS_ACTIVE=1;
    public static final Integer LOGIN_STATUS_BLOCKED=2;
    
    public static final Integer ROLE_ADMIN=1;
    public static final Integer ROLE_USER=2;
    
    
    
    /**
     * The method handle the user registration task
     * @param u 
     */
    public void register(User u);
    
    /**
     * The method handles login operation(authentication) using given creds, 
     * It returns user object on success and null when failed, exceptino will be thrown
     * @param loginName
     * @param password
     * @return 
     * @throws com.cvg.capp.exception.UserBlockedException 
     */
    public User login(String loginName, String password) throws UserBlockedException;
    
    /**
     * Call this method to get list of reg. users
     * @return 
     */
    public List<User> getUserList();
    
    /**
     * change the user login status for details passed as argument
     * @param userId
     * @param loginStatus 
     */
    public void changeLoginStatus(Integer userId, Integer loginStatus);
        
    /**
     * 
     * @param userId
     * @return 
     */
    public User getUserById(Integer userId);
    
    
    public Boolean isUsernameExist(String username);
    
}
