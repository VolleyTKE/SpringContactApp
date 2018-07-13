/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cvg.capp.dao;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;

/**
 *
 * @author ccarr
 */

//NOTE: Do NOT use @Repository or @Service or @Component annotation
public class BaseDAO extends NamedParameterJdbcDaoSupport   {
    @Autowired
    public void setDataSource2(DataSource ds)   {
        super.setDataSource(ds);
    }
    
}
