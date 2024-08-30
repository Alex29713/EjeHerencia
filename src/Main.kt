//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var o1  = 0

    var listaEmpleadoEv : MutableList<EmpleadoEventual> = mutableListOf()
    var listaPaciente : MutableList<Paciente> = mutableListOf()
    var listaEmpleadoPl : MutableList<EmpleadoPlanilla> = mutableListOf()
    var listaMedicos: MutableList<Medico> = mutableListOf()

    do{
        println("=============== Menu ===================")
        println("1. Crear Persona")
        println("2. Registrar cita médica")
        println("3. Listar médicos segun especialidad")
        println("4. Listar pacientes segun medico")
        println("5. Salir")
        println("========================================")

        o1 = readln().toInt()

        when(o1){
            1 -> {
                println("===========REGISTRAR PERSONA==========")
                println("1. Crear Paciente")
                println("2. Crear Médico")
                println("3. Crear Empleado de Planilla")
                println("4. Crear Empleado provisional")
                println("3. Crear Empleado")

                val o2 : Int = readln().toInt()

                when(o2)
                {
                    1 ->{
                        val paciente = Paciente(numh = 56789, sexo = "Femenino", grupos = "O+", listam = listOf("Penicilina", "Ibuprofeno"), dni = "87654321B", nombre = "Ana", apell = "Gómez", fechan = "25/12/1990", direccion = "Calle de la Salud, 123", ciudadp = "Bogota")
                        //paciente.crearPaciente()
                        listaPaciente.add(paciente)
                    }
                    2 -> {
                        val medico = Medico(especialidad = "Cardiólogo", servicio = "Cardiología", numConsultorio = 101, dni = "12345678A", nombre = "Juan", apell = "Pérez", fechan = "15/03/1980", direccion = "Av. de la Salud, 456", ciudadp = "Madrid", cod = 1234, numhorasextras = 5, fechai = "01/01/2015", area = "Cardiología", cargo = "Jefe de Cardiología", salariom = 3000.0, porcentaje = 25.0)
                        //medico.solicitarDatosMedico()
                        listaMedicos.add(medico)
                    }
                    3 -> {
                        val empleadoPlanilla = EmpleadoPlanilla(salariom = 2500.0, porcentaje = 20.0, cod = 7890, numhorasextras = 10, fechai = "10/05/2018", area = "Recursos Humanos", cargo = "Gerente de Recursos Humanos", nombre = "Luis", dni = "56789012C", apell = "Martínez", fechan = "20/08/1985", direccion = "Calle del Trabajo, 789", ciudadp = "Sevilla"
                        )
                    }

                }
            }
        }

    }while (o1 != 5)
}