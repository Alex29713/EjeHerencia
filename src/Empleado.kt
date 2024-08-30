import com.sun.tools.javac.Main

open class Empleado (
    var cod:Int,
    var numhorasextras:Int,
    var fechai:String,
    var area:String,
    var cargo:String,

    dni: String,
    nombre:String,
    apell:String,
    fechan:String,
    direccion:String,
    ciudadp:String




):Persona(dni,nombre,apell,fechan,direccion,ciudadp){
}