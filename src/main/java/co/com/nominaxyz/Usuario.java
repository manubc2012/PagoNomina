package co.com.nominaxyz;

import java.util.Scanner;

public class Usuario extends ServiceUtil {
    Scanner sc = new Scanner(System.in);
    private String idUsuario;
    private String nombre;
    private String apellido;
    private String correo;

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public void crearEmpleado(Cargo cargo) {
        System.out.println("Ingrese el id del empleado");
        this.idUsuario = sc.next();
        System.out.println("Ingrese el nombre del empleado");
        this.nombre = sc.next();
        System.out.println("Ingrese el apellido del empleado");
        this.apellido = sc.next();
        System.out.println("Ingrese el correo del empleado");
        this.correo = sc.next();
    }

    @Override
    public void verEmpleado() {
        System.out.println();
        System.out.println(
                "IdUsuario=" + this.idUsuario + "\n"  +
                        "Nombre='" + this.nombre + "\n"  +
                        "Apellido='" + this.apellido + "\n" +
                        "Correo='" + this.correo
        );

    }
}

