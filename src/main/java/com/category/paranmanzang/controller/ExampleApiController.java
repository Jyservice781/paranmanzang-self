package com.category.paranmanzang.controller;

import com.category.paranmanzang.model.domain.BasicResponseDto;
import com.category.paranmanzang.model.domain.MemberJoinRequestDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@Tag(name = "제목", description = "소제목")
@RestController
@CrossOrigin(origins = "http://localhost:3000/")
@RequiredArgsConstructor
@RequestMapping("/api/v1/example")
public class ExampleApiController {

    @PostMapping("/{pathValue}")
    @Operation(summary = "예시로 갈겨봅니다", description = "Your description")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Success",
                    content = {@Content(schema = @Schema(implementation = BasicResponseDto.class))}),
            @ApiResponse(responseCode = "404", description = "Not Found"),
    })
    public BasicResponseDto exampleAPI(
            //Path Parameter
            @PathVariable
            @Schema(description = "Path Value", example = "1")
            Long pathValue,

            //Query Parameter
            @Parameter(name = "paramValue", description = "Parameter Value", example = "3", required = true)
            @RequestParam final Long paramValue,

            //Request Body
            @RequestBody @Valid MemberJoinRequestDto requestBody
    ) {
        String s = String.format("PathValue = %d , ParamValue = %s, Request Email : %s", pathValue, paramValue, requestBody.getEmail());
        BasicResponseDto response = new BasicResponseDto(true, "Example API Success",  s);
        return response;
    }

    @SuppressWarnings("unchecked")
    public void someMethod() {
        List list = new ArrayList();
        list.add("string");
    }




}