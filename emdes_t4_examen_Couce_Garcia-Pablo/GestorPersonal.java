package Examen_Pablo_Couce;

import java.util.ArrayList;
import java.util.List;

/**
 * La GestorPersonal representa una lista de empleado
 * tambien tiene metodos para añadir y sacar empleados de la lista
 * y un metodo para cambiarl el sueldo de un empleado
 *
 * @author  Pablo
 * @version 1.0
 * @since 2024-02-23
 */


public class GestorPersonal {

    /**
     * Lista de empleados
     */
    private List<Empleado> empleados;

    /**
     * la lista de empleados genera el gestor personal
     */
    public GestorPersonal() {
        empleados = new ArrayList<>();
    }

    /**
     * Se contrata a un nuevo empleado, añadiendolo a la lista
     * @param empleado nuevo empleado
     */
    public void contratar(Empleado empleado) {
        empleados.add(empleado);
    }

    /**
     * Se despide a un empleado sacandolo de la lista
     * @param id ID del empleado que se quiere despedir
     * @return la lista de empleados quitando el empleado eliminado
     */
    public boolean despedir(String id) {
        return empleados.removeIf(e -> e.getId().equals(id));
    }

    /**
     * Se cambia el sueldo de un empleado de la lista
     * @param id ID del empleado al que se le quiere cambiar el sueldo
     * @param nuevoSueldo nuevo sueldo que se le dara el empleado
     * @return
     */
    public boolean cambiarSueldo(String id, double nuevoSueldo) {
        for (Empleado empleado : empleados) {
            if (empleado.getId().equals(id)) {
                empleado.setSueldo(nuevoSueldo);
                return true;
            }
        }
        return false;
    }

    /**
     * Obtienes la lista de empleados
     * @return la lista de empleados
     */
    public List<Empleado> getEmpleados() {
        return new ArrayList<>(empleados);
    }
}