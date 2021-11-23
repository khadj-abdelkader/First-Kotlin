package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

fun isOldEnough(age: Int): Boolean {
    return age >= 5
}

fun describePeople(name: String, age: Int, height: Float) {
    val canPlayString = when(isOldEnough(age)){
        true -> "peut jouer au basket"
        false -> "ne peut pas jouer au basket"
    }
    println("${name} a ${age} ans, mesure ${height}m et ${canPlayString}")
}

fun describePeopleDetail(name: String, age: Int, height: Float, detail: String = "Aucun détail") {
    val canPlayString = when(isOldEnough(age)){
        true -> "peut jouer au basket"
        false -> "ne peut pas jouer au basket"
    }
    println("${name} a ${age} ans, mesure ${height}m et ${canPlayString} (${detail})")
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var age: Int = 10
        var name: String = "Bob"
        var height: Float = 1.6F
        describePeople(name, age, height)
        name = "Bobette"
        age = 4
        height = 1.8F
        describePeopleDetail(name, age, height)

//        println("${name} a ${age} ans")
//
//        age = 10
//        println("${name} a ${age} ans")
//
//        age *= 2
//
//        println("String template simple : $name a $age ans")
//        println("String template complexe : ${name.uppercase()} a ${age + 5} ans")
//
//        println("Concaténation :"
//                + "\nNom : " + name
//                + "\nAge : " + age)
//
//        println("""Raw string :
//Nom : $name
//Age : $age
//""")
//        println("""Raw string trim :
//        |Nom : $name
//        |Age : $age
//        """.trimMargin())
//
//        println("""Raw string trim2 :
//        >Nom : $name
//        >Age : $age
//        """.trimMargin(">"))

//        var age: Int = 10
//        age = 5
//        println(age)
//        val age: Int = 10
//        println(age)

//        var name: String? = "Bob"
//        name = null
//        println(name?.length)

//        var name: String? = "Bob"
//        name = null
//        println(name!!.length)

        if (age >= 5 && height >= 1.50F) {
            println("${name} peut jouer au basket")
        } else {
            println("${name} n'a ni l'âge, ni la taille requise pour jouer")
        }

//        if (name == "Bob"){
//            println("${name} est un garçon")
//        } else if (name == "Bobette") {
//            println("${name} est une fille")
//        } else {
//            println("On ne connaît pas le sexe de ${name}")
//        }

        val type = if (age < 18) "enfant" else "adulte"
        println("${name} est un ${type}")

        when (name) {
            "Bob" -> println("${name} est un garçon")
            "Bobette" -> println("${name} est une fille")
            else -> println ("On ne connaît pas le sexe de ${name}")
        }

        when (age) {
            in 1..5 -> println("${name} est trop jeune")
            in 6..10 -> println("${name} peut jouer au basket")
            !in 1..18 -> println("${name} ne peut pas jouer avec les enfants")
            else -> println("Condition non gérée")
        }

        val canPlayBasketBall = when (age) {
            in 5..10 -> true
            in 10..50 -> true
            else -> false
        }



    }



}