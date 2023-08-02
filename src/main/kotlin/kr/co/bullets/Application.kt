package kr.co.bullets

import io.ktor.application.*
import io.ktor.features.*
import io.ktor.http.content.*
import io.ktor.response.*
import io.ktor.routing.*

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

fun Application.module() {
//    configureRouting()
    install(CallLogging)
    routing {
//        static(remotePath = "assets") {
        static() {
            resources("static")
//            resource("static/google.html")
//            resource("static/text.txt")
//            resource("static/logo.jpeg")
        }
        get("/") {
            call.respondText("Hello, World!")
        }
    }
}

//fun Application.module2() {
//    routing {
//        get("/book") {
//            call.respondText("Hello, World 2!")
//        }
//    }
//}
