package TemplateMethodPattern.Kotlin.dp

abstract class AbstServer() {

    protected abstract fun doEntry(s: String)
    protected abstract fun doAuthentication(id: String, password: String) : Boolean
    protected abstract fun doAuthorization(s:String) : Int
    protected abstract fun doConnection(userName: String)

    public fun serverConnection(userInfo: String): Unit {

        doEntry(userInfo)

        val id = "hello"
        val pwd = "hello1234"
        doAuthentication(id, pwd)

        val userName = "userName"
        val i = doAuthorization(userName)

        when (i) {
            0 -> println("게임 매니저")
            1 -> println("유료 회원")
            2 -> println("무료 회원")
            3 -> println("신입 회원")
        }

        doConnection(userName)
    }
}


