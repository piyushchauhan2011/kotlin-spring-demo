package org.piyush

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

/**
 * Created by piyushchauhan on 15/06/2016.
 */

@Entity
data class Customer(
    val firstName: String = "",
    val lastName: String = "",
    @Id @GeneratedValue(strategy = GenerationType.AUTO) val id: Long = 0
)