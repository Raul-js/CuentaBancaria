public class Main {
    public static void main(String[] args) {

        CuentaCorriente cc1=new CuentaCorriente("C1",0.0);
        CuentaCorriente cc2=new CuentaCorriente("C2",2000.0);
        CuentaAhorro cc3=new CuentaAhorro ("C3",2000.0);

        cc2.traspaso(cc3,1999.0);
        cc3.traspaso(cc1,1999.0);
        cc1.traspaso(cc2,1999.0);
        cc1.ingresar(1000.0);
        cc1.retirar(500.0);
        cc1.calcularIntereses();
        cc2.calcularIntereses();
        cc3.calcularIntereses();
        cc1.mostrar();
        cc2.mostrar();
        cc3.mostrar();
    }
}