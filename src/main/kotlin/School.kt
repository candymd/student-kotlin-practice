data class School(val students: List<Student>) {

    fun countStudents() =
        println("There are ${students.count()} students in this school.")

    fun getStudentByName(name: String) =
        students.find { it.name == name }
}