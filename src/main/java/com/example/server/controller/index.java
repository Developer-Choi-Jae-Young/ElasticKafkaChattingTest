package com.example.server.controller;

import com.example.server.dto.ChattingRoomRequestDto;
import com.example.server.dto.RegistUserRequestDto;
import com.example.server.dto.RegistUserResponseDto;
import com.example.server.service.ChattingRoomService;
import com.example.server.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequiredArgsConstructor
@Slf4j
public class index {
    private final UserService userService;
    private final ChattingRoomService chattingRoomService;

    @GetMapping("/index")
    public String index()
    {
        return "index";
    }

    @GetMapping("/home")
    public String home()
    {
        return "home";
    }

    @PostMapping("/signup")
    public RegistUserResponseDto signup(@RequestBody RegistUserRequestDto registUserRequestDto)
    {
        log.info("controller - " + registUserRequestDto.getEmail());
        RegistUserResponseDto responseDto = userService.RegistUser(registUserRequestDto);
        log.info(responseDto.getEmail());
        return responseDto;
    }

    @PostMapping("/chat/create/room")
    public void createChatRoom(@RequestBody ChattingRoomRequestDto chattingRoomRequestDto)
    {
        chattingRoomService.save(chattingRoomRequestDto);
    }

    @GetMapping("/chat/roomlist/{roomname}")
    public void getRoom(@PathVariable("roomname") String roomname) throws IOException
    {
        chattingRoomService.searchRoom(roomname);
    }
}
