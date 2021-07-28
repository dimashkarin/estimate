package com.estimate.controller;

import com.estimate.dto.entity.Estimate;
import com.estimate.service.EstimateService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@Api(tags = "Смета")
@Validated
@RestController
@RequestMapping("/estimate")
public class EstimateController {

    EstimateService estimateService;

    @ApiOperation(value = "Получает значения cмет")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "success=true - если успешно")})
    @GetMapping("/get")

    public String get(@RequestParam Long id) {
        System.out.println(estimateService.findEstimateById(id));
        return "Hello";
    }

    @ApiOperation(value = "Записывает значения cмет")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "success=true - если успешно")})
    @GetMapping("/put")

    public void put(Estimate estimate) {
        System.out.println("Hello");
        // estimateService.save(estimate);
    }

}
