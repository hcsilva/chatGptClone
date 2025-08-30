package com.dev.api_ai.memory;

import com.dev.api_ai.chat.ChatMessage;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/chat-memory")
public class MemoryChatController {

    private final MemoryChatService memoryChatService;

    public MemoryChatController(MemoryChatService memoryChatService) {
        this.memoryChatService = memoryChatService;
    }

    @PostMapping()
    public ChatMessage simpleChat(@RequestBody ChatMessage message) {
        var response = this.memoryChatService.simpleChat(message.message());
        return new ChatMessage(response);
    }
}
