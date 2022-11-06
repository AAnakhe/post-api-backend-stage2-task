package com.ajavacode.backendstage2task.api;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ModelRequest {
    private Operator operation_type;
    private  int x;
    private  int y;

}
