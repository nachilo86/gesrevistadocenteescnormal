/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.util.Date;

/** @author IgnacioSaravia <ILSSoftware2014>  */
public class Licencia {
    private int codlicencia;
    private int codhoradesignada;
    
    private Date fechaDesde;
    private Date fechaHasta;
    private Date fechaOperacion;
    private String normativa;
    private String observaciones;
    private String estado;
    

    
    
    //METODOS
    
    /**
     * @return the fechaDesde
     */
    public Date getFechaDesde() {
        return fechaDesde;
    }

    /**
     * @param fechaDesde the fechaDesde to set
     */
    public void setFechaDesde(Date fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    /**
     * @return the fechaHasta
     */
    public Date getFechaHasta() {
        return fechaHasta;
    }

    /**
     * @param fechaHasta the fechaHasta to set
     */
    public void setFechaHasta(Date fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    /**
     * @return the fechaOperacion
     */
    public Date getFechaOperacion() {
        return fechaOperacion;
    }

    /**
     * @param fechaOperacion the fechaOperacion to set
     */
    public void setFechaOperacion(Date fechaOperacion) {
        this.fechaOperacion = fechaOperacion;
    }

    /**
     * @return the normativa
     */
    public String getNormativa() {
        return normativa;
    }

    /**
     * @param normativa the normativa to set
     */
    public void setNormativa(String normativa) {
        this.normativa = normativa;
    }

    /**
     * @return the observaciones
     */
    public String getObservaciones() {
        return observaciones;
    }

    /**
     * @param observaciones the observaciones to set
     */
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
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
    
        public void registrarLicencia()
    {
        
    }
    
    public void consultarLicencia()
    {
        
    }
    
    public void modificarLicencia()
    {
        
    }
    
    public void eliminarLicencia()
    {
        
    }

    public void verificarEstado()
    {
        
    }
    
    public void actualizarEstado()
    {
        
    }
   
}
