package com.example.zadacha_for_intern.controller;

import com.example.zadacha_for_intern.service.MainService;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@AllArgsConstructor
@Slf4j
public class MainController {
    private MainService mainService;

    @GetMapping("/str")

    public ResponseEntity<String> getCountCharsToString(@RequestParam @NotEmpty String str){
        String string = mainService.getCountCharsToString(str);
        return ResponseEntity.ok().body(string);
    }

}
