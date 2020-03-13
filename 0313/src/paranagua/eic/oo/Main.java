package paranagua.eic.oo;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //declaracao do objeto
        ContaBancaria conta1=null;

        System.out.println(conta1);

        //instanciando o objeto
        conta1 = new ContaBancaria(1987193,456,10.0,"Chico");

        ContaBancaria conta2 = new ContaBancaria(2342534,778,"Zé");
        System.out.println(conta2);

        System.out.println(conta1.toString());

        //inicializar o estado do objeto
        conta1.setNumero(1987193);

        //conta1.numero = 1987193;
        //conta1.agencia = 456;
        //conta1.cliente = "Chico";
        //conta1.saldo = 10.0;

        System.out.println(conta1.toString());

        conta1.depositar(10.5);

        System.out.println(conta1.toString());

        //...
        //conta1.saldo = 10000.00;
        //conta1.cliente = "Hugo Alberto Perlin";
        System.out.println(conta1.toString());





    }
}
