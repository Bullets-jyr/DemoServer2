package kr.co.bullets

import io.ktor.application.*
import io.ktor.features.*
import io.ktor.html.*
import io.ktor.http.content.*
import io.ktor.response.*
import io.ktor.routing.*
import kotlinx.html.*

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
        get("/welcome") {
            call.respondHtml {
                val name = call.request.queryParameters["name"]
                head {
                    title { +"Custom Title" }
                }
                body {
                    if (name.isNullOrEmpty()) {
                        h3 { +"Welcome" }
                    } else {
                        h3 { +"Welcome, $name!" }
                    }
                    p { +"Current directory is: ${System.getProperty("user.dir")}"}
                    img(src = "logo.jpeg")
                }
            }
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
