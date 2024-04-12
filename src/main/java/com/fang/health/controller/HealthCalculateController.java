package com.fang.health.controller;

import com.fang.health.domain.ResponseResult;
import com.fang.health.domain.dto.AddOriginalDataDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health/calculate")
public class HealthCalculateController {

    @PostMapping("/addOriginalData")
    public ResponseResult addOriginalData(@RequestBody AddOriginalDataDto addOriginalDataDto) {
        System.out.println(addOriginalDataDto);
        return ResponseResult.okResult();
    }
}
