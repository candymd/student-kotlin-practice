fun main() {

    // Students
    val pedro = Student("Pedro", 6)
    val maria = Student("Maria", 5)
    val jose = Student("Jose", 2)

    // All students
    val students: List<Student> = listOf(pedro, maria, jose)

    // School
    val school = School(students)


    fun exit() {
        println("Goodbye!")
    }

    fun printWelcomeMessage() {
        println("✨ Welcome to the school management system! ✨")
    }
    fun printMenu() {
        println("What would you like to do?")
        println("1. Get all students 👩‍🎓")
        println("2. Get student info 📎")
        println("3. Count students 🔢")
        println("4. Exit 👋")
    }

    fun getAllStudents(students: List<Student>) {
        println("These are all the current students in the school" )
        students.forEach {
            println("Name: ${it.name}, Grade: ${it.grade}")
        }
    }

   fun getStudentInfo() {
        println("Enter the name of the student you want to know more about: ")
       val input = readLine()
        val student = school.getStudentByName(input!!)
           if (input == student?.name) {
               student.getInfo()
               if (student.isGradeHigherThan5()) {
                   println("This student has a passing grade ✅")
               } else {
                   println("This student has a failing grade ❌")
               }
           } else {
               println("Student not found")
       }
    }
    fun readCommand() {
        when (readLine()) {
            "1" -> getAllStudents(students)
            "2" -> getStudentInfo()
            "3" -> school.countStudents()
            "4" -> exit()
            else -> {
                println("Command not found")
                exit()
            }
        }
    }

   printWelcomeMessage()
    printMenu()
    readCommand()

}

