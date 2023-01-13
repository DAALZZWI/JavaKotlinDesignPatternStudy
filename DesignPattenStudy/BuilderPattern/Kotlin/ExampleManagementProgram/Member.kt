package BuilderPattern.Kotlin.ExampleManagementProgram

data class Member(

    val name: String,
    val alias: String,
    val year: Int
)

class MemberBuilder {

    private var name: String = ""
    private var alias: String = ""
    private var year: Int = 0

    fun name(lambda: () -> String) {

        name = lambda()
    }

    fun alias(lambda: () -> String) {

        alias = lambda()
    }

    fun year(lambda: () -> Int) {

        year = lambda()
    }

    fun build() = Member(name, alias, year)
}

class MemberListBuilder {

    private var list: MutableList<Member> = mutableListOf<Member>()

    fun member(lambda: MemberBuilder.() -> Unit) =

        list.add(MemberBuilder().apply(lambda).build())

    fun build() = list
}
