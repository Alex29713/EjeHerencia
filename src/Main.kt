import java.time.LocalDate
import java.time.LocalDateTime
import java.time.Month
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit
import kotlin.random.Random

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var o1  = 0

    val listaEmpleadoEv : MutableList<EmpleadoEventual> = mutableListOf()
    val listaPaciente : MutableList<Paciente> = mutableListOf()
    val listaEmpleadoPl : MutableList<EmpleadoPlanilla> = mutableListOf()
    val listaMedicos: MutableList<Medico> = mutableListOf()
    val listaCitas: MutableList<infoCitas> = mutableListOf()

    do{
        println("=============== Menu ===================")
        println("1. Crear Persona")
        println("2. Registrar cita médica")
        println("3. Listar médicos segun especialidad")
        println("4. Listar pacientes segun medico")
        println("5. Salir")
        println("========================================")
        println("Digite una opcion >> ")
        o1 = readln().toInt()
        var o2 : Int = 0
        var o3 : Int = 0
        when(o1){
            1 -> {

                println("===========REGISTRAR PERSONA==========")
                println("1. Crear Paciente")
                println("2. Crear Médico")
                println("3. Crear Empleado de Planilla")
                println("4. Crear Empleado provisional")
                println("5. Salir")
                println("======================================")
                println("Digite una opcion >> ")

                o2 = readln().toInt()


                when(o2)
                {
                    1 ->{
                        val paciente = Paciente(numh = 56789, sexo = "Femenino", grupos = "O+", listam = listOf("Penicilina", "Ibuprofeno"), dni = "87654321B", nombre = "Ana", apell = "Gómez", fechan = "25/12/1990", direccion = "Calle de la Salud, 123", ciudadp = "Bogota")
                        paciente.crearPaciente()
                        listaPaciente.add(paciente)
                    }
                    2 -> {
                        val medico = Medico(especialidad = 1, servicio = 1, numConsultorio = 101, dni = "12345678A", nombre = "Juan", apell = "Pérez", fechan = "15/03/1980", direccion = "Av. de la Salud, 456", ciudadp = "Madrid", cod = listaMedicos.size, numhorasextras = 5, fechai = "01/01/2015", area = "Cardiología", cargo = "Jefe de Cardiología", salariom = 3000.0, porcentaje = 25.0)
                        medico.solicitarDatosMedico()
                        listaMedicos.add(medico)
                    }
                    3 -> {
                        val empleadoPlanilla = EmpleadoPlanilla(salariom = 2500.0, porcentaje = 20.0, cod = listaEmpleadoPl.size, numhorasextras = 10, fechai = "10/05/2018", area = "Recursos Humanos", cargo = "Gerente de Recursos Humanos", nombre = "Luis", dni = "56789012C", apell = "Martínez", fechan = "20/08/1985", direccion = "Calle del Trabajo, 789", ciudadp = "Sevilla")
                        empleadoPlanilla.crearEmpleadoPlanilla()
                        listaEmpleadoPl.add(empleadoPlanilla)
                    }
                    4 -> {
                        val empleadoEventual  = EmpleadoEventual(honorarios = 50.0, numhorastotales = 160, fechater = "12/02/2024", cod = listaEmpleadoEv.size, numhorasextras = 10, fechai = "01/08/2024", area = "Desarrollo", cargo = "Desarrollador", nombre = "Juan", dni = "12345678", apell = "Pérez", fechan = "15/04/1990", direccion = "Calle 23 #8 32", ciudadp = "Bogotá")
                        empleadoEventual.crearEmpleadoEventual()
                        listaEmpleadoEv.add(empleadoEventual)
                    }
                    else -> println("Opcion invalida")
                }

            }
            2 ->
            {
                if ( listaMedicos.isNotEmpty() && listaEmpleadoEv.isNotEmpty()){

                    if(listaPaciente.isNotEmpty()){

                        println("========== INICIE SESION =========")
                        listaPaciente.forEachIndexed{index, paciente ->
                            println("${index + 1}. ${paciente.nombre} ${paciente.apell}")
                        }
                        println("==================================")
                        println("Digite opcion >> ")

                        o3 = readln().toInt()

                        while (o3 > listaPaciente.size || o3 < 1){
                            println("Error! Digite nuevamente")
                            o3 = readln().toInt()
                        }

                        println(" ¿Cuál servicio desea solicitar? ")
                        println("=======================================")
                        println("1. Cirugía General\n" +
                                "2. Oftalmología (especialidad en los ojos)\n" +
                                "3. Cardiología (especialidad en el corazón)\n" +
                                "4. Dermatología (especialidad en la piel)\n" +
                                "5. Pediatría (atención médica para niños)")
                        println("========================================")
                        println("Digite una opcion >> ")

                        var o4 = readln().toInt()

                        val startDateTime = LocalDateTime.of(2024, Month.JANUARY, 1, 0, 0)
                        val endDateTime = LocalDateTime.of(2025, Month.DECEMBER, 31, 23, 59)

                        // Calcula el número de segundos entre las dos fechas
                        val secondsBetween = ChronoUnit.SECONDS.between(startDateTime, endDateTime)

                        // Genera un número al azar dentro del rango de segundos
                        val randomSeconds = Random.nextLong(secondsBetween)

                        // Retorna la fecha y hora aleatoria sumando los segundos al azar a la fecha de inicio
                        val fechaHora = startDateTime.plusSeconds(randomSeconds)

                        // Calcula el número de días entre las dos fechas

                        val medicoEncontrado = listaMedicos.firstOrNull { it.servicio == o4 }
                        val nombreCompleto = "${listaPaciente[o3-1].nombre} ${listaPaciente[o3-1].apell}"

                        if(medicoEncontrado != null) {
                            println("Su cita quedó agendada con el médico ${medicoEncontrado.nombre} ${medicoEncontrado.apell}")
                            println("para el dia y hora $fechaHora en el consultorio ${medicoEncontrado.numConsultorio}")

                            val cita = infoCitas(nombreCompleto,fechaHora.toString(),medicoEncontrado.cod,listaPaciente[o3-1].numh)
                            listaCitas.add(cita)

                        }else{
                            println(" No se encuentra disponible el servicio")}

                    }else {
                        println("No existen pacientes")}
                }else if(listaMedicos.isEmpty()) {
                    println("No hay medicos disponibles")}else {
                    println("No hay empleados para atender")}
            }

            3 -> {
                if (listaMedicos.isNotEmpty()){
                println(" ----- Medicos segun especialidad --------")
                println("==========================================")
                println("1. Cirujano\n" +
                        "2. Oftalmologo\n" +
                        "3. Cardiologo\n" +
                        "4. Dermatologo\n" +
                        "5. Pediatra")
                println("===========================================")
                println("Digite una opcion >> ")

                o3 = readln().toInt()

                val contador = listaMedicos.count { medico -> medico.especialidad == o3 }
                if (contador == 0){o3 = 7}

                    when(o3){
                    1 -> println("\n=========== MEDICOS CIRUJANOS ===========")
                    2 -> println("\n========= MEDICOS OFTANMOLOGOS ===========")
                    3 -> println("\n========= MEDICOS CARDIOLOGOS ===========")
                    4 -> println("\n========= MEDICOS DERMATOLOGOS ===========")
                    5 -> println("\n=========== MEDICOS PEDIATRA ===========")
                    else -> println("No existen medicos con esa especialidad")
                }



                    listaMedicos.forEachIndexed{index, medico ->
                        if(medico.especialidad == o3) {

                            val especialidades = mapOf(
                                1 to "Cirugia General",
                                2 to "Oftalmólogia",
                                3 to "Cardiólogia",
                                4 to "Dermatologia",
                                5 to "Pediatria"
                            )
                            val servicio = especialidades[medico.servicio]

                            println("${index + 1}. ${medico.nombre} ${medico.apell} ${servicio} ")
                        }
                    }
            }else{
                    println("No existen medicos registrados")}
            }
            4 ->
            {
                if(listaMedicos.isNotEmpty()){
                println("============ LISTA DE MEDICOS ===========")
                listaMedicos.forEachIndexed{index, medico ->
                    val especialidades = mapOf(
                        1 to "Cirujano",
                        2 to "Oftalmólogo",
                        3 to "Cardiólogo",
                        4 to "Dermatólogo",
                        5 to "Pediatra"
                    )
                    val especialidad = especialidades[medico.especialidad]

                    println("${index + 1}. ${medico.nombre} ${medico.apell} - especialidad: ${especialidad}")
                }
                println("=========================================")
                println("Digite una opcion >>")

                var o4 :Int = readln().toInt()

                listaCitas.forEachIndexed{index, cita ->
                    if(cita.codMedico == (o4-1)){
                        println("${index + 1}. ${cita.paciente} - ${cita.fecha}")
                    }
                }
                }else{
                    println("No existen medicos registrados")}

            }
        }
    }while (o1 != 5)
}