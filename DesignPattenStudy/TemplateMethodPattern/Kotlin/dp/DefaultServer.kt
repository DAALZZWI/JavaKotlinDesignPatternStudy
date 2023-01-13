package TemplateMethodPattern.Kotlin.dp

class DefaultServer() : AbstServer() {

    override fun doEntry(s: String) {
        println("서버 입장")
    }

    override fun doAuthentication(id: String, password: String): Boolean {
        println("서버 인가")
        return true
    }

    override fun doAuthorization(s: String): Int {
        println("서버 인증")
        return 0
    }

    override fun doConnection(userName: String) {
        println("서버 연결")
    }
}