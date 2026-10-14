package com.example.miprimeraprueba

import org.junit.Test

// Taller Práctico - Fundamentos de Kotlin con "KotlinPet"

class KotlinPetTest {

    @Test
    fun ejecutarTaller() {


        println("KOTLINPET - GESTIÓN VETERINARIA")

        // Variables, Tipos de Datos e Interpolación de Cadenas

        println("Ficha del Paciente ")
        val nombreMascota: String = "Toby"
        val sexoMascota: Char = 'M'
        var edadMascota: Int = 3
        var pesoMascota: Float = 14.5f
        val estaVacunado: Boolean = true

        // Simulación: Cumpleaños (+1 año) y aumento de peso
        edadMascota += 1
        pesoMascota += 1.2f

        // Impresión en una sola línea utilizando plantillas de interpolación ($)

        println("Paciente: $nombreMascota | Edad: $edadMascota años | Peso: $pesoMascota kg | Sexo: $sexoMascota | Vacunado: $estaVacunado\n")


        // Control de Flujo , when e if con Operadores Lógicos

        println("Clasificación y Prioridad de Atención ")
        val edadPaciente: Int = edadMascota
        val esUrgencia: Boolean = false // Cambiar a true para probar urgencia

        // Clasificacion

        val categoria: String = when (edadPaciente) {
            in 0..1 -> "Cachorro"
            in 2..7 -> "Adulto"
            in 8..30 -> "Senior"
            else -> "Edad no válida"
        }

        // Evaluación de prioridad con 'if' y operadores lógicos (||)

        if (esUrgencia || categoria == "Senior") {
            println("Mascota categoría '$categoria': Prioridad Alta")
        } else {
            println("Mascota categoría '$categoria': Atención Regular")
        }
        println()


        // ------------------------------------------------------------------------
        // PUNTO 3: Colecciones, Bucles y Rangos
        // ------------------------------------------------------------------------
        println("--- PUNTO 3: Turnos y Cuenta Regresiva ---")
        val listaMascotas: List<String> = listOf("Toby", "Luna", "Rocky", "Bella")

        println("Lista de espera para consulta:")
        for (i in listaMascotas.indices) {
            println("Turno ${i + 1}: ${listaMascotas[i]}")
        }

        println("\nCuenta regresiva para la apertura de la clínica:")
        for (minuto in 5 downTo 1) {
            println("Faltan $minuto minutos para abrir la clínica...")
        }
        println()


        // Null Safety y Operador Elvis

        println("--- PUNTO 4: Registro de Contacto de Emergencia ---")
        val contactoEmergencia: String? = null

        // Intento de medir la cantidad de caracteres mediante llamada segura

        val longitudContacto: Int? = contactoEmergencia?.length
        println("Longitud del número (Safe call ?.): $longitudContacto")

        // Asignación de valor por defecto mediante operador Elvis

        val contactoFinal: String = contactoEmergencia ?: "Sin contacto registrado"
        println("Contacto de emergencia asignado: $contactoFinal\n")


        // Lambdas y Funciones de Orden Superior

        println(" Cálculo de Tarifas Nocturnas ")
        val preciosServicios: List<Double> =
            listOf(45000.0, 30000.0, 25000.0) // Consulta, Baño, Desparasitación

        // Lambda que aplica un recargo del 10% (multiplica por 1.10)

        val calcularRecargoNocturno = { precioBase: Double -> precioBase * 1.10 }

        println("Precios de servicios (Original vs. Servicio Nocturno):")
        preciosServicios.forEach {
            val precioAjustado = calcularRecargoNocturno(it)
            println(" - Precio Base: $$it | Con recargo nocturno (10%): $$precioAjustado")
        }
        println("\n==========================================")
    }
}
