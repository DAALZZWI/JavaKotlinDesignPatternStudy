package BuilderPattern.Kotlin.ExampleManagementProgram

fun main() {

    val group: Group = group {
        name { "이세돌" }
        company {
            name { "주식회사 바둑돌" }
        }
        members {
            member {
                name { "박세돌" }
                alias { "이세돌 1째" }
                year { 1995 }
            }
            member {
                name { "홍세돌" }
                alias { "이세돌 2째" }
                year { 1995 }
            }
            member {
                name { "홍세돌" }
                alias { "이세돌 2째" }
                year { 1995 }
            }
        }
    }

    println(group)
}