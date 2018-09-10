/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cvg.capp.dao;

import com.cvg.capp.domain.Contact;
import com.cvg.capp.domain.User;
import java.util.List;

/**
 *
 * @author ccarr
 */
public interface ContactDAO {
    
    public void save(Contact c);
    public void update(Contact c);
    public void delete(Contact c);
    public void delete(Integer contactId);
    public Contact findById(Integer contactId);
    public Contact findById(Integer contactId, Integer userId);
    public List<Contact> findAll();
    public List<Contact> findByProperty(String propName, Object propValue);
    
}
