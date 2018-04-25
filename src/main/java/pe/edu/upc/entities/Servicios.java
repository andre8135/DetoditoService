package pe.edu.upc.entities;
// Generated 01-jul-2017 17:48:51 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Servicios generated by hbm2java
 */
public class Servicios  implements java.io.Serializable {


     private Integer id;
     private Categorias categorias;
     private Departamentos departamentos;
     private Distritos distritos;
     private Proveedores proveedores;
     private Provincias provincias;
     private String nombre;
     
     private boolean contactar;
     private String descripcion;
     private String observaciones;
     private String estado;
     private Set reclamoses = new HashSet(0);
     private Set pedidoses = new HashSet(0);

    public Servicios() {
    }

	
    public Servicios(Categorias categorias, Departamentos departamentos, Distritos distritos, Proveedores proveedores, Provincias provincias, String nombre, boolean contactar,String estado) {
        this.categorias = categorias;
        this.departamentos = departamentos;
        this.distritos = distritos;
        this.proveedores = proveedores;
        this.provincias = provincias;
        this.nombre = nombre;
        this.contactar = contactar;
        this.estado=estado;
    }
    public Servicios(Categorias categorias, Departamentos departamentos, Distritos distritos, Proveedores proveedores, Provincias provincias, String nombre, boolean contactar, String descripcion, String observaciones, String estado,Set reclamoses, Set pedidoses) {
       this.categorias = categorias;
       this.departamentos = departamentos;
       this.distritos = distritos;
       this.proveedores = proveedores;
       this.provincias = provincias;
       this.nombre = nombre;
       this.contactar = contactar;
       this.descripcion = descripcion;
       this.observaciones = observaciones;
       this.reclamoses = reclamoses;
       this.pedidoses = pedidoses;
       this.estado=estado;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Categorias getCategorias() {
        return this.categorias;
    }
    
    public void setCategorias(Categorias categorias) {
        this.categorias = categorias;
    }
    public Departamentos getDepartamentos() {
        return this.departamentos;
    }
    
    public void setDepartamentos(Departamentos departamentos) {
        this.departamentos = departamentos;
    }
    public Distritos getDistritos() {
        return this.distritos;
    }
    
    public void setDistritos(Distritos distritos) {
        this.distritos = distritos;
    }
    public Proveedores getProveedores() {
        return this.proveedores;
    }
    
    public void setProveedores(Proveedores proveedores) {
        this.proveedores = proveedores;
    }
    public Provincias getProvincias() {
        return this.provincias;
    }
    
    public void setProvincias(Provincias provincias) {
        this.provincias = provincias;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public boolean isContactar() {
        return this.contactar;
    }
    
    public void setContactar(boolean contactar) {
        this.contactar = contactar;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getObservaciones() {
        return this.observaciones;
    }
    
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    public Set getReclamoses() {
        return this.reclamoses;
    }
    
    public void setReclamoses(Set reclamoses) {
        this.reclamoses = reclamoses;
    }
    public Set getPedidoses() {
        return this.pedidoses;
    }
    
    public void setPedidoses(Set pedidoses) {
        this.pedidoses = pedidoses;
    }

       /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }




}


