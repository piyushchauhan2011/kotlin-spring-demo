package org.piyush

import org.slf4j.LoggerFactory
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class KotlinSpringDemoApplication

val log = LoggerFactory.getLogger(KotlinSpringDemoApplication::class.java)

fun main(args: Array<String>) {
    SpringApplication.run(KotlinSpringDemoApplication::class.java, *args)
}
