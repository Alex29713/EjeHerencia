open class EmpleadoPlanilla (
    var salariom:Double,
    var porcentaje:Double,

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



):Empleado(cod,numhorasextras,fechai,area,cargo,dni,nombre,apell,fechan,direccion,ciudadp)
{
    fun crearEmpleadoPlanilla(){
        println("Ingrese los datos del empleado por planilla:")

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
//        ciudadp= readLine().orEmpty()

//        print("Número de Horas Extras: ")
//        numhorasextras = readLine()?.toIntOrNull() ?: 0

//        print("Fecha de Ingreso (dd/MM/yyyy): ")
//        fechai = readLine().orEmpty()

//        print("Área: ")
//        area = readLine().orEmpty()

//        print("Cargo: ")
//        cargo = readLine().orEmpty()

//        print("Salario Mensual: ")
//        salariom = readLine()?.toDoubleOrNull() ?: 0.0

//        print("Porcentaje por Hora Extra: ")
//        porcentaje = readLine()?.toDoubleOrNull() ?: 0.0

    }
}