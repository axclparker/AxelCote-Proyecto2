package mx.unam.fi.poo.g1.proyecto2;

import mx.unam.fi.poo.g1.proyecto2.*;

/**
 * Clase CuentaAhorro extends CuentaBanco 
 * @author Axel Cote 
 * @version Oct-2024
**/

public class CuentaAhorro extends CuentaBanco{
  private double limiteRetiro = 5000.0;

  public CuentaAhorro(double saldo) {
      super(saldo);
  }

  public double getLimiteRetiro() {
    return limiteRetiro;
  }

  public void setLimiteRetiro(double limiteRetiro) {
    this.limiteRetiro = limiteRetiro;
  }

  @Override
  public void retirar(double monto) {
    if(monto > limiteRetiro) {
      System.out.println("Se exedio el limite de retiro " + limiteRetiro);
    } else {
      setSaldo(getSaldo() - monto);
    }
  }
}