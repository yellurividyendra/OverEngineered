package com.example.chatbot.models.imageresponse.chat

data class Usage(
    val completion_tokens: Int,
    val prompt_tokens: Int,
    val total_tokens: Int
)