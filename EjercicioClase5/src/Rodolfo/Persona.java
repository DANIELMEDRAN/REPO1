package Rodolfo;

public class Persona {
//Attributes
String nombre;
String apellido;
String dni;
int fechaDeNacimiento;
// Meted constructor
public Persona(String nombre, String apellido, String dni, int fechaDeNacimiento) {
	super();
	this.nombre = nombre;
	this.apellido = apellido;
	this.dni = dni;
	this.fechaDeNacimiento = fechaDeNacimiento;
}
// getters setters
public String getNombre() {
	return this.nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public void setApellido(String apellido) {
	this.apellido = apellido;
}
public String getDni() {
	return dni;
}
public void setDni(String dni) {
	this.dni = dni;
}
public int getFechaDeNacimiento() {
	return fechaDeNacimiento;
}
public void setFechaDeNacimiento(int fechaDeNacimiento) {
	this.fechaDeNacimiento = fechaDeNacimiento;
}
	
public void saludar() {
	System.out.println("hola mi nombre es" + this.nombre);
}
}