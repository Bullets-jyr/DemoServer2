package kr.co.bullets

import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*
import kr.co.bullets.plugins.*

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

fun Application.module() {
//    configureRouting()
    routing {
        get("/") {
            call.respondText("Hello, World!")
        }
    }
}

fun Application.module2() {
    routing {
        get("/book") {
            call.respondText("Hello, World 2!")
        }
    }
}
