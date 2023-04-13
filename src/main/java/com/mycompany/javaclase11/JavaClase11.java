
package com.mycompany.javaclase11;

import java.util.*;

public class JavaClase11 {

    private static final String FILE_NAME = "chatlog.txt";
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Ingrese su nombre: ");
        String name = scanner.nextLine();

        ChatLog chatLog = new ChatLog(FILE_NAME);

        while (true) {
            System.out.print("Elija una opción: \n1. Escribir un mensaje\n2. Leer todos los mensajes\n");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // consume la linea \n dejada en la orden anterior, ya que .nextInt envía el numero pero deja el salto de linea

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese su mensaje: ");
                    String message = scanner.nextLine();
                    chatLog.writeMessage(name, message);
                    break;
                case 2:
                    List<String> messages = chatLog.readMessages();
                    for (String m : messages) {
                        System.out.println(m);
                    }
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }
}

