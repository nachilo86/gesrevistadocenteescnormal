/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.util.Date;

/** @author IgnacioSaravia <ILSSoftware2014>  */
public class HoraDesignada {
    
    private int codhoradesignada;
    private int coddocente;
    private int codusuario;
    private int codsituacionrevista;
    private int codmateria;
    
    private Date fechaDesignacion;
    private Date fechaHasta;
    private Date fechaOperacion;
    private String estadoHoras;
    private String caracterDocente;
    private String normativa;
    private String observaciones;
        
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
     * @return the fechaDesignacion
     */
    public Date getFechaDesignacion() {
        return fechaDesignacion;
    }

    /**
     * @param fechaDesignacion the fechaDesignacion to set
     */
    public void setFechaDesignacion(Date fechaDesignacion) {
        this.fechaDesignacion = fechaDesignacion;
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
     * @return the estadoHoras
     */
    public String getEstadoHoras() {
        return estadoHoras;
    }

    /**
     * @param estadoHoras the estadoHoras to set
     */
    public void setEstadoHoras(String estadoHoras) {
        this.estadoHoras = estadoHoras;
    }

    /**
     * @return the caracterDocente
     */
    public String getCaracterDocente() {
        return caracterDocente;
    }

    /**
     * @param caracterDocente the caracterDocente to set
     */
    public void setCaracterDocente(String caracterDocente) {
        this.caracterDocente = caracterDocente;
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
    
    public void designarHoras()
    {
        
    }
      
    public void eliminarHora()
    {
    }
    
    public void consultarHora()
    {
        
    }
    
    public void verificarEstado()
    {
        
    }
    
    public void actualizarEstado()
    {
        
    }
    
}
