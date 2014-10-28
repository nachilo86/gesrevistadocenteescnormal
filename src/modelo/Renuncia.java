/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.util.Date;

/** @author IgnacioSaravia <ILSSoftware2014>  */
public class Renuncia {
    private int codrenuncia;
    private int codhoradesignada;
    
    private Date fechaRenuncia;
    private Date fechaOperacion;
    private String normativa;
    private String observaciones;
    private String estado;

    
    //METODOS
   
    /**
     * @return the fechaRenuncia
     */
    public Date getFechaRenuncia() {
        return fechaRenuncia;
    }

    /**
     * @param fechaRenuncia the fechaRenuncia to set
     */
    public void setFechaRenuncia(Date fechaRenuncia) {
        this.fechaRenuncia = fechaRenuncia;
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
    
     public void registrarRenuncia()
    {
    }
    
    public void consultarRenuncia()
    {
    }
    
    public void modificarRenuncia()
    {
    }
    
    public void eliminarRenuncia()
    {
    }
    
    public void verificarEstado()
    {
        
    }
    
    public void actualizarEstado()
    {
        
    }
    
}
