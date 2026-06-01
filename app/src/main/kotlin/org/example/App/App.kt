package org.example.app

import org.example.app.Fecha

class App(private var dia2: Int = 0, private var mes2: Int = 0, private var anio2: Int = 0) {
        fun get(): String {
            return "Hello World!"
        }
        fun return_dia(): String{
            return "${Fecha(dia2, mes2, anio2)}"
        }
}