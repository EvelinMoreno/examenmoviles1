package org.example;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import org.example.Clases.Jugador;

public class Main {
    public static void main(String[] args) {
        ;
        Scanner entradaPorTeclado = new Scanner(System.in);
        ArrayList<Jugador> jugadores=new ArrayList<Jugador>();

        int opcion = 0;
        int contadorJ = 0;

        do {
            System.out.println("CONVOCATORIA JUGADORES");
            System.out.println("1. Agregar un jugador");
            System.out.println("2. Buscar un jugador");
            System.out.println("3. Editar informacion de un jugador");
            System.out.println("4. Mostrar convocatoria");
            System.out.println("5. Salir");
            System.out.println("Digita una opcion del menu: ");
            opcion = entradaPorTeclado.nextInt();


            switch (opcion) {

                case 1:
                    Jugador objetojugador = new Jugador();
                    if (contadorJ == 23){
                        System.out.println("La convocatoria esta llena");
                    }else {

                    System.out.print("ingrese el numero de la camisa del jugador: ");
                    objetojugador.setNumeroCamisa(entradaPorTeclado.nextInt());
                    System.out.print("Ingrese el nombre del jugador: ");
                    objetojugador.setNombre(entradaPorTeclado.next());
                    System.out.print("Ingrese el apellido del jugador: ");
                    objetojugador.setApellidos(entradaPorTeclado.next());
                    System.out.print("Ingrese la edad del jugador: ");
                    objetojugador.setEdad(entradaPorTeclado.nextInt());
                    System.out.print("Ingrese la posicion del jugador: ");
                    objetojugador.setPosicion(entradaPorTeclado.next());
                    System.out.print("Ingrese el equipo del jugador: ");
                    objetojugador.setEquipo(entradaPorTeclado.next());

                    jugadores.add(objetojugador);
                    contadorJ++;
                    }
                    break;
                case 2:
                    boolean buscarJ = false;
                    int buscarC;

                    System.out.print("Ingrese el numero de la camisa del jugador: ");
                    buscarC = entradaPorTeclado.nextInt();

                    for (int i = 0; i < jugadores.size(); i++) {
                        Jugador jugador = jugadores.get(i);

                        if (Objects.equals(jugador.getNumeroCamisa(), buscarC)) {
                            System.out.println("El nombre del jugador es: "+jugador.getNombre());
                            System.out.println("El apellido del jugador es: "+jugador.getApellidos());
                            System.out.println("La edad del jugador es: " +jugador.getEdad());
                            System.out.println("La posicion del jugador es: "+jugador.getPosicion());
                            System.out.println("El jugador hace parte del equipo: "+jugador.getEquipo());
                            System.out.println();
                            buscarJ = false;
                        } else {
                            buscarJ = true;
                        }
                    }

                    if (buscarJ){
                        System.out.println("EL JUGADOR NO EXISTE");
                    }else {
                        System.out.println("EL JUGADOR SE GUARDO CON EXITO");
                    }
                    break;
                case 3:
                    int editarJ;
                    System.out.print("Ingrese el numero de camiseta del jugador que quiere editar: ");
                    editarJ = entradaPorTeclado.nextInt();
                    boolean opcionEditar = false;

                    for (int i = 0; i < jugadores.size(); i++){
                        Jugador jugador=jugadores.get(i);

                        if (Objects.equals(jugador.getNumeroCamisa(), editarJ)) {
                            System.out.println("El jugador es: "+jugador.getNombre());
                            System.out.println("Digita el nuevo nombre del jugador: ");
                            jugador.setNombre(entradaPorTeclado.next());
                            jugadores.get(i).setNombre(jugador.getNombre());
                            opcionEditar = false;
                        } else {
                            opcionEditar = true;
                        }
                    }
                    if (opcionEditar){
                        System.out.println("EL JUGADOR NO EXISTE");
                    }else {
                        System.out.println("EL JUGADOR SE ENCONTRO CON EXITO");
                    }
                    break;

                case 4:
                    for(Jugador jugador:jugadores){
                        System.out.println(jugador.getNombre());
                        System.out.println(jugador.getApellidos());
                        System.out.println(jugador.getNumeroCamisa());
                        System.out.println(jugador.getEdad());
                        System.out.println(jugador.getPosicion());
                        System.out.println(jugador.getEquipo());
                    }
                    break;
                case 5:
                    System.out.println("Seleccionaste la opcion salir");
                    break;
                default:
                    System.out.println("OPCION INVALIDA");
            }
        }
        while (opcion !=5);
    }
}