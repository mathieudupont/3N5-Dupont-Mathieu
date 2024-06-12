package org.dupont

class Triangles {
}

fun main() {
    for (hauteur : Int in arrayOf(4, 8, 10, 100)) {
        for (i : Int in 1..5) {
            println(triangle(hauteur))
        }
    }
}

fun triangle(hauteur : Int) : String {
    var tri : String = ""
    for (i : Int in 1..hauteur) {
        for (j : Int in 1..i) {
            tri += "*"
        }
        tri += "\n"
    }
    return tri
}