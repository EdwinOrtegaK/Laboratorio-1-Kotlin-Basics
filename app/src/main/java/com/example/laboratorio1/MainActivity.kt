package com.example.laboratorio1
import android.os.Bundle
import android.util.Log

enum class Team {
    Mercedes,
    RedBullRacing,
    Ferrari,
    McLaren,
    AstonMartin,
    Alpine,
    AlfaTauri,
    AlfaRomeo,
    Haas,
    Williams
}

class MainActivity{
    private fun printTeamDetails(team: Team) {
        when (team) {
            Team.Mercedes -> {
                Log.d("TeamDetails", "Detalles del equipo Mercedes:")
                Log.d("TeamDetails", "Sede: Brackley, Reino Unido")
                // Otros detalles del equipo Mercedes...
            }
            Team.RedBullRacing -> {
                Log.d("TeamDetails", "Detalles del equipo Red Bull Racing:")
                Log.d("TeamDetails", "Sede: Milton Keynes, Reino Unido")
                // Otros detalles del equipo Red Bull Racing...
            }
            Team.Ferrari -> {
                Log.d("TeamDetails", "Detalles del equipo Ferrari:")
                Log.d("TeamDetails", "Sede: Maranello, Italia")
                // Otros detalles del equipo Ferrari...
            }
            Team.McLaren -> {
                Log.d("TeamDetails", "Detalles del equipo McLaren:")
                Log.d("TeamDetails", "Sede: Woking, Reino Unido")
                // Otros detalles del equipo McLaren...
            }
            Team.AstonMartin -> {
                Log.d("TeamDetails", "Detalles del equipo Aston Martin:")
                Log.d("TeamDetails", "Sede: Silverstone, Reino Unido")
                // Otros detalles del equipo Aston Martin...
            }
            Team.Alpine -> {
                Log.d("TeamDetails", "Detalles del equipo Alpine:")
                Log.d("TeamDetails", "Sede: Enstone, Reino Unido")
                // Otros detalles del equipo Alpine...
            }
            Team.AlfaTauri -> {
                Log.d("TeamDetails", "Detalles del equipo AlphaTauri:")
                Log.d("TeamDetails", "Sede: Faenza, Italia")
                // Otros detalles del equipo AlphaTauri...
            }
            Team.AlfaRomeo -> {
                Log.d("TeamDetails", "Detalles del equipo Alfa Romeo:")
                Log.d("TeamDetails", "Sede: Hinwil, Suiza")
                // Otros detalles del equipo Alfa Romeo...
            }
            Team.Haas -> {
                Log.d("TeamDetails", "Detalles del equipo Haas:")
                Log.d("TeamDetails", "Sede: Kannapolis, Estados Unidos")
                // Otros detalles del equipo Haas...
            }
            Team.Williams -> {
                Log.d("TeamDetails", "Detalles del equipo Williams:")
                Log.d("TeamDetails", "Sede: Grove, Reino Unido")
                // Otros detalles del equipo Williams...
            }
            else -> {
                Log.d("TeamDetails", "Equipo desconocido.")
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Llamar a la función printTeamDetails con un equipo de ejemplo
        val equipoEjemplo = Team.Mercedes
        printTeamDetails(equipoEjemplo)
    }
}