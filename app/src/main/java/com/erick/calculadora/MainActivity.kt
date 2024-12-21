package com.erick.calculadora
import kotlin.math.PI

fun main() {
    println("Seleccione una opción para calcular el área:")
    println("1. Cuadrado")
    println("2. Círculo")
    println("3. Triángulo")
    print("Opción: ")

    when (readLine()?.toInt()) {
        1 -> calcularAreaCuadrado()
        2 -> calcularAreaCirculo()
        3 -> calcularAreaTriangulo()
        else -> println("Opción inválida")
    }
}

fun calcularAreaCuadrado() {
    print("Ingrese el lado del cuadrado: ")
    val lado = readLine()!!.toDouble()
    val area = lado * lado
    println("El área del cuadrado es: $area")
}

fun calcularAreaCirculo() {
    print("Ingrese el radio del círculo: ")
    val radio = readLine()!!.toDouble()
    val area = PI * radio * radio
    println("El área del círculo es: $area")
}

fun calcularAreaTriangulo() {
    print("Ingrese la base del triángulo: ")
    val base = readLine()!!.toDouble()
    print("Ingrese la altura del triángulo: ")
    val altura = readLine()!!.toDouble()
    val area = 0.5 * base * altura
    println("El área del triángulo es: $area")
}