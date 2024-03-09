public class CuentaCorriente extends CuentaBancaria {
    public static final double interesAnualBasico = 2.5;

    public CuentaCorriente(String numeroCuenta, double saldo) {
        super(numeroCuenta, saldo);
    }

    public void calcularIntereses() {
        double interes;
        if (saldo < saldoMinimo) {
            interes = saldo * (interesAnualBasico / 200);
        } else {
            interes = saldo * (interesAnualBasico / 100); // El doble del interes basico
        }
        super.ingresar(interes);
    }
}