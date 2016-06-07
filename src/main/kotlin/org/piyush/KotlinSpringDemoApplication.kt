package org.piyush

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class KotlinSpringDemoApplication

fun main(args: Array<String>) {
    SpringApplication.run(KotlinSpringDemoApplication::class.java, *args)
}
