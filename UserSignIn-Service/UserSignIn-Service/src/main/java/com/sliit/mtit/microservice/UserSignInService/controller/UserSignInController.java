package com.sliit.mtit.microservice.UserSignInService.controller;


import com.sliit.mtit.microservice.UserSignInService.dto.UserSignInRequest;
import com.sliit.mtit.microservice.UserSignInService.dto.UserSignInResponse;
import com.sliit.mtit.microservice.UserSignInService.service.UserSignInServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/signIn")
public class UserSignInController {

    @Autowired
    private UserSignInServiceImpl signInService;


    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody
    UserSignInResponse userSignIn(@RequestBody UserSignInRequest request) {


        System.out.println("User Sign In Details : " + request);
        return signInService.userSignIn(request);

    }
}
