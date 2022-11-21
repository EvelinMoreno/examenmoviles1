package org.example;

import java.util.ArrayList;
import java.util.Scanner;
import org.example.Clases.Jugador;

public class Main {
    public static void main(String[] args) {
        ;
        Scanner entradaPorTeclado = new Scanner(System.in);
        Jugador objetojugador = new Jugador();

        ArrayList<Jugador> jugadores=new ArrayList<Jugador>();

        int opcion = 0;

        System.out.println("CONVOCATORIA JUGADORES");
        System.out.println("1. Agregar un jugador");
        System.out.println("2. Buscar un jugador");
        System.out.println("3. Editar información de un jugador");
        System.out.println("4. Mostrar convocatoria");
        System.out.println("5. Salir");

        do {
            System.out.println("Digita una opcion del menu: ");
            opcion = entradaPorTeclado.nextInt();


            switch (opcion) {

                case 1:
                    System.out.print("Ingrese el nombre del jugador: ");
                    objetojugador.setNombre(entradaPorTeclado.next());
                    System.out.print("Ingrese el apellido del jugador: ");
                    objetojugador.setApellidos(entradaPorTeclado.next());
                    System.out.print("Ingrese la edad del jugador: ");
                    objetojugador.setEdad(entradaPorTeclado.nextInt());
                    System.out.print("ingrese el numero de la camisa del jugador: ");
                    objetojugador.setNumeroCamisa(entradaPorTeclado.nextInt());
                    System.out.print("Ingrese la posicion del jugador: ");
                    objetojugador.setPosicion(entradaPorTeclado.next());
                    System.out.print("Ingrese el equipo del jugador: ");
                    objetojugador.setEquipo(entradaPorTeclado.next());
                    break;
                case 2:
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    break;
                default:
                    System.out.println("OPCION INVALIDA");
            }
        }
        while (opcion !=5);
    }
}