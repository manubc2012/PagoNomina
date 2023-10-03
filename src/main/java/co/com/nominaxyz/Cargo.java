package co.com.nominaxyz;

import java.util.Scanner;

public class Cargo {
    Scanner sc = new Scanner(System.in);
    private int idCargo;
    private String nombreCargo;
    private double salario;

    public Cargo() {
    }

    public int getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }

    public String getNombreCargo() {
        return nombreCargo;
    }

    public void setNombreCargo(String nombreCargo) {
        this.nombreCargo = nombreCargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void crearCargo(){
        System.out.println("Ingrese el id del cargo: ");
        this.idCargo = sc.nextInt();
        System.out.println("Ingrese el nombre del cargo: ");
        this.nombreCargo = sc.next();
        System.out.println("Ingrese el salario del cargo: ");
        this.salario = sc.nextDouble();
    }
    public void verCargo(){
        System.out.println(
                "ID: " + this.idCargo + "\n" +
                        "Cargo: " + this.nombreCargo + "\n" +
                        "Salario base: " + this.salario + "\n"
        );
    }

}
