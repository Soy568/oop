package co.edu.sena.oop;

import java.util.Scanner;

public class Data {

    //****** METODOS OPERADORES ******.

    //Metodo para calcular area de un triangulo.
    public double areaTriangulo(double num1, double num2){
        return (num1*num2)/2;
    }

    //Metodo para  Ingresar dos números por teclado y sumarlos.
    public double suma(double num1, double num2) {
        return num1+num1;
    }

    //Metodo para  Ingresar un número y visualizar el número elevado al cuadrado.
    public double elevadoCuadrado(double num1) {
        return Math.pow(num1,2);
    }

    //Metodo para  Escribir un algoritmo que convierta de euros a dólares.
    public double eurosADolares(double num1) {
        return num1 * 1.08;
    }

    //Metodo para  pedir el lado de un cuadrado y mostrar el valor del área y del
    //perímetro.
    public double areaCuadrado(double num1) {
        return Math.pow(num1,2);
    }
    public double perimetroCuadrado(double num1) {
        return num1 * 4;
    }

    //Metodo para  determinar el área y el volúmen de un cilindro.
    public double areaCilindro(double num1, double num2) {
        return ((2*Math.PI)*num1)*(num1+num2);
    }
    public double volumenCilindro(double num1, double num2) {
        return Math.PI*Math.pow(num1,2)*num2;
    }

    //Metodo para leer el radio de una circunferencia y escribe la longitud de la misma y
    //el área (pi*r)^2 del círculo inscrito.
    public double areaCirculo(double num1) {

        return Math.PI*(Math.pow((num1/2),2));
    }
    public double radioCirculo(double num1) {
        return num1;
    }

    //Metodo para Calcular el promedio de tres (3) números ingresados por teclado.
    public double promedio(double num1, double num2, double num3) {
        return (num1+num2+num3)/3;
    }


    //****** METODO CONDICIONALES ******.

    //Metodo para saber si el número ingresado por teclado es positivo o negativo.
    public String positivoNegativo(double num1) {
        String mensaje;
        if (num1 > 0) {
            mensaje = "Positivo";
        }else {
            mensaje = "Negativo";
        };
        return mensaje;
    }

    //Metodo para  recibir dos números por teclado y diga cuál es el mayor y cuál el menor.
    public String mayorOMenor(double num1, double num2) {
        String mensaje;
        if (num1 > num2) {
            mensaje = "Menor es "+num2+" y el Mayor es "+num1;
        }else {
            mensaje = "Menor es "+num1+" y el Mayor es "+num2;
        };
        return mensaje;
    }
    //Metodo para leer tres números enteros positivos y que calcule e imprima en pantalla el menor y el mayor de ellos.
    public String mayorMenor(double num1, double num2, double num3) {
        String mensaje;
        if(num1>num2){
            if(num1>num3){
                mensaje = "Mayor es "+num1;
            }else{
                mensaje = "Mayor es "+num3;
            };
        }else{
            if(num2>num3){
                mensaje = "Mayor es "+num2;
            }else{
                mensaje = "Mayor es "+num3;
            };
        };

        if(num1<num2){
            if(num1<num3){
                mensaje = "Menor es "+num1;
            }else{
                mensaje = "Menor es "+num3;
            };
        }else{
            if(num2<num3){
                mensaje = "Menor es "+num2;
            }else{
                mensaje = "Menor es "+num3;
            };
        };
        return mensaje;
    }

    //Metodo para Dados dos números A y B, sumarlos si A es menor que B o sino restarlos.
    public double sumarORestar(double num1, double num2) {
        if(num1<num2){
            return num1+num2;
        }else {
            return num1-num2;
        }
    }

    //Metodo para Dados dos números A y B encontrar el cociente entre A y B. Recordar que la división por cero
    //no está definida, en ese caso debe aparecer una leyenda anunciando que la división no es posible.
    public double cociente(double num1, double num2) {
        if(num2<1){
            System.out.println("La división por cero no está definida");
        };
        return num1 / num2;
    }

    //Metodo para Dados dos números A y B, sumarlos si al menos uno de ellos es negativo, en caso contrario
    //multiplicarlos
    public double sumaMenorIgual(double num1, double num2) {
        if(num1<0 || num2<0){
            return num1+num2;
        }else{
            return num1*num2;
        }
    }

    //Metodo para  determinar si un año es bisiesto o no.
    public String esBisiesto(double num1) {
        String mensaje;
        if((num1 % 4 == 0) && (num1%100 !=0 || num1%400 == 0) ){
            return mensaje =" es bisiesto";
        }else{
            return mensaje =" no es bisiesto";
        }
    }



    //****** METODOS DE CICLOS ******.

    //Metodo para  Imprimir todos los múltiplos de 3 que hay entre 1 y 100.
    public double imprimirMultiplos3(double num1) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            };
        };
        return num1;
    }

    //Metodo para imprimir los números impares entre 0 y 100.
    public double imprimirImpares(double num) {
        for (int i = 0; i <= 100; i++) {
            if (i % 2!= 0) {
                System.out.println(i);
            };
        };
        return num;
    }

    //Metodo para imprimir los números pares del 1 al 100.
    public double imprimirPares(double num) {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        return num;
    }
    //Metodo para imprimir por pantalla los cuadrados de los números del 1 al 30.
    public double imprimirCuadrados(double num) {
        for (int i = 1; i <= 30; i++) {
            System.out.println(Math.pow(i, 2) );
        };
        return num;
    }

    //Metodo para sumar los cuadrados de los cien primeros números naturales, mostrando el resultado en pantalla
    public double sumaCuadrados(double num) {
        int suma = 0;
        for (int i = 1; i <= 10; i++) {
            suma += i * i;
        }
        return suma;
    }

    //Metodo para  Dados dos números naturales, el primero menor que el segundo, generar y mostrar todos los
    //números comprendidos entre ellos en secuencia ascendente.
    public double numerosMenor(double num1, double num2) {
        if(num1<num2){
            for (double i = num1; i <= num2; i++) {
                System.out.println(i);
            }
        }else{
            System.out.println("  Error el segundo numero debe ser mayor  ");
        };
        return num2;
    }

    //Metodo para  Sumar todos los números que se digitan por teclado mientras no sea cero.
    public double sumaNumeros(double num1) {
        Scanner input = new Scanner(System.in);
        double suma = 0;
        do{
            System.out.print("Ingrese un número: ");
            num1 = input.nextDouble();
            suma = suma + num1;
        }while (num1 != 0);
            System.out.print("  La suma de los numeros digitados es : "+suma);
        return suma;
    }
}

