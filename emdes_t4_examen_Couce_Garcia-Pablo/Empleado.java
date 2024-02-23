package Examen_Pablo_Couce;

/**
 * La Clase Empleado  representa un empleado con su nombre, id y sueldo
 * tambien tiene metodos para acceder y modificar sus propiedades
 *
 * @author  Pablo
 * @version 1.0
 * @since 2024-02-23
 */

public class Empleado {
    // Atributos de la clase

    /**
     *Nombre del empleado
     */
    private String nombre;
    /**
     * ID del empleado
     */
    private String id;
    /**
     * Sueldo del empleado
     */
    private double sueldo;


    /**
     *
     * @param nombre Nombre del empleado
     * @param id ID del empleado
     * @param sueldo Sueldo del empleado
     */

    public Empleado(String nombre, String id, double sueldo) {
        this.nombre = nombre;
        this.id = id;
        this.sueldo = sueldo;
    }


    /**
     * Obtines el nombre del empleado
     * @return nombre del empleadp
     */
    public String getNombre() {
        return nombre;
    }


    /**
     * Establece el nombre del empleado
     * @param nombre nombre del empleado
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    /**
     * Obtienes el ID del empleado
     * @return ID del empleado
     */
    public String getId() {
        return id;
    }


    /**
     * Obtines el sueldo del empleado
     * @return sueldo del empleado
     */
    public double getSueldo() {
        return sueldo;
    }


    /**
     * Establces el sueldo del empleado
     * @param sueldo sueldo del empleado
     */
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }


    /**
     * Incrementos el sueldo del empleado segun el valor que quieras
     * @param incremento el valor que representa el incremento del sueldo del empleado
     */
    public void incrementarSueldo(double incremento) {
        this.sueldo += incremento;
    }

    /**
     * Muestra todos las caracteristicas del empleado
     * @return las caracyeristicas del empleado
     */
    @Override
    public String toString() {
        return "javadoc.Empleado{" + "nombre='" + nombre + '\'' + ", id='" + id + '\'' + ", sueldo=" + sueldo +
                '}';
    }
}