package mx.unam.fi.poo.g1.proyecto2;

import mx.unam.fi.poo.g1.proyecto2.*;

/**
 * Clase RevisionCuenta extends CuentaBanco 
 * @author Axel Cote 
 * @version Oct-2024
**/

public class RevisionCuenta extends CuentaBanco{
  private double cuotaConsulta = 30.0;

  public RevisionCuenta(double saldo) {
    super(saldo);
  }

  public double getCuotaConsulta() {
    return cuotaConsulta;
  }

  public void setCuotaConsulta(double cuotaConsulta) {
    this.cuotaConsulta = cuotaConsulta;
  }

  @Override
  public void retirar(double monto) {
    if(monto < 100) {
      System.out.println("Debe retirrar un minimo de 100$");
    } else {
      setSaldo(getSaldo() - monto - cuotaConsulta);
    }
  }
}