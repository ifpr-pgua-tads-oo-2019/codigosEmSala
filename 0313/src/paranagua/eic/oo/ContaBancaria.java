package paranagua.eic.oo;

import com.sun.nio.sctp.AbstractNotificationHandler;

public class ContaBancaria {

    //atributos
    private int numero;
    private int agencia;
    private double saldo;
    private String cliente;

    //metodos
    public ContaBancaria(int numero, int agencia, double saldo, String cliente){
        this.numero = numero;
        this.agencia = agencia;
        this.cliente = cliente;
        this.saldo = saldo;

    }


    public ContaBancaria(int numero, int agencia, String cliente){
        this(numero,agencia,0.0,cliente);
        //this.numero = numero;
        //this.agencia= agencia;
        //this.cliente = cliente;
        //this.saldo =0.0;
    }



    public void setNumero(int numero){
            this.numero = numero;
    }

    public int getNumero(){
        return this.numero;
    }



    public void sacar(){
        this.saldo = this.saldo-10;
    }

    public void sacar(double qtde){
        saldo = saldo - qtde;
    }

    public void depositar(double qtde){
        saldo = saldo + qtde;
    }

    public String toString(){
        String s = "Número:"+numero+" Agência:"+agencia+" Saldo: R$"+saldo+" Cliente:"+cliente;
        return s;
    }
}
