public class TestCuentaExeptionschecked {
    public static void main(String[] args) {
        CuentaP cuenta = new CuentaP();

        try {
            cuenta.depositar();
        } catch (MiExeptions e) {
          e.printStackTrace();
        }
    }
}