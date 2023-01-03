public class CuentaAhorro extends Cuenta{

    public CuentaAhorro(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    void depositar(double valor) {
        this.saldo+=  valor;
    }

    @Override
    public void retirar(double valor) {
        double comision = 0.5;
             super.retirar(valor + comision  ) ;
    }
}
