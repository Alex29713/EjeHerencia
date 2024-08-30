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
            val dni = readln()

            print("Ingrese el nombre: ")
            val nombre = readln()
            print("Ingrese el apellido: ")
            val apellido = readln()

            print("Ingrese la fecha de nacimiento (dd/mm/aaaa): ")
            val fechaNacimiento = readln()

            print("Ingrese la dirección: ")
            val direccion = readln()

            print("Ingrese la ciudad de procedencia: ")
            val ciudadProcedencia = readln()

            // Captura de datos de Paciente

            print("Ingrese el sexo (M/F): ")
            val sexo = readln()

            print("Ingrese el grupo sanguíneo: ")
            val grupoSanguineo = readln()

            print("Ingrese los medicamentos a los que es alérgico (separados por comas): ")
            val alergiasInput = readln()
            val alergias = alergiasInput.split(",").map { it.trim() }

        }

}