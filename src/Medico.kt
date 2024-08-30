 class Medico(

    var especialidad: String,
    var servicio: String,
    var numConsultorio: Int,

    dni: String,
    nombre:String,
    apell:String,
    fechan:String,
    direccion:String,
    ciudadp:String,

    cod:Int,
    numhorasextras:Int,
    fechai:String,
    area:String,
    cargo:String,

    salariom:Double,
    porcentaje:Double

) : EmpleadoPlanilla(salariom,porcentaje,cod,numhorasextras,fechai,area,cargo,dni,nombre,apell,fechan,direccion,ciudadp){

    fun solicitarDatosMedico() {
        println("Ingrese la especialidad del médico:")
        especialidad = readLine() ?: ""

        println("Ingrese el servicio del médico:")
        servicio = readLine() ?: ""

        println("Ingrese el número de consultorio:")
        numConsultorio = readLine()?.toIntOrNull() ?: 0

        println("Ingrese el DNI del médico:")
        dni = readLine() ?: ""

        println("Ingrese el nombre del médico:")
        nombre = readLine() ?: ""

        println("Ingrese el apellido del médico:")
        apell = readLine() ?: ""

        println("Ingrese la fecha de nacimiento del médico (dd/mm/yyyy):")
        fechan = readLine() ?: ""

        println("Ingrese la dirección del médico:")
        direccion = readLine() ?: ""

        println("Ingrese la ciudad de procedencia del médico:")
        ciudadp = readLine() ?: ""

        println("Ingrese el código del empleado:")
        cod = readLine()?.toIntOrNull() ?: 0

        println("Ingrese el número de horas extras:")
        numhorasextras = readLine()?.toIntOrNull() ?: 0

        println("Ingrese la fecha de ingreso del médico (dd/mm/yyyy):")
        fechai = readLine() ?: ""

        println("Ingrese el área de trabajo del médico:")
        area = readLine() ?: ""

        println("Ingrese el cargo del médico:")
        cargo = readLine() ?: ""

        println("Ingrese el salario mensual del médico:")
        salariom = readLine()?.toDoubleOrNull() ?: 0.0

        println("Ingrese el porcentaje adicional por hora extra:")
        porcentaje = readLine()?.toDoubleOrNull() ?: 0.0
    }

}