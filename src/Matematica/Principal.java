package Matematica;

public class Principal {
    public static void main(String args[]){
        //CUENTAS
        Sumador suma_1 = new Sumador(10);
        Multiplicador multi_1 = new Multiplicador(3);

        //SUMAMOS
        int resul1 = suma_1.hacerCuenta(20);
        System.out.println("Suma: " + resul1);

        //MULTIPLICADOR
        int resul2 = multi_1.hacerCuenta(2);
        System.out.println("Multiplicacion: " + resul2);
    }
}
