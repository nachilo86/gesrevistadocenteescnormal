package hibernate.mapping;
// Generated 29-oct-2014 19:13:10 by Hibernate Tools 3.2.1.GA


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Persona generated by hbm2java
 */
public class Persona  implements java.io.Serializable {


     private int codpersona;
     private String nombre;
     private String apellido;
     private int dni;
     private String domicilio;
     private String localidad;
     private String telefono;
     private int numero;
     private String barrio;
     private char sexo;
     private Date fechanacimiento;
     private Set docentes = new HashSet(0);
     private Set usuarios = new HashSet(0);

    public Persona() {
    }

	
    public Persona(int codpersona, String nombre, String apellido, int dni, String domicilio, String localidad, int numero, String barrio, char sexo, Date fechanacimiento) {
        this.codpersona = codpersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.domicilio = domicilio;
        this.localidad = localidad;
        this.numero = numero;
        this.barrio = barrio;
        this.sexo = sexo;
        this.fechanacimiento = fechanacimiento;
    }
    public Persona(int codpersona, String nombre, String apellido, int dni, String domicilio, String localidad, String telefono, int numero, String barrio, char sexo, Date fechanacimiento, Set docentes, Set usuarios) {
       this.codpersona = codpersona;
       this.nombre = nombre;
       this.apellido = apellido;
       this.dni = dni;
       this.domicilio = domicilio;
       this.localidad = localidad;
       this.telefono = telefono;
       this.numero = numero;
       this.barrio = barrio;
       this.sexo = sexo;
       this.fechanacimiento = fechanacimiento;
       this.docentes = docentes;
       this.usuarios = usuarios;
    }
   
    public int getCodpersona() {
        return this.codpersona;
    }
    
    public void setCodpersona(int codpersona) {
        this.codpersona = codpersona;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getDni() {
        return this.dni;
    }
    
    public void setDni(int dni) {
        this.dni = dni;
    }
    public String getDomicilio() {
        return this.domicilio;
    }
    
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    public String getLocalidad() {
        return this.localidad;
    }
    
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public int getNumero() {
        return this.numero;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getBarrio() {
        return this.barrio;
    }
    
    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }
    public char getSexo() {
        return this.sexo;
    }
    
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public Date getFechanacimiento() {
        return this.fechanacimiento;
    }
    
    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }
    public Set getDocentes() {
        return this.docentes;
    }
    
    public void setDocentes(Set docentes) {
        this.docentes = docentes;
    }
    public Set getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Set usuarios) {
        this.usuarios = usuarios;
    }

    public void registrarPersona()
    {
        
    }
    
    public void modificarPersona()
    {
        
    }
    
    public void eliminarPersona()
    {
        
    }
    
    public void consultarPersona()
    {
        
    }
    
    public void verificarPersona()
    {
    
    }


}


