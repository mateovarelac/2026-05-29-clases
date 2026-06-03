package org.example.app

import org.example.app.Fecha

class App() {
        fun get(): String {
            return "Hello World!"
        }
        fun mostrar(){
            val fecha = Fecha(1, 6, 2026)
            println(fecha)
        }
}