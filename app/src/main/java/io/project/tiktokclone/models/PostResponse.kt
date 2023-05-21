package io.project.tiktokclone.models

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "Posts")
data class PostResponse(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    val comment: Comment,
    val creator: Creator,
    val postId: String,
    val reaction: Reaction,
    val submission: Submission
)