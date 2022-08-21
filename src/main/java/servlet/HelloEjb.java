/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import javax.ejb.Stateless;

/**
 *
 * @author akiba
 */
@Stateless
public class HelloEjb {
    
    public String hello(){
        return "Hello";
    }
    
}
