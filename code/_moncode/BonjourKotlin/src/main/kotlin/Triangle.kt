package org.dupont

class Triangle {
}

fun main(args: Array<String>) {
    if (args.isNotEmpty()) {
        val hauteur : Int = args[0].toInt()
        for (i : Int in 1..hauteur) {
            for (j : Int in 1..i) {
                print("*")
            }
            println()
        }
    } else {
        println("Veuillez spécifier la hauteur du triangle en argument de ligne de commande.")
    }
}
