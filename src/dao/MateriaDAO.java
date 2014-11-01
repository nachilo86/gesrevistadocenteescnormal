/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import hibernate.mapping.Materia;
import java.util.List;

/** @author IgnacioSaravia <ILSSoftware2014>  */
public interface MateriaDAO {
        /* 1) DEFINO LA INTERFACE */
    /* DEFINO EL METODO INSERTAR */
  
    public void registrarMateria (Materia materia);
   
    public List<Materia> consultarTodo();
    
    public Materia consultarMateria(int codmateria);
    
    public void modificarMateria(Materia miMateria);
    
    public void eliminarMateria(Materia miMateria);
   

}
