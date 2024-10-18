package mx.unam.fi.poo.g1.proyecto2;

import java.util.Scanner;
import mx.unam.fi.poo.g1.proyecto2.*;

/**
 * Clase principal Proyecto 2
 * @author Axel Cote 
 * @version Oct-2024
**/

public class Proyecto2 {
  public static void main(String[] args) {
    System.out.println("Cuenta Banco con saldo de 1000: ");
    retirar("CuentaBanco");

    System.out.println("Cuenta Ahorro con saldo de 1000: ");
    retirar("CuentaAhorro");
    
    System.out.println("Revision Cuenta con saldo de 1000: ");
    retirar("RevisionCuenta");
  }

  
  static void retirar(String tipoCuenta) {
    double saldo = 1000.0;
    Scanner entrada = new Scanner(System.in);
    CuentaBanco cuenta;

    if (tipoCuenta.equals("CuentaBanco")) {
        cuenta = new CuentaBanco(saldo);
    } else if (tipoCuenta.equals("CuentaAhorro")) {
        cuenta = new CuentaAhorro(saldo);
    } else if (tipoCuenta.equals("RevisionCuenta")) {
        cuenta = new RevisionCuenta(saldo);
    } else {
        System.out.println("Tipo de cuenta no valido");
        return;
    }

    System.out.print("Digite el monto que desea retirar: ");
    double monto = entrada.nextDouble();
    cuenta.retirar(monto);
    System.out.println("Saldo restante: " + cuenta.getSaldo());
  }
}