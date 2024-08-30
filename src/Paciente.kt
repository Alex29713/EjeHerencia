class Paciente(
    var numh:Int,
    var sexo:String,
    var grupos:String,
    var listam:List<String>,

    dni: String,
    nombre:String,
    apell:String,
    fechan:String,
    direccion:String,
    ciudadp:String

    ):Persona(dni,nombre,apell,fechan,direccion,ciudadp)
{
        fun crearPaciente(){
            print("Ingrese el número de DNI: ")
            dni = readln()

            print("Ingrese el nombre: ")
            nombre = readln()
            print("Ingrese el apellido: ")
            apell = readln()

//         print("Ingrese la fecha de nacimiento (dd/mm/aaaa): ")
//         fechan = readln()

//         print("Ingrese la dirección: ")
//         direccion = readln()

//         print("Ingrese la ciudad de procedencia: ")
//         ciudadp = readln()

//       // Captura de datos de Paciente

//         print("Ingrese el sexo (M/F): ")
//         sexo = readln()

//         print("Ingrese el grupo sanguíneo: ")
//         grupos = readln()

//         print("Ingrese los medicamentos a los que es alérgico (separados por comas): ")
//         val alergiasInput = readln()
//         listam = alergiasInput.split(",").map { it.trim() }

        }

}