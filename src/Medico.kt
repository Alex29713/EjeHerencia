 class Medico(

    var especialidad: Int,
    var servicio: Int,
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

        println("Ingrese el nombre del médico:")
        nombre = readLine() ?: ""

        println("Ingrese el apellido del médico:")
        apell = readLine() ?: ""

        println(" Ingrese la especialidad del médico:")
        println("=====================================")
        println("1. Cirujano General | 2. Oftalmología")
        println("3. Cardiologo       | 4. Dermatologo")
        println("5. Pediatra         |")


        especialidad = readLine()?.toIntOrNull() ?: 0

        servicio = especialidad

        println("Ingrese el número de consultorio:")
        numConsultorio = readLine()?.toIntOrNull() ?: 0

//        println("Ingrese el DNI del médico:")
//        dni = readLine() ?: ""



//        println("Ingrese la fecha de nacimiento del médico (dd/mm/yyyy):")
//        fechan = readLine() ?: ""

//        println("Ingrese la dirección del médico:")
//        direccion = readLine() ?: ""

//        println("Ingrese la ciudad de procedencia del médico:")
//        ciudadp = readLine() ?: ""

//        println("Ingrese el número de horas extras:")
//        numhorasextras = readLine()?.toIntOrNull() ?: 0

//        println("Ingrese la fecha de ingreso del médico (dd/mm/yyyy):")
//        fechai = readLine() ?: ""

//        println("Ingrese el área de trabajo del médico:")
//        area = readLine() ?: ""

//        println("Ingrese el cargo del médico:")
//        cargo = readLine() ?: ""

//        println("Ingrese el salario mensual del médico:")
//        salariom = readLine()?.toDoubleOrNull() ?: 0.0

//        println("Ingrese el porcentaje adicional por hora extra:")
//        porcentaje = readLine()?.toDoubleOrNull() ?: 0.0
    }

}