package org.example.demo123;

// nombres : Josue Cajamarca, Maite Aguirre
// Fecha: 11/11/2024
// detalle: prueba
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear cuenta de ahorros
        System.out.print("Ingrese el saldo inicial de la cuenta de ahorros: ");
        float saldoAhorros = scanner.nextFloat();
        System.out.print("Ingrese la tasa anual de la cuenta de ahorros %: ");
        float tasaAhorros = scanner.nextFloat();
        Cuentaahorros cuentaAhorros = new Cuentaahorros(saldoAhorros, tasaAhorros);

        // Crear cuenta corriente
        System.out.print("Ingrese el saldo inicial de la cuenta corriente: ");
        float saldoCorriente = scanner.nextFloat();
        System.out.print("Ingrese la tasa anual de la cuenta corriente %: ");
        float tasaCorriente = scanner.nextFloat();
        Cuentacorriente cuentaCorriente = new Cuentacorriente(saldoCorriente, tasaCorriente);

        int opcion;
        do {
            System.out.println("\n--- Menú de Opciones ---");
            System.out.println("1. Depositar en Cuenta de Ahorros");
            System.out.println("2. Retirar de Cuenta de Ahorros");
            System.out.println("3. Generar extracto mensual de Cuenta de Ahorros");
            System.out.println("4. Consultar estado de Cuenta de Ahorros");
            System.out.println("5. Depositar en Cuenta Corriente");
            System.out.println("6. Retirar de Cuenta Corriente");
            System.out.println("7. Generar extracto mensual de Cuenta Corriente");
            System.out.println("8. Consultar estado de Cuenta Corriente");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la cantidad a depositar en Cuenta de Ahorros: ");
                    float depositoAhorros = scanner.nextFloat();
                    cuentaAhorros.depositar(depositoAhorros);
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad a retirar de Cuenta de Ahorros: ");
                    float retiroAhorros = scanner.nextFloat();
                    cuentaAhorros.retirar(retiroAhorros);
                    break;
                case 3:
                    System.out.println("Extracto mensual generado para Cuenta de Ahorros.");
                    cuentaAhorros.extractoMensual();
                    break;
                case 4:
                    System.out.println("Estado de la Cuenta de Ahorros:");
                    cuentaAhorros.imprimir();
                    break;
                case 5:
                    System.out.print("Ingrese la cantidad a depositar en Cuenta Corriente: ");
                    float depositoCorriente = scanner.nextFloat();
                    cuentaCorriente.depositar(depositoCorriente);
                    break;
                case 6:
                    System.out.print("Ingrese la cantidad a retirar de Cuenta Corriente: ");
                    float retiroCorriente = scanner.nextFloat();
                    cuentaCorriente.retirar(retiroCorriente);
                    break;
                case 7:
                    cuentaCorriente.extractoMensual();
                    System.out.println("Extracto mensual generado para Cuenta Corriente.");
                    break;
                case 8:
                    System.out.println("Estado de la Cuenta Corriente:");
                    cuentaCorriente.imprimir();
                    break;
                case 0:
                    System.out.println("Saliendo del sistema.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 0);

        scanner.close();
    }
}
