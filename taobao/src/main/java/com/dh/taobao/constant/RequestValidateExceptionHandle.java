package com.dh.taobao.constant;

import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import java.util.List;
import java.util.Map;


//异常捕获类
/**
 * @author DH
 */
@RestControllerAdvice
public class RequestValidateExceptionHandle {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    public ResponseData methodArgumentNotValidException(MethodArgumentNotValidException e) {
        ResponseData argNotValidMessage = getArgNotValidMessage(e.getBindingResult());
        return argNotValidMessage;
    }
    private ResponseData getArgNotValidMessage(BindingResult bindingResult) {
        if (bindingResult == null) {
            return new SuccessResponseData("");
        }
        StringBuilder stringBuilder = new StringBuilder();

        //多个错误用逗号分隔
        List<ObjectError> allErrorInfos = bindingResult.getAllErrors();
        for (ObjectError error : allErrorInfos) {
            stringBuilder.append(",").append(error.getDefaultMessage());
        }

        //最终把首部的逗号去掉
        return new ErrorResponseData(stringBuilder.toString().substring(1)) ;
    }

    @ExceptionHandler(value = ServiceException.class)
    @ResponseBody
    public ErrorResponseData handle(ServiceException e){
        return new ErrorResponseData(e.getMessage());
    }
}

