package org.example;

import clases.Cliente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //crear un objeto de la clase producto

        Producto producto=new Producto();

        //crear un objeto e la clase scanner
        Scanner lea= new Scanner(System.in);

        //preguntarle al user el nombre del prodcuto
        System.out.println("El producto es: "+producto.nombre);
        System.out.println("Digite el nombre del producto: ");
        producto.nombre=lea.next();
        System.out.println("El producto es: "+producto.nombre);


        //quiero crear un objeto de la clase cliente

        Cliente cliente=new Cliente();

        //pedir datos

        System.out.println("digite el nombre del cliente: ");
        cliente.nombreCliente=lea.next();
        System.out.println("digite la cedula del cliente: ");
        cliente.cedula=lea.next();
        System.out.println("digite la edad del cliente: ");
        cliente.edad=lea.nextByte();
        System.out.println("digite el telefono del cliente");
        cliente.telefono=lea.next();
        System.out.println("aplica descuento");
        cliente.aplicaDescuento=lea.nextBoolean();





    }
}