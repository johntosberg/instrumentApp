package com.github.johntosberg.instrumentApp.service

import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Service
import mu.KotlinLogging

private val logger = KotlinLogging.logger {}

@Service
class ServiceExample {

    @Scheduled(fixedRate = 5_000)
    fun tellMeItsWorking() {
        logger.info { "Look mom I made an app on a scheduler!" }
    }
}