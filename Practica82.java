package mx.unam.fi.poo.g1.p8;

import java.util.Scanner;
import mx.unam.fi.poo.g1.p8.*;

/**
 * Clase principal Practica 8 
 * @author Axel Cote 
 * @version Octubre-2024
**/

public class Practica82 {
  /**
   * Metodo main
   * Se ejecuta todo el funcionamiento de la aplicacion
   * @param args -> Arreglo por defecto del metodo main
  **/
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    Manager manager = new Manager("Rene", "Calle 123", 60000.0, "Gerente de POO", "manager");
    System.out.println("El bono del " + manager.getRol() + " " + manager.getNombre() + " es: " + manager.getBono());
    System.out.println(manager.reporteDesempeño("correcta"));
    System.out.println(manager.manejoDeProyectos("la capacitacion de juniors"));
    System.out.println("Salario total del " + manager.getRol() + " " + manager.getNombre() + ": " + manager.calcularSalario());
    System.out.println();


    Desarrollador desarrollador = new Desarrollador("Axel", "Calle siempre viva", 40000.0, "Desarrollador de POO", "desarrollador");
    System.out.println("El bono del " + desarrollador.getRol() + " " + desarrollador.getNombre() + " es: " + desarrollador.getBono());
    System.out.println(desarrollador.reporteDesempeño("ineficiente"));
    System.out.println(desarrollador.manejoDeProyectos("front y backend de la aplicación"));
    System.out.println("Salario total del " + desarrollador.getRol() + " " + desarrollador.getNombre() + ": " + desarrollador.calcularSalario());
    System.out.println();

    Programador programadora = new Programador("Alejandra", "Calle muy muy lejana", 45000.0, "Desarrollador de POO", "programadora");
    System.out.println("El bono del " + desarrollador.getRol() + " " + desarrollador.getNombre() + " es: " + desarrollador.getBono());
    System.out.println(programadora.reporteDesempeño("eficiente"));
    System.out.println(programadora.manejoDeProyectos("mantenimiento del rest server"));
    System.out.println("Salario total de la " + programadora.getRol() + " " + programadora.getNombre() + ": " + programadora.calcularSalario());
    System.out.println();
  }
}
