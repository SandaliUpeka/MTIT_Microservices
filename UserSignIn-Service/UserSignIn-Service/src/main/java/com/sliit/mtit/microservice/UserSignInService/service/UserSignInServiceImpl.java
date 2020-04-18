package com.sliit.mtit.microservice.UserSignInService.service;

import com.sliit.mtit.microservice.UserSignInService.dto.UserSignInRequest;
import com.sliit.mtit.microservice.UserSignInService.dto.UserSignInResponse;
import com.sliit.mtit.microservice.UserSignInService.dto.UserSignUpCreationRequest;
import com.sliit.mtit.microservice.UserSignInService.dto.UserSignUpCreationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Service
public class UserSignInServiceImpl {

    @Autowired
    private RestTemplate restTemplate;

    public UserSignInResponse userSignIn(UserSignInRequest userSignInRequest){

        UserSignUpCreationRequest userSignUpCreationRequest = new UserSignUpCreationRequest();

        userSignUpCreationRequest.setUserName(userSignInRequest.getUserName());
        userSignUpCreationRequest.setEmail(userSignInRequest.getEmail());
        userSignUpCreationRequest.setPassword(userSignInRequest.getPassword());



        ResponseEntity <UserSignUpCreationResponse> userSignUpCreationResponse =
                restTemplate.postForEntity("http://localhost:8080/signUp", userSignUpCreationRequest,
                        UserSignUpCreationResponse.class);

        UserSignInResponse userSignInResponse = new UserSignInResponse();

        userSignInResponse.setId(UUID.randomUUID().toString());
        userSignInResponse.setUserId(userSignUpCreationResponse.getBody().getUserId());
        userSignInResponse.setMessage("Welcome to Cargills Food City Online Shopping Store");

        return userSignInResponse;

    }


    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();
    }
}
