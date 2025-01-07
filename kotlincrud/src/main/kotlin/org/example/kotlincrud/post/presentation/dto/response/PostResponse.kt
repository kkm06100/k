package org.example.kotlincrud.post.presentation.dto.response

import org.example.kotlincrud.post.persistence.domain.Post

class PostResponse(
         val id: Long,
         val title: String,
         val content: String
 ){
     constructor(post: Post):this(
             id = post.id!!,
             title = post.title,
             content = post.content
     )
 }
