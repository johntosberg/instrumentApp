package com.github.johntosberg.instrumentApp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@EnableScheduling
class InstrumentAppApplication

fun main(args: Array<String>) {
	runApplication<InstrumentAppApplication>(*args)
}
