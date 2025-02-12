package com.marketplace.controller;

import com.marketplace.base.configuration.OpenApiDocumentation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@Tag(name = OpenApiDocumentation.GROUP_USERS)
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserController {
    private final UserDetailsService userDetailsService;
}
