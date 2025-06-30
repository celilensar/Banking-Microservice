package com.celilensar.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
@Schema(
        name = "ResponseDto",
        description = "ResponseDto class used to send response to the user"
)
public class ResponseDto
{
    @Schema(
            description = "Status code of the response",
            example = "200"
    )
    private String statusCode;
    @Schema(
            description = "Status message of the response",
            example = "Request Processed Successful"
    )
    private String statusMsg;

}
