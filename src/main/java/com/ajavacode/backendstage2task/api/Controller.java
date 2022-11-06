package com.ajavacode.backendstage2task.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    OperatorService service;

    @PostMapping(path = "/", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ModelResponse> postOperation(@RequestBody ModelRequest request) {
        Integer result = service.checkType(request);

        return ResponseEntity.ok(new ModelResponse("Ajava",  request.getOperation_type(), result));
    }

    }

