package empleadoED_45136170g;

import java.util.*;

public class EmpleadoED_45136170G {

    static final double FACTOR_HORA_EXTRA = 1.2;
    private String nombreCompleto, dni;
    private double salarioBasePorHora = 10.56;

    public EmpleadoED_45136170G(String nombreCompleto, String dni) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
    }

    public static void main(String[] args) {
        EmpleadoED_45136170G emp = new EmpleadoED_45136170G("ALBA MARRADES", "45136170G");
        int horasExtra = 2;
        System.out.println("El salario de " + emp.nombreCompleto + " este mes será de " + emp.getSalarioEsteMes(horasExtra)
                + " euros, al hacer " + horasExtra + " horas extra.");
    }

}
