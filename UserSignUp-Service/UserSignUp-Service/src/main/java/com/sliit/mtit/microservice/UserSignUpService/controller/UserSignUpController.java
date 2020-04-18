package com.sliit.mtit.microservice.UserSignUpService.controller;

import com.sliit.mtit.microservice.UserSignUpService.dto.UserSignUpRequest;
import com.sliit.mtit.microservice.UserSignUpService.dto.UserSignUpResponse;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/signUp")
public class UserSignUpController {

    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody
    UserSignUpResponse userSignUp(@RequestBody UserSignUpRequest userRequest) {

        System.out.println("User Sign In Details : " + userRequest);

        UserSignUpResponse userSignUpResponse = new UserSignUpResponse();

        userSignUpResponse.setUserId(UUID.randomUUID().toString());
        userSignUpResponse.setMessage("Successfully Registered the User ");

        return userSignUpResponse;
    }
}