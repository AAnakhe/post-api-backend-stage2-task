package com.ajavacode.backendstage2task.api;

import org.springframework.stereotype.Service;

@Service
public class OperatorService {

    public Integer checkType(ModelRequest model) {
        Integer result;
        var operation_type = model.getOperation_type();

        if (operation_type.equals(Operator.addition)) {
            Operator operation = Operator.addition;
            result = model.getX() + model.getY();
        }

        else if (operation_type.equals(Operator.subtraction)){
            Operator operation = Operator.subtraction;
            result = model.getX() - model.getY();
        }

        else if (operation_type.equals(Operator.multiplication)) {
            Operator operation = Operator.multiplication;
            result = model.getX() * model.getY();
        }
        else {
            Operator operation = Operator.unknown;
            result = 0;
    }
        return result;


    }
}
