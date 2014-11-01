/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import hibernate.mapping.Docente;
import hibernate.mapping.Materia;
import java.util.List;

/** @author IgnacioSaravia <ILSSoftware2014>  */
public interface DocenteDAO {
        /* 1) DEFINO LA INTERFACE */
    /* DEFINO EL METODO INSERTAR */
    public void registrarDocente (Docente miDocente);
   
    public List<Docente> consultarTodo();
    
    public Docente consultarDocente(int coddocente);
    
    public void modificarDocente(Docente miDocente);
    
    public void eliminarDocente(Docente miDocente);
   
}
