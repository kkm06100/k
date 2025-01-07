package org.example.kotlincrud.post.presentation.dto.response

import org.example.kotlincrud.post.persistence.domain.Post

class PostResponse(
        private val id: Long,
        private val title: String,
        private val content: String
 ){
     constructor(post: Post):this(
             id = post.id!!,
             title = post.title,
             content = post.content
     )
 }
