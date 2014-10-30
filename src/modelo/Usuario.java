/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.util.Date;

/** @author IgnacioSaravia <ILSSoftware2014>  */
public class Usuario extends Persona{

    private int codpersona;
    private int codusuario;
    
    private String nombreUsuario;
    private String password;
    private int tipoUsuario;
    private String ocupacion;
    private Date fechaIngreso;
    private String estado;
    
    //GETTERS AND SETTERS

    /**
     * @return the nombreUsuario
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * @param nombreUsuario the nombreUsuario to set
     */
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the tipoUsuario
     */
    public int getTipoUsuario() {
        return tipoUsuario;
    }

    /**
     * @param tipoUsuario the tipoUsuario to set
     */
    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    /**
     * @return the ocupacion
     */
    public String getOcupacion() {
        return ocupacion;
    }

    /**
     * @param ocupacion the ocupacion to set
     */
    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }
    
        /**
     * @return the fechaIngreso
     */
    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    /**
     * @param fechaIngreso the fechaIngreso to set
     */
    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    
    //METODOS
    
    public void registrarUsuario()
    {
        
    }
    
    public void consultarUsuario()
    {
        
    }
    
    public void modificarUsuario()
    {
        
    }
    
    public void eliminarUsuario()
    {
        
    }
    
    public void validarUsuario()
    {
        
    }
    
    public void verificarUsuario()
    {
        
    }

    public void actualizarEstado()
    {
        
    }

}
