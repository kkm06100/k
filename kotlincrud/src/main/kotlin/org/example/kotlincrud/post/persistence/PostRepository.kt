package org.example.kotlincrud.post.persistence

import org.example.kotlincrud.post.persistence.domain.Post
import org.springframework.data.jpa.repository.JpaRepository

interface PostRepository : JpaRepository<Post, Long> {

}