package com.cibertec.utils;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Código no existe")
public class NotFoundException extends RuntimeException{

}
