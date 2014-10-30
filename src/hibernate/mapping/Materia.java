package hibernate.mapping;
// Generated 29-oct-2014 19:13:10 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Materia generated by hbm2java
 */
public class Materia  implements java.io.Serializable {


     private int codmateria;
     private String nombremateria;
     private int curso;
     private int division;
     private double totalhorasmateria;
     private String estadomateria;
     private Set horadesignadas = new HashSet(0);

    public Materia() {
    }

	
    public Materia(int codmateria, String nombremateria, int curso, int division, double totalhorasmateria, String estadomateria) {
        this.codmateria = codmateria;
        this.nombremateria = nombremateria;
        this.curso = curso;
        this.division = division;
        this.totalhorasmateria = totalhorasmateria;
        this.estadomateria = estadomateria;
    }
    public Materia(int codmateria, String nombremateria, int curso, int division, double totalhorasmateria, String estadomateria, Set horadesignadas) {
       this.codmateria = codmateria;
       this.nombremateria = nombremateria;
       this.curso = curso;
       this.division = division;
       this.totalhorasmateria = totalhorasmateria;
       this.estadomateria = estadomateria;
       this.horadesignadas = horadesignadas;
    }
   
    public int getCodmateria() {
        return this.codmateria;
    }
    
    public void setCodmateria(int codmateria) {
        this.codmateria = codmateria;
    }
    public String getNombremateria() {
        return this.nombremateria;
    }
    
    public void setNombremateria(String nombremateria) {
        this.nombremateria = nombremateria;
    }
    public int getCurso() {
        return this.curso;
    }
    
    public void setCurso(int curso) {
        this.curso = curso;
    }
    public int getDivision() {
        return this.division;
    }
    
    public void setDivision(int division) {
        this.division = division;
    }
    public double getTotalhorasmateria() {
        return this.totalhorasmateria;
    }
    
    public void setTotalhorasmateria(double totalhorasmateria) {
        this.totalhorasmateria = totalhorasmateria;
    }
    public String getEstadomateria() {
        return this.estadomateria;
    }
    
    public void setEstadomateria(String estadomateria) {
        this.estadomateria = estadomateria;
    }
    public Set getHoradesignadas() {
        return this.horadesignadas;
    }
    
    public void setHoradesignadas(Set horadesignadas) {
        this.horadesignadas = horadesignadas;
    }




}


