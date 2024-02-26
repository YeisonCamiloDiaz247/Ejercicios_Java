package co.edu.sena.oop_2902274;

import java.util.Scanner;
import java.text.DecimalFormat;

public class App
{
    public static void main( String[] args )
    {   
        //1
        //Entrada
        System.out.println("1. Calcular el área del triángulo" );
        System.out.println("Ingrese la base del triángulo");

        Scanner src =  new Scanner(System.in);
        double base = src.nextDouble();

        System.out.println("Ingrese la altura del triángulo");
        double height = src.nextDouble();

        //Proceso

        double result1 =(base * height) /2;

        //Salida
        System.out.println("El área del triángulo es:" +result1);

        //2
        //Entrada
        System.out.println("2. Ingresar dos números por teclado y sumarlos" );
        System.out.println("Ingrese el primer número");

        double number1 = src.nextDouble();

        System.out.println("Ingrese el segundo número");

        double number2 = src.nextDouble();

        //Proceso

        double result2 = (number1 + number2);

        //Salida

        System.out.println("La suma de los dos números es:" +result2);

        //3
        //Entrada
        System.out.println("3. Ingresar un número y visualizar el número elevado al cuadrado" );
        System.out.println("Ingrese el número");

        double number3 = src.nextDouble();
        int exponent = 2;

        //Proceso

        double result3 = Math.pow(number3, exponent);

        //Salida

        System.out.println("El número elevado al cuadrado es:" +result3);

        //4
        //Entrada
        System.out.println("4. Escribir un algoritmo que convierta de euros a dolares" );
        System.out.println("Ingrese los euros que desea convertir");
        
        double euro = src.nextDouble();
        double dolar = 1.08;

        //Proceso
        double result4 = (euro * dolar);

        //Salida

        System.out.println("El valor en dolares que tiene es de:" +result4);

        //5
        //Entrada
        System.out.println("5. Escribir un algoritmo que pida el lado de un cuadrado y muestre el valor del área y del perímetro");
        System.out.println("Ingrese el número del lado de cuadrado");

        double side = src.nextDouble();

        //Proceso

        double result5 = (side * side);
        double result6 = (side + side + side +side);

        //Salida

        System.out.println("El área del cuadrado es:" +result5);
        System.out.println("El perímetro del cuadrado es:" +result6);

        //6
        //Entrada
        System.out.println("6. Escribir un algoritmo que determine el área y el volúmen del cilindro");
        System.out.println("Ingrese el radio del cilindro");

        double radio = src.nextDouble();

        System.out.println("Ingrese la altura del cilindro");
        double height2 = src.nextDouble();

        //Proceso

        double result7 = 2 *Math.PI * radio * (radio + height2);
        double result8 = Math.PI * Math.pow (radio, 2) * height2;
        //Salida

        System.out.println("El área del cilindro es:" +result7);
        System.out.println("El volúmen del cilindro es:" +result8);

        //7
        //Entrada 
        System.out.println("7. Realizar un algoritmo que lea el radio de una circunferencia y escriba la longitud de la misma y el área (pi*r)^2 del círculo inscrito");
        System.out.println("Ingrese el radio de la circunferencia");

        double radio2 = src.nextDouble();

        //Proceso

        double result9 = 2 * Math.PI * radio2;
        double result10 = Math.PI * Math.pow(radio2, 2);

        //Salida

        System.out.println("La longitud de la circunferencia es:" +result9);
        System.out.println("El área de la circunferencia es:" +result10);

        //8
        //Entrada
        System.out.println("8. Calcular el promedio de tres (3) números ingresados por el teclado");

        System.out.println("Ingrese el primer núemero");
        double num1 = src.nextDouble();

        System.out.println("Ingrese el segundo núemero");
        double num2 = src.nextDouble();

        System.out.println("Ingrese el tercer núemero");
        double num3 = src.nextDouble();

        //Proceso

        double result11 = (num1 + num2 + num3) /3;

        //Salida

        System.out.println("El promedio de los tres números es:" +result11);

    }
}
