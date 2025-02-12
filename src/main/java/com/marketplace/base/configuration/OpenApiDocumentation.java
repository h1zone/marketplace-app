package com.marketplace.base.configuration;

import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.media.StringSchema;
import io.swagger.v3.oas.models.parameters.Parameter;
import io.swagger.v3.oas.models.tags.Tag;
import org.springdoc.core.customizers.OperationCustomizer;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
@SecurityScheme(
        name = OpenApiDocumentation.SECURITY_SCHEME_BEARER_AUTHENTICATION,
        type = SecuritySchemeType.HTTP,
        bearerFormat = "JWT",
        scheme = "bearer")
public class OpenApiDocumentation {
    public static final String SECURITY_SCHEME_BEARER_AUTHENTICATION = "Bearer_Authentication";
    public static final String HTTP_STATUS_CODE_OK = "200";
    public static final String HTTP_STATUS_CODE_OK_DESCRIPTION = "The request completed successfully.";
    public static final String HTTP_STATUS_CODE_CREATED = "201";
    public static final String HTTP_STATUS_CODE_CREATED_DESCRIPTION =
            "The request completed and the resource or data was successfully created.";
    public static final String HTTP_STATUS_CODE_NO_CONTENT = "204";
    public static final String HTTP_STATUS_CODE_NO_CONTENT_DESCRIPTION =
            "The request completed and the operation was successful. No data is returned with the response.";
    public static final String HTTP_STATUS_CODE_BAD_REQUEST = "400";
    public static final String HTTP_STATUS_CODE_BAD_REQUEST_DESCRIPTION = "Malformed request parameters.";
    public static final String HTTP_STATUS_CODE_NOT_FOUND = "404";
    public static final String HTTP_STATUS_CODE_NOT_FOUND_DESCRIPTION =
            "The requested resource or data was not found in BSC or a system BSC integrates with.";
    public static final String HTTP_STATUS_CODE_CONFLICT = "409";
    public static final String HTTP_STATUS_CODE_CONFLICT_DESCRIPTION =
            "The requested operation could not be completed due to a conflict with the current state of the resource.";
    public static final String HTTP_STATUS_PRECONDITION_FAILED = "412";
    public static final String HTTP_STATUS_PRECONDITION_FAILED_DESCRIPTION =
            "The requested operation could not be completed due to a missing or wrong etag for the resource.";
    public static final String HTTP_STATUS_CODE_UNPROCESSABLE_CONTENT = "422";
    public static final String HTTP_STATUS_CODE_UNPROCESSABLE_CONTENT_DESCRIPTION = "The request was well-formed but was unable to be followed due to semantic errors.";
    public static final String HTTP_STATUS_CODE_INTERNAL_SERVER_ERROR = "500";
    public static final String HTTP_STATUS_CODE_INTERNAL_SERVER_ERROR_DESCRIPTION = "Internal server error.";

    // OpenAPI group and controller names
    public static final String GROUP_USERS = "Root data - Users";
    public static final String GROUP_ROOT_DATA = "Root data - others";
    public static final String GROUP_ORDERS = "Orders";
    public static final String GROUP_ACTION_LOGS = "Action Logs";






    /**
     * General OpenAPI UI configuration
     *
     * @return OpenAPI configuration
     */
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title(getClass().getPackage().getImplementationTitle())
                        .version(getClass().getPackage().getImplementationVersion())
                        .description("<BSCC Endpoints>")
                        .contact(new Contact().name("BSCC-Team").email("plus_team_bscc_intern@abatplus.de"))
                )
                .tags(List.of(
                        new Tag().name(GROUP_USERS),
                        new Tag().name(GROUP_ROOT_DATA),
                        new Tag().name(GROUP_ORDERS),
                        new Tag().name(GROUP_ACTION_LOGS)
                ));
    }

}
