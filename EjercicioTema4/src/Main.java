public class Main {
    public static void main(String[] args) {

        /*Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
        Pista: Los números inferiores a 0 son negativos y los superiores, positivos.*/
        System.out.println("Ejercicio con Estructura IF");
        int numeroIf = 5;
            if (numeroIf > 0){
                System.out.println("El valor del if es Mayor a 0 \n");
            }
            else if (numeroIf < 0){
                System.out.println("El valor del if es Menor a 0 \n");
            }
            else {
                System.out.println("El valor del if es Igual a 0 \n");
            }

        /*Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3,
        el bloque de código que tendrá el bucle deberá:
        Incrementar el valor de la variable en uno cada vez que se ejecute.
        Mostrarlo por pantalla cada vez que se ejecute.*/

        System.out.println("Ejercicio con bucle While");
        int numeroWhile = -1;
        while (numeroWhile < 3){
            numeroWhile++;
            System.out.println("numeroWhile= " + numeroWhile);
        }

        /*Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.*/

        System.out.println("\nEjercicio con bucle Do While");
        int numeroDoWhile = 3;
        do {
            numeroDoWhile++;
            System.out.println("numeroDoWhile= " + numeroWhile);
        }
        while (numeroDoWhile < 3);

        /*Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la
        variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse
        por pantalla.*/

        System.out.println("\nEjercicio con bucle for");
         int numeroFor = 0;
         for (;numeroFor<=3;numeroFor++){
             System.out.println(numeroFor);
         }
        /*Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año.
        Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la
        que está. También habrá que poner un default para cuando el valor de la variable no sea una estación.*/

        System.out.println("\nEjercicio con Switch");
        String estacion= "verano";
        switch (estacion) {
            case "primavera":
                System.out.println("estacion primavera");
                break;
            case "invierno":
                System.out.println("estacion invierno");
                break;
            case "otoño":
                System.out.println("estacion otoño");
                break;
            case "verano":
                System.out.println("estacion verano");
                break;
            default:
                System.out.println("no es una estacion");
        }

        }
}