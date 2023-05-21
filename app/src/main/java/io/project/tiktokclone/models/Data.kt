package io.project.tiktokclone.models

data class Data(
    val offset: String,
    val page: String,
    val posts: List<PostResponse>
)