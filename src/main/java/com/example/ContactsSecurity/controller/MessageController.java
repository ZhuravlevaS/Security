package com.example.ContactsSecurity.controller;

import com.example.ContactsSecurity.dto.message.RequestMessageDto;
import com.example.ContactsSecurity.dto.message.ResponseMessageDTO;
import com.example.ContactsSecurity.dto.message.ResponseModelDTO;
import com.example.ContactsSecurity.dto.message.ResultMessageDTO;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@NoArgsConstructor
@RequestMapping("/api/messages")
public class MessageController {
    @GetMapping
    public ResponseModelDTO<List<ResultMessageDTO>> getChat(
            @RequestHeader("Authorization") String token,
            @RequestBody RequestMessageDto requestMessageDto) {
        return null;
    }

    @PostMapping
    public ResponseModelDTO<ResponseMessageDTO> createMessage(
            @RequestHeader("Authorization") String token

    ){
        return null;
    }

}
