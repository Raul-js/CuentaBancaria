public class CuentaBancaria {
    String numeroCuenta;
    double saldo;
    public static final double interesAnualBasico = 2.5f;
    public final double saldoMinimo = 3000f;

    public CuentaBancaria(String numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public void ingresar(double x) {
        anadir(x);
    }

    public void retirar(double x) {
        anadir(-x);
    }

    public void traspaso(CuentaBancaria cc, double cant) {

        this.retirar(cant);
        cc.ingresar(cant);

    }

    public void mostrar() {
        System.out.println("Saldo: " + saldo);

    }

    private void anadir(double cantidad) {
        saldo += cantidad;
    }
}



