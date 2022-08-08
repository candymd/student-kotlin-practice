data class Student(val name: String, val grade: Int) {

    fun getInfo() {
            println("Name: $name, Grade: $grade")
    }

    fun isGradeHigherThan5() = grade > 5
}
