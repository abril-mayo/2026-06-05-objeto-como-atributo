package org.example
import org.example.Persona
import org.example.Fecha
import org.example.Polinomio

fun main() {
    //println(Persona("pepe", "honguito", Fecha(5, 6, 2026)))

    val polinomio : Polinomio=Polinomio()
    println (polinomio)

    val cuadratica : Cuadratica = Cuadratica()
    println (cuadratica)

    val cuadraticamejor : CuadraticaMejor=CuadraticaMejor()
    println (cuadraticamejor)

    var objeto : Polinomio
    objeto = Cuadratica()
    println (objeto)

    objeto = CuadraticaMejor()
    println (objeto)

    var lista = ArrayList <Polinomio>()
    println (lista)

    lista.add(Cuadratica())

    lista.add(Polinomio())

    for (var p : lista){
        println (p)
    }
}