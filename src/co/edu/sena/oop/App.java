package co.edu.sena.oop;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;
        double num3 = 0;
        int Opcion;

        Data data = new Data();

        System.out.println("  ");
        System.out.println("      Miscelanea ");
        System.out.println("  Ejercicios OOP Java");
        System.out.println("  ");
        System.out.println(" **** Menu Principal ****");
        System.out.println("   ");
        System.out.println("1. Operadores");
        System.out.println("2. Condicionales");
        System.out.println("3. Ciclos");
        System.out.println("99. Salir ");
        System.out.println("   ");
        System.out.print("  Digite su Opcion : ");
        Opcion = input.nextInt();
        switch (Opcion) {
            case 1:{
                //Submenu Operadores.
                System.out.println("   ");
                System.out.println(" *** Categoria Operadores ***");
                System.out.println("1. Area triangulo escaleno");
                System.out.println("2. Suma de dos Numeros");
                System.out.println("3. Numero al cuadrado");
                System.out.println("4. Conversion Euros a Dolares");
                System.out.println("5. Area y perimetro de un cuadrado");
                System.out.println("6. Area y volumen de un cilindro");
                System.out.println("7. Longitud y area de circulo inscrito");
                System.out.println("8. Promedio de tres numeros");
                System.out.println("  ");
                System.out.print("  Digite su Opcion : ");
                Opcion = input.nextInt();
                switch (Opcion) {
                    case 1:{
                        System.out.println("  ");
                        System.out.print("  Digite la base del triangulo en cm : ");
                        num1 = input.nextDouble();
                        System.out.print("  Digite la altura del triangulo en cm : ");
                        num2 = input.nextDouble();
                        System.out.println("  ");
                        System.out.println("  El area del triangulo escaleno es: " + data.areaTriangulo(num1, num2) +"cm2.");
                        System.out.println("  ");
                    };
                    break;
                    case 2:{
                        System.out.println("  ");
                        System.out.print("  Digite el primer numero: ");
                        num1 = input.nextDouble();
                        System.out.print("  Digite el segundo numero: ");
                        num2 = input.nextDouble();
                        System.out.println("  ");
                        System.out.println("  La suma de los dos numeros es: " + data.suma(num1, num2));
                        System.out.println("  ");
                    };
                    break;
                    case 3:{
                        System.out.println("  ");
                        System.out.print("  Digite el numero : ");
                        num1 = input.nextDouble();
                        System.out.println("  ");
                        System.out.println("  El numero elevado al cuadrado es: " + data.elevadoCuadrado(num1));
                        System.out.println("  ");
                    };
                    break;
                    case 4:{
                        System.out.println("  ");
                        System.out.print("  Valor en EUR : ");
                        num1 = input.nextDouble();
                        System.out.println("  ");
                        System.out.println("  Al cambio son : " + data.eurosADolares(num1)+" USD.");
                        System.out.println("  ");
                    };
                    break;
                    case 5:{
                        System.out.println("  ");
                        System.out.print("  Digite el lado del cuadrado en cm : ");
                        num1 = input.nextDouble();
                        System.out.println("  ");
                        System.out.println("  El area del cuadrado es : " + data.areaCuadrado(num1) + " cm2.");
                        System.out.println("  ");
                        System.out.println("  El perimetro del cuadrado es: " + data.perimetroCuadrado(num1) + " cm.");
                        System.out.println("  ");
                    };
                    break;
                    case 6:{
                        System.out.println("  ");
                        System.out.print("  Digite el radio del cilindro en cm : ");
                        num1 = input.nextDouble();
                        System.out.print("  Digite la altura del cilindro en cm : ");
                        num2 = input.nextDouble();
                        System.out.println("  ");
                        System.out.println("  El area del cilindro es: " + data.areaCilindro(num1, num2) + " cm2.");
                        System.out.println("  ");
                        System.out.println("  El volumen del cilindro es: " + data.volumenCilindro(num1, num2) + " cm3.");
                        System.out.println("  ");
                    };
                    break;
                    case 7:{
                        System.out.println("  ");
                        System.out.print("  Digite el lado en cm : ");
                        num1 = input.nextDouble();
                        System.out.println("  ");
                        System.out.println("  La longitud del circulo inscrito es: " + data.areaCirculo(num1) + " cm2.");
                        System.out.println("  ");
                        System.out.println("  El area del circulo inscrito es: " + data.radioCirculo(num1) + " cm.");
                        System.out.println("  ");
                    };
                    break;
                    case 8:{
                        System.out.println("  ");
                        System.out.print("  Digite el primer numero: ");
                        num1 = input.nextDouble();
                        System.out.print("  Digite el segundo numero: ");
                        num2 = input.nextDouble();
                        System.out.print("  Digite el tercer numero: ");
                        num3 = input.nextDouble();
                        System.out.println("  ");
                        System.out.println("  El promedio de los tres numeros es: " + data.promedio(num1, num2, num3));
                        System.out.println("  ");
                    };
                    break;
                    default:{
                        System.out.println("  Opcion no valida");
                    };
                    break;
                };
            };
            break;
            case 2:{
                //Submenu de condicionales.
                System.out.println(" ");
                System.out.println(" *** Categoria de Condicionales ***");
                System.out.println("1. Saber si un número es positivo o negativo");
                System.out.println("2. Número mayor y número menor");
                System.out.println("3. De tres números digitados saber el mayor y menor");
                System.out.println("4. Suma o resta de dos numeros ");
                System.out.println("5. El cociente de dos numeros");
                System.out.println("6. Suma o Producto de dos numeros");
                System.out.println("7. Determinar si un año es bisiesto o no");
                System.out.println("  ");
                System.out.print("  Digite su Opcion : ");
                Opcion = input.nextInt();
                switch (Opcion) {
                    case 1:{
                        System.out.println("  ");
                        System.out.print("  Digite el numero : ");
                        num1 = input.nextDouble();
                        System.out.println("  ");
                        System.out.println("  El numero es : " + data.positivoNegativo(num1));
                        System.out.println("  ");
                    };
                    break;
                    case 2:{
                        System.out.println("  ");
                        System.out.print("  Digite el primer numero : ");
                        num1 = input.nextDouble();
                        System.out.print("  Digite el segundo numero : ");
                        num2 = input.nextDouble();
                        System.out.println("  ");
                        System.out.println("  El resultado es : " + data.mayorOMenor(num1, num2));
                        System.out.println("  ");
                    };
                    break;
                    case 3:{
                        System.out.println("  ");
                        System.out.print("  Digite el primer numero : ");
                        num1 = input.nextDouble();
                        System.out.print("  Digite el segundo numero : ");
                        num2 = input.nextDouble();
                        System.out.print("  Digite el tercer numero : ");
                        num3 = input.nextDouble();
                        System.out.println("  ");
                        System.out.println("  El número " + data.mayorMenor(num1, num2, num3));
                        System.out.println("  ");
                    };
                    break;
                    case 4:{
                        System.out.println("  ");
                        System.out.print("  Digite el primer numero : ");
                        num1 = input.nextDouble();
                        System.out.print("  Digite el segundo numero : ");
                        num2 = input.nextDouble();
                        System.out.println("  ");
                        System.out.println("  El Resultado es " + data.sumarORestar(num1, num2));
                        System.out.println("  ");
                    };
                    break;
                    case 5:{
                        System.out.println("  ");
                        System.out.print("  Digite el primer numero : ");
                        num1 = input.nextDouble();
                        System.out.print("  Digite el segundo numero : ");
                        num2 = input.nextDouble();
                        System.out.println("  ");
                        System.out.println("  El cociente es " + data.cociente(num1, num2));
                        System.out.println("  ");
                    };
                    break;
                    case 6:{
                        System.out.println("  ");
                        System.out.print("  Digite el primer numero : ");
                        num1 = input.nextDouble();
                        System.out.print("  Digite el segundo numero : ");
                        num2 = input.nextDouble();
                        System.out.println("  ");
                        System.out.println("  El resultado es " + data.sumaMenorIgual(num1, num2));
                        System.out.println("  ");
                    };
                    break;
                    case 7:{
                        System.out.println("  ");
                        System.out.print("  Digite el año : ");
                        num1 = input.nextDouble();
                        System.out.println("  ");
                        System.out.print("  El año "+data.esBisiesto(num1));
                        System.out.println("  ");
                    };
                    break;
                };
            };
            break;
            case 3:{
                //Submenu de Ciclos.
                System.out.println(" ");
                System.out.println(" *** Categoria de Ciclos ***");
                System.out.println("1. Multiplos de 3 entre 1 y 100");
                System.out.println("2. Numeros impares entre 0 y 100");
                System.out.println("3. Numeros pares del 1 al 100");
                System.out.println("4. Cuadrados de los numeros del 1 al 30 ");
                System.out.println("5. Suma de cuadrados de los 100 primeros numeros naturales");
                System.out.println("6. Secuencia ascendente entre dos numeros");
                System.out.println("7. Suma de numeros digitados");
                System.out.println("  ");
                System.out.print("  Digite su Opcion : ");
                Opcion = input.nextInt();
                switch (Opcion) {
                    case 1:{
                        System.out.println("  ");
                        System.out.println("  Los multiplos de 3, entre 1 y 100 "+data.imprimirMultiplos3(num1));
                        System.out.println("  ");
                    };
                    break;
                    case 2:{
                        System.out.println("  ");
                        System.out.println("  Numeros impares, entre 0 y 100 "+data.imprimirImpares(num1));
                        System.out.println("  ");
                    };
                    break;
                    case 3:{
                        System.out.println("  ");
                        System.out.println("  Numeros pares, entre 1 y 100 "+data.imprimirPares(num1));
                        System.out.println("  ");
                    };
                    break;
                    case 4:{
                        System.out.println("  ");
                        System.out.println("  Cuadrados de los numeros, entre 1 y 30 "+data.imprimirCuadrados(num1));
                        System.out.println("  ");
                    };
                    break;
                    case 5:{
                        System.out.println("  ");
                        System.out.println("  La suma de cuadrados es : "+data.sumaCuadrados(num1));
                        System.out.println("  ");
                    };
                    break;
                    case 6:{
                        System.out.println("  ");
                        System.out.print("  Digite un numero : ");
                        num1 = input.nextInt();
                        System.out.print("  Digite un numero mayor : ");
                        num2 = input.nextDouble();
                        System.out.println("  La secuencia ascendente hasta : "+data.numerosMenor(num1, num2));
                        System.out.println("  ");
                    };
                    break;
                    case 7:{
                        System.out.println(" ");
                        System.out.println(" La sumatoria es : "+data.sumaNumeros(num1));
                        System.out.println("  ");
                    };
                    break;
                };
            };
            break;
            case 99:{
                System.out.println("SALIR DEL PROGRAMA");
            };
            break;
            default:{
                System.out.println("  Opcion no valida");
            };
            break;
        };
    };
};
