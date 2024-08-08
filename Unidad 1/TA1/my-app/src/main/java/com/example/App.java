package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}

public class PruebaAtributos {
    // Atributos correctos
    private int edad;
    private String nombre;
    private double salario;

    // Atributos incorrectos (comentados para evitar errores de compilación)
    // private int 1numero; // Error: no puede comenzar con un número
    // private String nombre@; // Error: no puede contener caracteres especiales
    // private double salario$; // Error: no puede contener caracteres especiales

    public static void main(String[] args) {
        PruebaAtributos prueba = new PruebaAtributos();

        // Imprimir valores de los atributos sin inicializar
        System.out.println("Edad: " + prueba.edad); // Debería imprimir 0
        System.out.println("Nombre: " + prueba.nombre); // Debería imprimir null
        System.out.println("Salario: " + prueba.salario); // Debería imprimir 0.0

        // Inicializar atributos
        prueba.edad = 30;
        prueba.nombre = "Juan";
        prueba.salario = 50000.0;

        // Imprimir valores de los atributos inicializados
        System.out.println("Edad inicializada: " + prueba.edad);
        System.out.println("Nombre inicializado: " + prueba.nombre);
        System.out.println("Salario inicializado: " + prueba.salario);
    }
}
