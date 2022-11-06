package com.ajavacode.backendstage2task.api;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ModelResponse {

    public ModelResponse(String slackUsername, Operator operation_type,  Integer result) {
        this.slackUsername = slackUsername;
        this.operation_type = operation_type;
        this.result = result;
    }

    private String slackUsername;
    private Operator operation_type;
    private Integer result;
}