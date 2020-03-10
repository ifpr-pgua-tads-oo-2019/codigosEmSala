package paranagua.eic.oo;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //declaracao do objeto
        ContaBancaria conta1=null;

        System.out.println(conta1);

        //instanciando o objeto
        conta1 = new ContaBancaria();

        System.out.println(conta1.toString());

        //inicializar o estado do objeto
        conta1.numero = 1987193;
        conta1.agencia = 456;
        conta1.cliente = "Chico";
        conta1.saldo = 10.0;

        System.out.println(conta1.toString());

        conta1.depositar(10.5);

        System.out.println(conta1.toString());



    }
}
