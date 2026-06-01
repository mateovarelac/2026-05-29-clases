package org.example.app

class Fecha(private var dia: Int=0, private var mes: Int=0, private var anio: Int=0) {
        override fun toString(): String {
            return "(La fecha es ${dia} / ${mes} / ${anio} )"
        }
}