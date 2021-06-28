import java.util.Scanner;
public class CalculadoraTrigonometrica {
    public static void main(String[] args) {
        System.out.println("Calcular seno = Escriba sin");
        System.out.println("Calcular coseno = Escriba cos");
        System.out.println("Calcular tangente = Escriba tan");
        System.out.println("Calcular arcoseno = Escriba arcsin");
        System.out.println("Calcular arcocoseno = Escriba arccos");
        System.out.println("Calcular arcotangente = Escriba arctan");
        System.out.println("Calcular seno hiperbólico = Escriba sinh");
        System.out.println("Calcular coseno hiperbólico = Escriba cosh");
        System.out.println("Calcular tangente hiperbólico = Escriba tanh");
        System.out.println("El separador decimal es la coma");

        System.out.println("Escriba debajo de este texto la operación que desea realizar de acuerdo a los parámetros dados");
        Scanner operacion = new Scanner(System.in);
        String calcular = operacion.nextLine();
        System.out.println("Usted ha elegido realizar la operación trigonométrica:   " + calcular);

        System.out.println("Escriba debajo de este texto el ángulo que desea calcular");

        Scanner numero = new Scanner(System.in);

        double anguloEnGrados = numero.nextDouble();
        double resultado = 0;
        System.out.println("El ángulo que usted escribió corresponde a:   " + anguloEnGrados + "º");
            if (calcular.equals("sin")) {
                resultado = Math.sin(anguloEnGrados);
                System.out.println("sin("+ anguloEnGrados + ") = "+ resultado +"rad");

            }else if (calcular.equals("cos")) {
                resultado = Math.cos(anguloEnGrados);
                System.out.println("cos(" + anguloEnGrados + ") = " + resultado + "rad");

            }else if (calcular.equals("tan") ){
                resultado = Math.tan(anguloEnGrados);
                System.out.println("tan(" + anguloEnGrados + ") = " + resultado + "rad");

    }
}