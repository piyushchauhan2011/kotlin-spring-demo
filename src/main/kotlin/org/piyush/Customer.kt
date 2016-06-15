package org.piyush

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

/**
 * Created by piyushchauhan on 15/06/2016.
 */

@Entity
class Customer {

    @Id @GeneratedValue(strategy = GenerationType.AUTO) private var id: Long = 0
    private var firstName: String = ""
    private var lastName: String = ""

    constructor() {}

    constructor(firstName: String, lastName: String) {
        this.firstName = firstName
        this.lastName = lastName
    }

    override fun toString(): String {
        return String.format(
                "Customer[id=${this.id}, firstName=${this.firstName}, lastName=${lastName}]"
        )
    }
}