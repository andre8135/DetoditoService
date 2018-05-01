/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testPruebasEquivalentes;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import pe.edu.upc.DataAccess.ChangePassword;
import pe.edu.upc.DataAccess.IChangePassword;

import pe.edu.upc.entities.Usuarios;

/**
 *
 * @author Renato
 */
public class testCambiarContrasenia {
    @Test
    public void testCambiarPassword1(){
        Usuarios us = new Usuarios();     
        IChangePassword passRep = new ChangePassword();
        us = passRep.GetUsuario("diego@gmail.com");
        String newpass= "123457";
        
        assertTrue(("123456").equals(us.getPassword()) && 
                !newpass.equals(us.getPassword())
                && !newpass.isEmpty()
                && newpass.length() >= 6);
    }
    
    @Test
    public void testCambiarPassword2(){
        Usuarios us = new Usuarios();

        IChangePassword passRep = new ChangePassword();
       

          try{
        us = passRep.GetUsuario("diego@gmail.com"); 
        String newpass= "123456";        
        assertFalse(("123456").equals(us.getPassword()) && 
                !newpass.equals(us.getPassword())
                && !newpass.isEmpty()
                && newpass.length() >= 6);
        }catch(Exception ex){
           assertTrue(true);
        }
    }
    
    @Test
    public void testCambiarPassword3(){
        Usuarios us = new Usuarios();
       

        IChangePassword passRep = new ChangePassword();
        
         try{
        us = passRep.GetUsuario("diego@gmail.com");        
        String newpass = null;        
        assertFalse(("123456").equals(us.getPassword()) && 
                !newpass.equals(us.getPassword()) 
                && !newpass.isEmpty()
                && newpass.length() >= 6);
        }catch(Exception ex){
            assertTrue(true);
        }
    }
     @Test
    public void testCambiarPassword4(){
        Usuarios us = new Usuarios();
   

         IChangePassword passRep = new ChangePassword();  

         try{
        us = passRep.GetUsuario("diego@gmail.com");
       
        String newpass= "12345";
        
        assertFalse(("123456").equals(us.getPassword()) && 
                !newpass.equals(us.getPassword()) && !newpass.isEmpty()
                && newpass.length() >= 6);
        }catch(Exception ex){
            assertTrue(true);
        }
    }
       @Test
    public void testCambiarPassword5(){
        Usuarios us = new Usuarios();
   

         IChangePassword passRep = new ChangePassword();  

         try{
        us = passRep.GetUsuario("diego@gmail.com");
       
        String newpass= "123ad";
        
        assertFalse(("123456").equals(us.getPassword()) && 
                !newpass.equals(us.getPassword()) && !newpass.isEmpty()
                && newpass.length() >= 6);
        }catch(Exception ex){
            assertTrue(true);
        }
    }
    
       @Test
    public void testCambiarPassword6(){
        Usuarios us = new Usuarios();
   

         IChangePassword passRep = new ChangePassword();  

         try{
        us = passRep.GetUsuario("diego@gmail.com");
       
        String newpass= "123457";
        
        assertFalse(("123ad").equals(us.getPassword()) && 
                !newpass.equals(us.getPassword()) && !newpass.isEmpty()
                && newpass.length() >= 6);
        }catch(Exception ex){
            assertTrue(true);
        }
    }
    
    
       @Test
    public void testCambiarPassword7(){
        Usuarios us = new Usuarios();
   

         IChangePassword passRep = new ChangePassword();  

         try{
        us = passRep.GetUsuario("diego@gmail.com");
       
        String newpass= "123457";
        
        assertFalse(("12345").equals(us.getPassword()) && 
                !newpass.equals(us.getPassword()) && !newpass.isEmpty()
                && newpass.length() >= 6);
        }catch(Exception ex){
            assertTrue(true);
        }
    }
    
       @Test
    public void testCambiarPassword8(){
        Usuarios us = new Usuarios();
   

         IChangePassword passRep = new ChangePassword();  

         try{
        us = passRep.GetUsuario("diego@gmail.com");
       
        String newpass= "123457";
        
        assertFalse(("").equals(us.getPassword()) && 
                !newpass.equals(us.getPassword()) && !newpass.isEmpty()
                && newpass.length() >= 6);
        }catch(Exception ex){
            assertTrue(true);
        }
    }
    
    
    
}

