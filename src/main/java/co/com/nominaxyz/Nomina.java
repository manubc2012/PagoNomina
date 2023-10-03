package co.com.nominaxyz;

import java.util.Scanner;

public class Nomina {
    Scanner sc = new Scanner(System.in);
    private String idNomina;
    private Empleado empleado;
    private double salarioFinal;
    Empleado cargoEmpleado = new Empleado();

    public String getIdNomina() {
        return idNomina;
    }

    public void setIdNomina(String idNomina) {
        this.idNomina = idNomina;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public double getSalarioFinal() {
        return salarioFinal;
    }

    public void setSalariFinal(double salarioFinal) {
        this.salarioFinal = salarioFinal;
    }


    public void calcularNomina(Empleado empleado) {
        System.out.println("Nomina nueva");
        System.out.println("Ingrese el ID de la nómina;");
        this.idNomina = sc.nextLine();
        this.empleado = empleado;
        this.salarioFinal = salarioFinal(empleado.getCargo().getSalario());

    }

    private double salarioFinal(Double salarioBase){
        double salarioMinimo = 1160000;
        double salarioF = 0d;
        double salud = salarioBase * 0.04;
        double pension = salarioBase * 0.05;
        double auxTrans = 140600;

        salarioF = salarioBase - salud - pension;
        if(salarioBase< (salarioMinimo*2)){
            salarioF += auxTrans;
        }
        return salarioF;
    }

    public void imprimirColilla(){
        System.out.println("COLILLA DE PAGO!!");
        System.out.println(
                "ID nomina: " + this.idNomina + "\n" +
        "Salario Final: " + this.salarioFinal + "\n" +
                "Nombre: " + this.empleado.getNombre() + "\n" +
                "Apellido; " + this.empleado.getApellido() + "\n" +
                "Cargo: " + this.empleado.getCargo().getNombreCargo() + "\n" +
                "Area: " + this.empleado.getArea());
    }

}
