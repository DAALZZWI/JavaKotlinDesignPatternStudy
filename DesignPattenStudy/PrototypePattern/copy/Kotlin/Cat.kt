package PrototypePattern.copy.Kotlin

data class Cat(var name: String?, var age: Age?) : Cloneable {

    fun copy(): Cat {

        var ref: Cat = this.clone() as Cat
        Age(this.age!!.year, this.age!!.value).also { ref.age = it }
        return ref
    }
}