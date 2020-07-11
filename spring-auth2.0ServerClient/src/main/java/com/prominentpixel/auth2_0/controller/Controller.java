package com.prominentpixel.auth2_0.controller;

import com.prominentpixel.auth2_0.model.Test;
import com.prominentpixel.auth2_0.service.TestService;
import com.prominentpixel.auth2_0.util.GenericResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private TestService testService;

    @GetMapping(value = "test/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public GenericResponse getById(@PathVariable(value = "id") Long id) {
        GenericResponse genericResponse = new GenericResponse();
        try {
            Test test = testService.getId(id);
            if (test != null) {
                genericResponse.setData(test);
                genericResponse.setStatus(true);
            } else {
                genericResponse.setMessage("Record Not found");
                genericResponse.setData(null);
                genericResponse.setStatus(false);
            }
        } catch (Exception e) {
            genericResponse.setMessage(e.getMessage());
            genericResponse.setStatus(false);
        }
        return genericResponse;
    }
}
