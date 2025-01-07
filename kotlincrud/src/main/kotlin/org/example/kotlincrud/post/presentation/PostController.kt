package org.example.kotlincrud.post.presentation

import org.example.kotlincrud.post.presentation.dto.request.PostRequest
import org.example.kotlincrud.post.presentation.dto.response.PostResponse
import org.example.kotlincrud.post.service.PostService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/post")
class PostController(
        private val postService: PostService
) {
    @GetMapping("/{id}")
    fun getPostById(@PathVariable(name = "id") id:Long):PostResponse = postService.findPostById(id);

    @PostMapping
    fun save(@RequestBody request: PostRequest):Long? = postService.save(request)

    @PatchMapping("/{id}")
    fun save(@PathVariable(name = "id") id:Long, @RequestBody request: PostRequest):Long? = postService.update(id, request)
}