import kotlin.random.Random
import kotlin.random.nextUInt


fun main(args: Array<String>) {
    // task for 8 points
    //    var list = mutableListOf<Student>(
    //        Student("mike","popovich", mutableListOf(2,2,2,2,3,2)),
    //        Student("joe", "hunter", mutableListOf(2,3,4,5,3,2)),
    //        Student("james", "stethem", mutableListOf(5,2,2,2,4,3))
    //    )
    //
    //    var choice = Random.nextInt(0, 3)
    //    var countMarks = Random.nextInt(5, 11)
    //
    //    for (i in 1..countMarks) {
    //        list[choice].addGrade(Random.nextInt(1, 6))
    //    }
    //
    //    list.forEach {it -> println(it.toString()) }


    var countStudent = Random.nextInt(0, 100)

    var studentList = mutableListOf<Student>()

    for (i in 1..countStudent) {
        var studentGrades = mutableListOf<Int>()

        val countMarks = Random.nextInt(1, 20)

        for (mark in 1..countMarks) {
            studentGrades.add(Random.nextInt(1, 6))
        }

        studentList.add(Student("student-$i", "lastname-$i", studentGrades))
    }

    var sortedList = studentList.sortedByDescending { it -> it.grades.sum() }

    sortedList.forEach {it -> println(it.toString()) }
}