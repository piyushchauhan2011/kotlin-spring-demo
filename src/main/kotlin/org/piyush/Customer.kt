package org.piyush

import javax.persistence.*

/**
 * Created by piyushchauhan on 15/06/2016.
 */

@Entity
@Table(name = "customers")
data class Customer(
    val firstName: String = "",
    val lastName: String = "",
    @Id @GeneratedValue(strategy = GenerationType.AUTO) val id: Long = 0
)