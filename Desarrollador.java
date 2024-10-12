package mx.unam.fi.poo.g1.p8;

import mx.unam.fi.poo.g1.p8.Empleado;

/**
 * Clase Desarrollador extends Empleado
 * @author Axel Cote 
 * @version Octubre-2024
**/

public class Desarrollador extends Empleado {
  /**
   * Metodo Constructor
   * Para construir objetos Desarrollador
   * @param nombre -> Atributo para el nombre del Desarrollador
   * @param direccion -> Atributo para la direccion del Desarrollador
   * @param salario -> Atributo para el salario del Desarrollador
   * @param nombreDeTrabajo -> Atributo para el nombreDeTrabajo del Desarrollador
   * @param rol -> Atributo para el rol del Desarrollador
  **/

  public Desarrollador(String nombre, String direccion, double salario, String nombreDeTrabajo, String rol) {
    super(nombre, direccion, salario, nombreDeTrabajo, rol);
  }

  /**
   * Sobrescribe el metodo getBono de la clase Empleado
   * @return bono -> bono del empleado multiplicado por 0.15
  **/

  @Override
  public double getBono() {
    return getSalario() * 0.15; 
  }

  /**
   * Sobrescribe el metodo reporteDesempeño de la clase Empleado
   * @return cadena -> cadena que marca su desempeño
  **/

  @Override
  public String reporteDesempeño(String reporte) {
    return getNombre() + " ha realizado de manera " + reporte + " su trabajo";
  }

  /**
   * Sobrescribe el metodo manejoDeProyectos de la clase Empleado
   * @return cadena -> cadena que muestra los proyectos en los que se encuentra trabajando
  **/

  @Override
  public String manejoDeProyectos(String proyectos) {
    return getNombre() + " se encuentra trabajando en " + proyectos;
  }

  /**
   * Sobrescribe el metodo calcularSalario de la clase Empleado
   * @return double -> double del salario total incluido bonos
  **/

  @Override
  public double calcularSalario() {
    return getSalario() + getBono();
  }
}
