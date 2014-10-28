/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.util.Date;

/** @author IgnacioSaravia <ILSSoftware2014>  */
public class Docente extends Persona {
    private int coddocente;
    private int codpersona;
    
    private String titulo;
    private Date fechaTitulo;
    private Date fechaIngreso;
    private int totalHorasActivas;
    private String estado;

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the fechaTitulo
     */
    public Date getFechaTitulo() {
        return fechaTitulo;
    }

    /**
     * @param fechaTitulo the fechaTitulo to set
     */
    public void setFechaTitulo(Date fechaTitulo) {
        this.fechaTitulo = fechaTitulo;
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

    /**
     * @return the totalHorasActivas
     */
    public int getTotalHorasActivas() {
        return totalHorasActivas;
    }

    /**
     * @param totalHorasActivas the totalHorasActivas to set
     */
    public void setTotalHorasActivas(int totalHorasActivas) {
        this.totalHorasActivas = totalHorasActivas;
    }
    
    public void registrarDocente()
    {
    }
    
    public void consultarDocente()
    {
        
    }
    
    public void modificarDocente()
    {
        
    }
    
    public void eliminarDocente()
    {
        
    }
    
    public void verificarDocente()
    {
        
    }
    
    public void verificarCargaHoraria()
    {
        
    }
    
    public void verificarEstado()
    {
        
    }
    
    public void actualizarEstado()
    {
    }
    

}
