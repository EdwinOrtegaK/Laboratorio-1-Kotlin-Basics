import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.laboratorio1.R
import com.example.laboratorio1.Team

class MainActivity : AppCompatActivity() {
    val driver1 = Driver("Lewis Hamilton", "Mercedes-AMG", "Reino Unido", 44)
    val driver2 = Driver("Max Verstappen", "Red Bull", "Países Bajos", 33)
    val driver3 = Driver("Charles Leclerc", "Ferrari", "Mónaco", 16)
    val driver4 = Driver("Sergio Pérez", "Red Bull", "México", 11)
    val driver5 = Driver("Lando Norris", "McLaren", "Reino Unido", 4)

    fun printDriverDetails() {
        Log.d("DriverDetails", driver1.toString())
        Log.d("DriverDetails", driver2.toString())
        Log.d("DriverDetails", driver3.toString())
        Log.d("DriverDetails", driver4.toString())
        Log.d("DriverDetails", driver5.toString())
    }

    fun compareDrivers() {
        // Comparación por igualdad (==)
        val isEqual1 = driver1 == driver2
        val isEqual2 = driver2 == driver3

        // Comparación por desigualdad (!=)
        val isNotEqual1 = driver3 != driver4
        val isNotEqual2 = driver4 != driver5

        Log.d("Comparison", "Driver1 == Driver2: $isEqual1")
        Log.d("Comparison", "Driver2 == Driver3: $isEqual2")
        Log.d("Comparison", "Driver3 != Driver4: $isNotEqual1")
        Log.d("Comparison", "Driver4 != Driver5: $isNotEqual2")
    }

    val originalDriver = Driver("Lewis Hamilton", "Mercedes-AMG", "Reino Unido", 44)

    fun copyAndModifyDriver() {
        // Crear una copia del objeto original
        val copiedDriver = originalDriver.copy()

        // Modificar algunas propiedades de la copia
        copiedDriver.team = "Aston Martin"
        copiedDriver.number = 7

        // Imprimir los objetos original y modificado
        Log.d("CopiedDriver", originalDriver.toString())
        Log.d("CopiedDriver", copiedDriver.toString())
    }

    fun destructureDriver() {
        val (nombre, equipo, pais, numero) = driver1
        Log.d("DestructuredDriver", "Nombre: $nombre")
        Log.d("DestructuredDriver", "Equipo: $equipo")
        Log.d("DestructuredDriver", "País: $pais")
        Log.d("DestructuredDriver", "Número: $numero")
    }

    fun printToString() {
        Log.d("ToString", driver1.toString())
        Log.d("ToString", driver2.toString())
        Log.d("ToString", driver3.toString())
        Log.d("ToString", driver4.toString())
        Log.d("ToString", driver5.toString())
    }

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

        printDriverDetails()
        compareDrivers()
        destructureDriver()

        // Llamar a la función printTeamDetails con un equipo de ejemplo
        val equipoEjemplo = Team.Mercedes
        printTeamDetails(equipoEjemplo)
    }
}

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

data class Driver(
    val name: String,
    var team: String,
    val country: String,
    var number: Int
)