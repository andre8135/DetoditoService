/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upc.DataAccess;

import pe.edu.upc.entities.Provincias;

/**
 *
 * @author Andre Puente
 */
public interface IProvinciasRep {
    Provincias GetProvinciasById(int provinciaId);
    
}
