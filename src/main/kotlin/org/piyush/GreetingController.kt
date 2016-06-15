package org.piyush

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

/**
 * Created by piyushchauhan on 7/06/2016.
 */

@RestController
class GreetingController {
    val counter = AtomicLong()

    @Autowired
    lateinit var repository: CustomerRepository

    @RequestMapping("/greeting")
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String): Customer {
        val cust = Customer("Jack", "Bauer")
        repository.save(cust)
        log.info("Saved customer $cust")
        val greet = Greeting(counter.incrementAndGet(), "Hello, $name")
        return cust
    }
}