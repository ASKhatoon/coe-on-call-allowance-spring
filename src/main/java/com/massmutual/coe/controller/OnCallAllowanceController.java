package com.massmutual.coe.controller;

import com.massmutual.coe.service.OnCallAllowanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class OnCallAllowanceController {

    @Autowired
    OnCallAllowanceService onCallAllowanceService;

    @GetMapping(value = "/associates", produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<Map<String, Object>> getAssociate(){
        return onCallAllowanceService.getAssociate();
    }
}
