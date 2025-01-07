package org.example.kotlincrud.post.service

import org.example.kotlincrud.post.persistence.PostRepository
import org.example.kotlincrud.post.presentation.dto.request.PostRequest
import org.example.kotlincrud.post.presentation.dto.response.PostResponse
import org.springframework.data.repository.findByIdOrNull
import org.springframework.transaction.annotation.Transactional

@Transactional
class PostService(
        private val postRepository: PostRepository
) {
    fun save(request: PostRequest): Long? = postRepository.save(request.toEntity()).id

    fun update(id: Long, request:PostRequest): Long? {
        val post = postRepository.findByIdOrNull(id) ?: throw IllegalArgumentException("id = $id, 해당하는 게시글이 없습니다.")

        post.title = request.title
        post.content = request.content

        return id
    }

    fun findPostById(id: Long): PostResponse {
        val post = postRepository.findByIdOrNull(id) ?: throw IllegalArgumentException("id = $id, 해당하는 게시글이 없습니다.")
        return PostResponse(post)
    }
}