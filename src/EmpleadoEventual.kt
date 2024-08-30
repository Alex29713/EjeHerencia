class EmpleadoEventual (
    var honorarios:Double,
    var numhorastotales:Int,
    var fechater:String,

    cod:Int,
    numhorasextras:Int,
    fechai:String,
    area:String,
    cargo:String,

    dni: String,
    nombre:String,
    apell:String,
    fechan:String,
    direccion:String,
    ciudadp:String

):Empleado(cod,numhorasextras,fechai,area,cargo,dni,nombre,apell,fechan,direccion,ciudadp){


    fun crearEmpleadoEventual() {
        println("Ingrese los datos del empleado eventual:")

        print("Nombre: ")
        nombre = readLine().orEmpty()

//        print("DNI: ")
//        dni = readLine().orEmpty()

        print("Apellido: ")
        apell = readLine().orEmpty()

//        print("Fecha de Nacimiento (dd/MM/yyyy): ")
//        fechan = readLine().orEmpty()

//        print("Dirección: ")
//        direccion = readLine().orEmpty()

//        print("Ciudad de Procedencia: ")
//        ciudadp = readLine().orEmpty()
//
//        print("Número de Horas Extras: ")
//        numhorasextras = readLine()?.toIntOrNull() ?: 0
//
//        print("Fecha de Ingreso (dd/MM/yyyy): ")
//        fechai = readLine().orEmpty()
//
//        print("Área: ")
//        area = readLine().orEmpty()
//
//        print("Cargo: ")
//        cargo = readLine().orEmpty()
//
//        print("Honorarios por Hora: ")
//        honorarios = readLine()?.toDoubleOrNull() ?: 0.0
//
//        print("Número Total de Horas (normales + extras): ")
//        numhorastotales = readLine()?.toIntOrNull() ?: 0
//
//        print("Fecha de Terminación (puede ser un valor representativo como mes o día): ")
//        fechater = readLine().toString()
    }

}