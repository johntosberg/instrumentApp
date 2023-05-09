package com.github.johntosberg.instrumentApp.controller
import mu.KotlinLogging
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

private val logger = KotlinLogging.logger {}

@RestController
class HelloWorldController {

    @GetMapping("/hello")
    fun helloWorld(): String {
        logger.info { "Saying hello to a good friend" }
        return "Hello, World!"
    }
}