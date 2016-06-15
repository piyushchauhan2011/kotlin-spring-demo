package org.piyush

import org.springframework.data.repository.CrudRepository

/**
 * Created by piyushchauhan on 15/06/2016.
 */

interface CustomerRepository: CrudRepository<Customer, Long> {
    fun findByLastName(lastName: String): List<Customer>
}