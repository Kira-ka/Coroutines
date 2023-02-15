package ru.netology.coroutines.dto

data class PostWithComments(
    val post: Post,
    val comments: List<Comment> = emptyList(),
    val author: Author
)
