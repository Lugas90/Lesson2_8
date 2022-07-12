package com.example.lesson2_8.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

    @ResponseStatus(HttpStatus.EXPECTATION_FAILED)
    public class EmployeeStorageIsFullException extends RuntimeException {
        public EmployeeStorageIsFullException() {
            super();
        }
    }
