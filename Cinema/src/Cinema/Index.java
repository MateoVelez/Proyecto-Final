/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cinema;

import Cinema.ClienteAfiliado;
import Cinema.ClienteAfiliadoDB;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author udemy
 */
public class Index {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String opcion = "";
        String salir = "n";
        Scanner sc = new Scanner(System.in);
        ClienteAfiliado cliente = new ClienteAfiliado();
        Cortesia cortesia = new Cortesia();
        Pelicula pelicula = new Pelicula();
        System.out.println("Bienvenido al menu de administracion del cinema");
        System.out.println("1.Clientes");
        System.out.println("2.Cortesias");
        System.out.println("3.Peliculas");
        String opcion0 = sc.nextLine();
        switch (opcion0) {
            //Clientes
            case "1":
                System.out.println("Seleccione la opcion que desea realizar");
                System.out.println("1-Agregar nuevo Cliente");
                System.out.println("2- Editar Cliente existente");
                System.out.println("3- ver listado de Cliente");
                System.out.println("4-Borrar Cliente");
                System.out.println("5-Salir");
                opcion = sc.nextLine();
                switch (opcion) {
                    case "1":
                        Scanner sclibro = new Scanner(System.in);
                        System.out.println("Introduzca la cedula del cliente:");
                        cliente.setIdPersona(sc.nextInt());
                        System.out.println("Introduzca el nombre del cliente");
                        cliente.setNombrePersona(sc.next());
                        System.out.println("Introduzca el telefono del cliente");
                        cliente.setTelefonoPersona(sc.next());
                        System.out.println("Introduzca el numero de  la tarjeta del cliente");
                        cliente.setIdTarjetaAfiliacion(sc.nextInt());
                        System.out.println("Introduzca el saldo de  la tarjeta del cliente");
                        cliente.setSaldoTarjeta(sc.nextDouble());
                        ClienteAfiliadoDB clientedb = new ClienteAfiliadoDB();
                        clientedb.insertar(cliente);
                        break;
                    case "2":
                        Scanner sc1 = new Scanner(System.in);
                        System.out.println("Introduzca la cedula del cliente:");
                        cliente.setIdPersona(sc1.nextInt());
                        System.out.println("Introduzca el nombre del Cliente");
                        cliente.setNombrePersona(sc1.next());
                        System.out.println("Introduzca el telefono del Cliente");
                        cliente.setTelefonoPersona(sc1.next());
                        System.out.println("Introduzca el numero de  la tarjeta del cliente");
                        cliente.setIdTarjetaAfiliacion(sc1.nextInt());
                        System.out.println("Introduzca el saldo de  la tarjeta del cliente");
                        cliente.setSaldoTarjeta(sc1.nextDouble());
                        ClienteAfiliadoDB librodbe = new ClienteAfiliadoDB();
                        librodbe.actualizar(salir, cliente);
                        break;
                    case "3":
                        ClienteAfiliadoDB todo = new ClienteAfiliadoDB();
                        ArrayList<ClienteAfiliado> cliente4 = todo.listado();
                        Iterator<ClienteAfiliado> it = cliente4.iterator();
                        while (it.hasNext()) {
                            ClienteAfiliado cliente6 = it.next();
                            System.out.println("Id Cliente: " + cliente6.getIdPersona());
                            System.out.println("Nombre Cliente" + cliente6.getNombrePersona());
                            System.out.println("Telefono Cliente " + cliente6.getTelefonoPersona());
                            System.out.println("Id Tarjeta Afiliación " + cliente6.getIdTarjetaAfiliacion());
                            System.out.println("Saldo Tarjeta " + cliente6.getSaldoTarjeta());
                            System.out.println("-------------------------------------------------------------");
                        }
                        break;
                    case "4":
                        Scanner scborrar = new Scanner(System.in);
                        ClienteAfiliadoDB borrarDb = new ClienteAfiliadoDB();
                        System.out.println("Ingrese el id del cliente que desea borrat");
                        borrarDb.borrar(scborrar.nextLine());
                        break;
                    case "5":
                        salir = "y";
                        break;
                }
                break;
            case "2":
                System.out.println("Seleccione la opcion que desea realizar");
                System.out.println("1-Agregar nueva Cortesia");
                System.out.println("2- Editar Cortesia existente");
                System.out.println("3- ver listado de Cortesias");
                System.out.println("4-Borrar Cortesia");
                System.out.println("5-Salir");
                opcion = sc.nextLine();
                switch (opcion) {
                    case "1":
                        Scanner sccortesia = new Scanner(System.in);
                        System.out.println("Introduzca el id de la cortesia");
                        cortesia.setIdCortesia(sccortesia.nextInt());
                        System.out.println("Introduzca la cantidad de Boletas relacionadas a la cortesia");
                        cortesia.setCantidadBoletas(sccortesia.nextInt());
                        System.out.println("Introduzca el estado de la  cortesia");
                        cortesia.setEstadoCortesia(sccortesia.nextInt());
                        CortesiaDB cortesia1 = new CortesiaDB();
                        cortesia1.insertar(cortesia);
                        break;
                    case "2":
                        Scanner sc1 = new Scanner(System.in);
                        System.out.println("Introduzca el id de la cortesia");
                        cortesia.setIdCortesia(sc1.nextInt());
                        System.out.println("Introduzca la cantidad de Boletas relacionadas a la cortesia");
                        cortesia.setCantidadBoletas(sc1.nextInt());
                        System.out.println("Introduzca el estado de la  cortesia");
                        cortesia.setCantidadBoletas(sc1.nextInt());
                        CortesiaDB cortesia4 = new CortesiaDB();
                        cortesia4.actualizar(cortesia);
                        break;
                    case "3":
                        CortesiaDB todo = new CortesiaDB();
                        ArrayList<Cortesia> cliente4 = todo.listado();
                        Iterator<Cortesia> it = cliente4.iterator();
                        while (it.hasNext()) {
                            Cortesia cortesia8 = it.next();
                            System.out.println("Id Cortesia: " + cortesia8.getIdCortesia());
                            System.out.println("Estado Boletas" + cortesia8.getEstadoCortesia());
                            System.out.println("Cantidad Boletas " + cortesia8.getCantidadBoletas());
                            System.out.println("-------------------------------------------------------------");
                        }
                        break;
                    case "4":
                        Scanner scborrar = new Scanner(System.in);
                        CortesiaDB borrarDb = new CortesiaDB();
                        System.out.println("Ingrese el id del cliente que desea borrat");
                        borrarDb.borrar(scborrar.nextInt());
                        break;
                    case "5":
                        salir = "y";
                        break;
                }
                //Peliculas
                case "3":
                System.out.println("Seleccione la opcion que desea realizar");
                System.out.println("1-Agregar nueva Pelicula");
                System.out.println("2- Editar Pelicula existente");
                System.out.println("3- ver listado de Peliculas");
                System.out.println("4-Borrar Pelicula");
                System.out.println("5-Salir");
                opcion = sc.nextLine();
                switch (opcion) {
                    case "1":
                        Scanner scpelicula = new Scanner(System.in);
                        System.out.println("Introduzca el id de la Pelicula");
                        pelicula.setIdPelicula(scpelicula.nextInt());
                        System.out.println("Introduzca el nombre de la pelicula");
                        pelicula.setNombrePelicula(scpelicula.next());
                        System.out.println("Introduzca el año de publicacion de la pelicula");
                        pelicula.setAñoPublicacion(scpelicula.nextInt());
                        System.out.println("Introduzca el idioma de la pelicula");
                        pelicula.setIdiomaPelicula(scpelicula.next());
                        System.out.println("Introduzca la duracion de la pelicula");
                        pelicula.setDuracionPelicula(scpelicula.nextInt());
                        PeliculaDB pelicula1 = new PeliculaDB();
                        pelicula1.insertar(pelicula);
                        break;
                    case "2":
                        Scanner sc1 = new Scanner(System.in);
                        System.out.println("Introduzca el id de la Pelicula");
                        pelicula.setIdPelicula(sc1.nextInt());
                        System.out.println("Introduzca el nombre de la pelicula");
                        pelicula.setNombrePelicula(sc1.next());
                        System.out.println("Introduzca el año de publicacion de la pelicula");
                        pelicula.setAñoPublicacion(sc1.nextInt());
                        System.out.println("Introduzca el idioma de la pelicula");
                        pelicula.setIdiomaPelicula(sc1.next());
                        System.out.println("Introduzca la duracion de la pelicula");
                        pelicula.setDuracionPelicula(sc1.nextInt());                       
                        PeliculaDB pelicula2 = new PeliculaDB();
                        pelicula2.actualizar(pelicula);
                        break;
                    case "3":
                        PeliculaDB todo = new PeliculaDB();
                        ArrayList<Pelicula> pelicula3 = todo.listado();
                        Iterator<Pelicula> it = pelicula3.iterator();
                        while (it.hasNext()) {
                            Pelicula pelicula5 = it.next();
                            System.out.println("Id Cortesia: " + pelicula5.getIdPelicula());
                            System.out.println("Estado Boletas" + pelicula5.getNombrePelicula());
                            System.out.println("Cantidad Boletas " + pelicula5.getAñoPublicacion());
                            System.out.println("Idioma " + pelicula5.getIdiomaPelicula());
                            System.out.println("Duración Boletas " + pelicula5.getDuracionPelicula());
                            System.out.println("-------------------------------------------------------------");
                        }
                        break;
                    case "4":
                        Scanner scborrar = new Scanner(System.in);
                        PeliculaDB borrarDb = new PeliculaDB();
                        System.out.println("Ingrese el id del cliente que desea borrat");
                        borrarDb.borrar(scborrar.nextInt());
                        break;
                    case "5":
                        salir = "y";
                        break;
                }
          

        }
    }

}
