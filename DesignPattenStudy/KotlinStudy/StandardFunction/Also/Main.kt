package KotlinStudy.StandardFunction.Also

import java.io.File
import java.security.cert.CertPath

fun main(args: Array<String>) {

    // ================================================

    data class Person(var name:String?, var skills: String)

    var person: Person = Person("Kim", "kotlin")

    val a = person.also {
        person.copy()
        it.skills = "Android"
    }

    println("a $a, person $person")

    println(person == a)
    println(person === a)

    // ================================================

    fun makeDir(path: String): File {

        val result = File(path)
        result.mkdirs()
        return result
    }

    // 위에 있는 것을 아래로 줄일 수 있다

    fun makeDirAlso(path: String): File = path.let { File(it) }.also { it.mkdirs() }
}