package com.nf.exception;

import com.nf.vo.ResponseVO;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class SystemExceptionHandler {
    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public ResponseVO handleRuntimeException(){
        ResponseVO responseVO= ResponseVO.newBuilder()
                .code("500")
                .msg("failed")
                .build();

        return responseVO;
    }
}
