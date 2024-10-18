package mx.unam.fi.poo.g1.proyecto2;

/**
 * Clase padre CuentaBanco 
 * @author Axel Cote 
 * @version Oct-2024
 **/

public class CuentaBanco {
  private double saldo;

  public CuentaBanco(double saldo) {
      setSaldo(saldo);
  }

  public double getSaldo() {
      return saldo;
  }

  public void setSaldo(double saldo) {
      this.saldo = saldo;
  }

  public void retirar(double monto) {
    this.saldo -= monto;
  }

  public void depositar(double monto) {
    this.saldo += monto;
  }
}