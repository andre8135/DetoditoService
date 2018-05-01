/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testPruebasEquivalentes;

import org.junit.Test;
import static org.junit.Assert.*;
import pe.edu.upc.DataAccess.IUsuariosRep;
import pe.edu.upc.DataAccess.UsuariosRep;
import pe.edu.upc.entities.Usuarios;
/**
 *
 * @author Renato
 */
public class testIngresar {
    
    @Test
    public void testIngresar1(){
        
        Usuarios us = new Usuarios();
        IUsuariosRep usuarioRep = new UsuariosRep(); 
        us = usuarioRep.GetUsuario("diego@gmail.com");
        
        assertTrue(("diego@gmail.com").toString().equals( us.getCorreoElectronico()) && ("123456").toString().equals(us.getPassword())) ;
    }
    
    
    @Test
    public void testIngresar2(){
        
        Usuarios us = new Usuarios();
        IUsuariosRep usuarioRep = new UsuariosRep(); 
        
        
        try{
        us = usuarioRep.GetUsuario("diego@gmail.com");
        
        assertFalse(("diego@gmail.com").toString().equals( us.getCorreoElectronico()) && ("123ad").toString().equals(us.getPassword()));
        }catch(Exception ex){
            assertTrue(true);
        }
    }
    
    
    @Test
    public void testIngresar3(){
        
        Usuarios us = new Usuarios();
        IUsuariosRep usuarioRep = new UsuariosRep(); 
        
        
        try{
        us = usuarioRep.GetUsuario("diego@gmail.com");
        assertFalse(("diego@gmail.com").toString().equals( us.getCorreoElectronico()) && ("12345").toString().equals(us.getPassword()));
        
        }catch(Exception ex){
            assertTrue(true);
        }
        
    }
    
    
    @Test
    public void testIngresar4(){
        
        Usuarios us = new Usuarios();
        IUsuariosRep usuarioRep = new UsuariosRep(); 
        
        
        try{
        us = usuarioRep.GetUsuario("diego@gmail.com");
        assertFalse(("diego@gmail.com").toString().equals( us.getCorreoElectronico()) && ("").toString().equals(us.getPassword()));
        }catch(Exception ex){
            assertTrue(true);
        }
    }
    
    @Test
    public void testIngresar5(){
        
        Usuarios us = new Usuarios();
        IUsuariosRep usuarioRep = new UsuariosRep(); 
        
         
        try{
        us = usuarioRep.GetUsuario("159");
        assertFalse(("159").toString().equals( us.getCorreoElectronico()) && ("123456").toString().equals(us.getPassword()));
        }catch(Exception ex){
            assertTrue(true);
        }
    }
    
    @Test
    public void testIngresar6(){
        
        Usuarios us = new Usuarios();
        IUsuariosRep usuarioRep = new UsuariosRep(); 
        
        
        try{
        us = usuarioRep.GetUsuario("H0L4");
        assertFalse(("H0L4").toString().equals( us.getCorreoElectronico()) && ("123456").toString().equals(us.getPassword()));
        }catch(Exception ex){
            assertTrue(true);
        }
        
    }
    
    @Test
    public void testIngresar7(){
        
        Usuarios us = new Usuarios();
        IUsuariosRep usuarioRep = new UsuariosRep(); 
        
        try{
        us = usuarioRep.GetUsuario("");
        assertFalse(("").toString().equals( us.getCorreoElectronico()) && ("123456").toString().equals(us.getPassword()));
        }catch(Exception ex){
            assertTrue(true);
        }
    }
    
    @Test
    public void testIngresar8(){
        
        Usuarios us = new Usuarios();
        IUsuariosRep usuarioRep = new UsuariosRep(); 
        
                try{
        us = usuarioRep.GetUsuario("CERO");
        assertFalse(("CERO").toString().equals( us.getCorreoElectronico()) && ("123456").toString().equals(us.getPassword()));
        }catch(Exception ex){
            assertTrue(true);
        }
        
    }
    
    @Test
    public void testIngresar9(){
        
        Usuarios us = new Usuarios();
        IUsuariosRep usuarioRep = new UsuariosRep(); 
        
                try{
        us = usuarioRep.GetUsuario("CERO@");
        assertFalse(("CERO@").toString().equals( us.getCorreoElectronico()) && ("123456").toString().equals(us.getPassword()));
        }catch(Exception ex){
            assertTrue(true);
        }
        
        
    }
}
