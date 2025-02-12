package com.marketplace.controller;

import com.marketplace.config.OpenApiConfig;
import com.marketplace.entity.User;
import com.marketplace.service.CustomUserDetailsService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.marketplace.config.OpenApiConfig.*;

@Slf4j
@Tag(name = OpenApiConfig.GROUP_USERS)
@RestController
//@RequestMapping("/api")
@RequiredArgsConstructor
public class UserController {
    private final CustomUserDetailsService customUserDetailsService;

    @Operation(
            summary = "Get all relations of ID type to AID-type or AID type to ID-type",
            description = "Extracts the relations aidType and idType."
    )
    @GetMapping(path = "/api/users",
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ApiResponses(
            value = {
                    @ApiResponse(
                            responseCode = HTTP_STATUS_CODE_OK,
                            description = HTTP_STATUS_CODE_OK_DESCRIPTION,
                            content =
                            @Content(
                                    mediaType = MediaType.APPLICATION_JSON_VALUE,
                                    array = @ArraySchema(schema = @Schema(implementation = User.class)))),
                    @ApiResponse(
                            responseCode = HTTP_STATUS_CODE_INTERNAL_SERVER_ERROR,
                            description = HTTP_STATUS_CODE_INTERNAL_SERVER_ERROR_DESCRIPTION,
                            content =
                            @Content(
                                    mediaType = MediaType.APPLICATION_PROBLEM_JSON_VALUE,
                                    schema = @Schema(implementation = ErrorResponse.class)))
            })
    public List<User> getUsers() {
            return customUserDetailsService.getAllUsers();
    }
}
