/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cvg.capp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author ccarr
 */

@Configuration
@ComponentScan(basePackages = {"com.cvg"})
public class SpringRootConfig {
    //To Do: Services, DAO, DataSource, Email Sender, ETC, Business Layer Beans
}
