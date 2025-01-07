package org.example.kotlincrud.post.persistence.domain

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
@Entity
class Post(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id:Long? = null,
        @Column(length = 500, nullable = false)
        var content:String,
        @Column(length = 60, nullable = false)
        var title:String
)