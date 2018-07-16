/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cvg.capp.rm;

import com.cvg.capp.domain.Contact;
import com.cvg.capp.domain.User;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author ccarr
 */
public class ContactRowMapper implements RowMapper<Contact>{
    
    @Override
    public Contact mapRow(ResultSet rs, int i) throws SQLException {
        Contact c = new Contact();
        c.setContactId(rs.getInt("contactId"));
        c.setUserId(rs.getInt("userId"));
        c.setName(rs.getString("name"));
        c.setEmail(rs.getString("email"));
        c.setAddress(rs.getString("address"));
        c.setPhone(rs.getString("phone"));
        c.setRemark(rs.getString("remark"));
        
        return c;
    }
    
}
