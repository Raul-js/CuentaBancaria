public class CuentaAhorro extends CuentaBancaria {

    public CuentaAhorro(String numeroCuenta, double saldo) {
        super(numeroCuenta, saldo);
    }

    public void calcularIntereses() {
        double interes;
        if (saldo < saldoMinimo) {
            interes = saldo * (interesAnualBasico / 200); // La mitad del interes basico
        } else {
            interes = saldo * (interesAnualBasico / 100); // El doble del interes basico
        }
        super.ingresar(interes);
    }
}
