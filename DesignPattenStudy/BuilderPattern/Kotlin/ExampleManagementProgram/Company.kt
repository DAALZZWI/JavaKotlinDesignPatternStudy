package BuilderPattern.Kotlin.ExampleManagementProgram

data class Company(

    var name: String
)

class CompanyBuilder {

    private var name: String = ""

    fun name(lambda: () -> String) {

        this.name = lambda()
    }

    fun build() = Company(name)
}