package com.fang.health.controller;

import com.fang.health.domain.ResponseResult;
import com.fang.health.domain.dto.AddDataDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health/measured")
public class HealthMeasuredController {

    @PostMapping("/addData")
    public ResponseResult addData(@RequestBody AddDataDto addDataDto) {
        System.out.println(addDataDto);
        return ResponseResult.okResult();
    }
}
