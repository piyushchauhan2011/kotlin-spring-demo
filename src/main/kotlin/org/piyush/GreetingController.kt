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
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String): Greeting {
        val greet = Greeting(counter.incrementAndGet(), "Hello, $name")
        return greet
    }

    @RequestMapping("/customer")
    fun customer(): Customer {
        val cust = Customer("Jack", "Bauer")
        repository.save(cust)
        log.info("Saved customer $cust")

        repository.save(Customer("Chloe", "O'Brian"))
        repository.save(Customer("Kim", "Bauer"))
        repository.save(Customer("David", "Palmer"))
        repository.save(Customer("Michelle", "Dessler"))

        log.info("Customers found with findAll():")
        log.info("-------------------------------")

        repository.findAll().forEach { log.info(it.toString()) }
        val customer = repository.findOne(1L)
        log.info("Customer found with findOne(1L):")
        log.info("--------------------------------")
        log.info(customer.toString())
        log.info("")

        log.info("Customer found with findByLastName('Bauer'):")
        log.info("--------------------------------------------")
        repository.findByLastName("Bauer").forEach { log.info(it.toString()) }
        log.info("")

        return cust
    }
}