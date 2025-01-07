package org.example.kotlincrud.post.presentation.dto.request

import org.example.kotlincrud.post.persistence.domain.Post

data class PostRequest(
        val title:String,
        val content: String
){
    fun toEntity():Post = Post(
            title = title,
            content = content
    )
}
