package co.com.nominaxyz;

import java.util.Scanner;

public class Empleado extends Usuario{
    Scanner sc = new Scanner(System.in);
    protected String area;
    protected Cargo cargo;

    public Empleado() {
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    @Override
    public void crearEmpleado(Cargo cargo){
        super.crearEmpleado(cargo);
        this.cargo = cargo;
        System.out.println("Ingrese el area de trabajo: ");
        this.area = sc.nextLine();
    }

    @Override
    public void verEmpleado(){
        super.verEmpleado();
        System.out.println("Cargo: " + this.cargo.getNombreCargo() + "\n"+
                "Salario: " + this.cargo.getSalario());
    }

}
