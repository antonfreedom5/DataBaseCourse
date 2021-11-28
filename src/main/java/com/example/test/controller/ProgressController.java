package com.example.test.controller;

import com.example.test.service.ProgressService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ProgressController {
    private final ProgressService progressService;
}
