package BuilderPattern.Kotlin.ExampleManagementProgram

data class Group(

    val name: String,
    val company: Company,
    val members: List<Member>
)

fun group(lambda: GroupBuilder.() -> Unit): Group {

    return GroupBuilder().apply(lambda).build()
}

class GroupBuilder {

    private var name = ""
    private var company = Company("")
    private var members = mutableListOf<Member>()

    fun name(lambda: () -> String) {
        name = lambda()
    }

    fun company(lambda: CompanyBuilder.() -> Unit) {

        company = CompanyBuilder().apply(lambda).build()
    }

    fun members(lambda: MemberListBuilder.() -> Unit) {

        members.addAll(MemberListBuilder().apply(lambda).build())
    }

    fun build() = Group(name, company, members)
}
