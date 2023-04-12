public class Ejercicios {

    /*La suma de dos numeros enteros positivos ademas de un resultado, genera un acarreo.
El resultado de la suma se obtiene sumando ambos numeros d ́ıgito a d ́ıgito. Por lo que al sumar dos digitos
siempre se genera un acarreo.
La tarea consiste en calcular la suma de los acarreos que se generan al sumar dos n ́umeros enteros positivos:
num1 y num2.
Por ejemplo, si num1 es 23564 y num2 es 54698, la suma de los acarreos es 3.
Se pide dise ̃nar una soluci ́on recursiva que permita, dados dos numeros enteros positivos, encontrar la suma
de los acarreos que se generan.*/
    public int sumarAcarreos(int a, int b) {
        return sumar(a, b, 0);
    }

    private int sumar(int a, int b, int aca) {
        int cant = 0;
        if (a != 0 && b != 0) {
            if ((a%10 + b%10 + aca) >9) {
                  cant=1+sumar(a/10,b/10,1);
            }else {
                cant=sumar(a/10,b/10,0);
            }
        }
        return cant;
    }

    /*1. PLANO Dado un numero se pide decidir si es un numero plano o no. Se dice que un numero es
    plano si todos sus dıgitos son iguales.
    Por ejemplo: 333333 es plano pero 43422222 no lo es.*/
    public String esPlano(int n){

        if(plano(n, n%10)){
            return "ES UN NUMERO PLANO";
        }else{
            return "NO ES UN NUMERO PLANO";
        }
    }
    private boolean plano(int n, int a){
        boolean c=true;
        if(n>0){
            if(n%10 == a){
                c=plano(n/10,a);
            }else{
                c=false;
            }
        }
        return c;
    }
}



