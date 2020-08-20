/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Etxeb
 */
public class Persona {

   private String nombre;
   private int peso;
   private double altura;
   private Date fechaNacimiento;

    public Persona(String nombre, int peso, double altura, Date fechaNacimiento) {
        this.nombre = nombre;
        this.peso = peso;
        this.altura = altura;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", peso=" + peso + ", altura=" + altura + ", fechaNacimiento=" + fechaNacimiento.getYear() +" / "+fechaNacimiento.getMonth() +" / "+ fechaNacimiento.getDay() + '}';
    }
   
   public double calcularImc(){
        double result = peso/Math.pow(altura, 2);
        
        return result;
    }
   
   public String clasificarImc(double imc){
       String clasificacion="";
       
       
       return clasificacion;
   }
   
   public int calcularEdad(Date fechaNacimiento){
       int año = fechaNacimiento.getYear();
       int mes = fechaNacimiento.getMonth();
       int dia = fechaNacimiento.getDay();
       
       return 0;
   }
   
   
    
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juana", 65, 1.70, new Date(1998, 5, 15));
        Persona persona2 = new Persona("Pedrito", 75, 1.45, new Date(1993, 2, 11));

        System.out.println(persona1.toString());

        System.out.println(persona1.calcularImc());
        System.out.println(persona2.calcularImc());

        Calendar fecha = new GregorianCalendar();
        int año = fecha.get(Calendar.YEAR);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        int mes = fecha.get(Calendar.MONTH);

        System.out.println(año + " / " + (mes + 1) + " / " + dia);
            
    }
    
}
