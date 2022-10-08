package org.example;

public class FuncionesVarias {


    public static boolean esPar(int n){
        return n%2==0;
    }

    public static int factorial(int n){
        if(n>=0){
            int resultado = 1;
            for (int i=1;i<=n; i++){
                resultado*=i;
            }
            return resultado;
        }
        else
            return -1;
    }

    public static boolean esPrimo(int n){
        if(n==2)
            return true;
        if (n<2 || n%2==0)
            return false;
        for(int i=3;i*i<=n;i+=2) {
            if(n%i==0)
                return false;
        }
        return true;
    }

}
