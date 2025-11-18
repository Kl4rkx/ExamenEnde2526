package base;

import java.util.Scanner;

public class DavidCastillo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo = 0.0;
        boolean salir = false;
        int opcion;

        System.out.println("=== GESTOR DE CUENTAS BANCARIAS ===");
        System.out.println("Bienvenido/a a tu banco digital.");

        while (!salir) {
            System.out.println("\nSaldo actual: " + saldo + " €");
            System.out.println("1. Ingresar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el monto a ingresar: ");
                    double ingreso = sc.nextDouble();
                    saldo = saldo + ingreso;
                    System.out.println("Has ingresado " + ingreso + " €. Nuevo saldo: " + saldo + " €");
                    break;

                case 2:
                    System.out.print("Introduce el monto a retirar: ");
                    double retiro = sc.nextDouble();
                    if (retiro <= saldo) {
                        saldo = saldo - retiro;
                        System.out.println("Has retirado " + retiro + " €. Nuevo saldo: " + saldo + " €");
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;

                case 3:
                    System.out.println("Tu saldo actual es: " + saldo + " €");
                    break;

                case 4:
                    salir = true;
                    System.out.println("Gracias por usar el Gestor de Cuentas. ¡Hasta pronto!");
                    break;

                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
                    break;
            }
        }

        sc.close();
    }
}
