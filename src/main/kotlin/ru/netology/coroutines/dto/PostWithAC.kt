package ru.netology.coroutines.dto

data class PostWithAC(
    val post: Post,
    val author: Author,
    val comments: List<CommentWithAuthor> = emptyList(),

)
