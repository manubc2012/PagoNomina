package co.com.nominaxyz;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuApp {
    Scanner sc = new Scanner (System.in);
    ArrayList<Cargo> cargosArray = new ArrayList();
    ArrayList<Empleado> empleadosArray = new ArrayList();
    ArrayList<Nomina> nominasArray = new ArrayList();

    public void iniciarMenu(){
        System.out.println("Bienvenido al programa de nomina");
        boolean salir = true;

        do{
            System.out.println("Seleccione una opción: ");
            System.out.println("1. Crear Cargo");
            System.out.println("2. Crear Empleado");
            System.out.println("3. Crear Nómina");
            System.out.println("4. imprimir colilla de pago de Nómina");
            System.out.println("5. Salir");
            int opc= sc.nextInt();
            //sc.skip("\n");

            switch(opc){
                case 1:
                    Cargo cargo = new Cargo();
                    cargo.crearCargo();
                    cargosArray.add(cargo);
                    System.out.println("El cargo ha sido creado");
                    break;
                case 2:
                    Empleado empleado = new Empleado();
                    System.out.println("Cual es el cargo de este empleado");
                    String cargoAux = sc.next();
                    Cargo y = validarCargo(cargoAux);
                    if(y != null){
                        empleado.crearEmpleado(y);
                        empleadosArray.add(empleado);
                        System.out.println("El empleado ha sido creado");
                    }else{
                        System.out.println("El cargo no existe, no se puede crear el empleado");
                    }
                    break;
                case 3:
                    Nomina nomina = new Nomina();
                    System.out.println("Ingrese el id del empleado");
                    String idUser = sc.next();
                    Empleado user = validarEmpleado(idUser);
                    boolean siExiste = validarNomina(idUser);

                    if(siExiste == false){
                        if(user == null){
                            System.out.println("No se creo la nómina porque el empleado no existe");

                        } else{
                            nomina.calcularNomina(user);
                            nominasArray.add(nomina);
                            System.out.println("La nómina ha sido creada");
                        }
                    } else{
                        System.out.println("La nómina no ha sido ceada porque el empleado ya existe");
                    }
                    break;
                case 4:
                    System.out.println("Usted va a imprimir la colilla de un Usuario");
                    System.out.println("Ingrese el id del Usuario");
                    String idColilla = sc.next();
                    boolean siExiste2 = false;
                    for(Nomina x: nominasArray){
                        if (x.getEmpleado().getIdUsuario().equalsIgnoreCase(idColilla)){
                            x.imprimirColilla();
                            siExiste2 = true;
                            break;
                        }
                    }

                    if(!siExiste2){
                        System.out.println("No existe una colilla de nómina con ese id");

                    }
                    break;
                case 5:
                    salir = false;
                    System.out.println("Usted va a salir del sistema");
                    break;
                default:
                    System.out.println("Inngrese una opción válida");
            }
        }while(salir);

    }

    public Cargo validarCargo(String cargoEmp){
        for(Cargo y: cargosArray){
            if (y.getNombreCargo().equalsIgnoreCase(cargoEmp)){
                return y;
            }
        }
        return null;
    }

    public Empleado validarEmpleado(String idEmple){
        for(Empleado k : empleadosArray){
            if (k.getIdUsuario().equalsIgnoreCase(idEmple)){
                return k;
            }
        }
        return null;
    }

    public boolean validarNomina (String idEmple){
        for(Nomina x: nominasArray){
            if(x.getEmpleado().getIdUsuario().equalsIgnoreCase(idEmple)){
                return true;
            }

        }
        return false;
    }

}
