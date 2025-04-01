package io.venerated.cicd.qa.java

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    @GetMapping("/")
      fun hello(): String = "Hello! Web Server is running!"

    @GetMapping("/json")
    fun helloJson(): Greeting {
        return Greeting("Hello", "Web Server Is Running!")
    }
}

data class Greeting(
    val message: String,
    val status: String
)