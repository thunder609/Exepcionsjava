public class Flujo {
    public static void main(String[] args) {
        System.out.println("Inicio Main");
        try {
            Modulo1();
        } catch (Exception e) {
        // catch (MiExeptions | ArithmeticException e) {
e.printStackTrace();
        }
        System.out.println("Fin del main");
    }

    private static void Modulo1() throws MiExeptions{
        System.out.println("Inicio Modulo1");
        try {
            Modulo2();
        }catch (MiExeptions a){
            a.printStackTrace();
        }

        System.out.println("Fin Modulo1");
    }

    private static void Modulo2()throws MiExeptions{
        System.out.println("Incio Modulo2");
     /*   for (int i = 0; i <= 10; i++) {
            int a = 0;
            try {
                if (i==3 ) {
                    i = i / a;
                    System.out.println(i);
                }
                String caracter = null;
                System.out.println(i);
                System.out.println(caracter.toString());
            } catch (ArithmeticException | NullPointerException exception) {
                System.out.println(exception.getMessage());
                exception.printStackTrace();
            }*/
         int a = 50 /0;
          throw  new MiExeptions("Un error");

        //    System.out.println("fin Modulo2");
        }
    }

