package dev.arydalex.ApiRegioes.user.controller;

import dev.arydalex.ApiRegioes.user.models.EditRequest;
import dev.arydalex.ApiRegioes.user.models.UserModel;
import dev.arydalex.ApiRegioes.user.models.UserRequest;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

@RestController
public class UserController {

    Map<String, UserModel> userMap = new HashMap<>();

    @GetMapping("/login")
    public String login(@RequestParam String email, String password) {
        System.out.printf("UserName is %s and password is %s", email, password);

        UserModel userModel = userMap.get(email);

        if(userModel != null)
        {
            if(email.equals(userModel.getEmail()) && password.equals(userModel.getPassword()))
            {
                userModel.setLogged(true);
                userModel.setToken(UUID.randomUUID().toString());
                return userModel.getToken();
            }
            else return "";
        }
        else return "";
    }

    @PostMapping("/register")
    public String register(@RequestBody UserRequest userRequest)
    {
        ModelMapper modelMapper = new ModelMapper();
        UserModel userModel = modelMapper.map(userRequest, UserModel.class);
        userModel.setUserId(UUID.randomUUID().toString());
        userModel.setLogged(true);
        userModel.setToken(UUID.randomUUID().toString());

        userMap.put(userModel.getEmail(), userModel);

        return userModel.getToken();
    }

    @PutMapping("/edit/{token}")
    public String edit(@RequestBody EditRequest editRequest, @PathVariable String token)
    {
        Set<String> strings = userMap.keySet();

        strings.forEach(key -> {

            UserModel userModel = userMap.get(key);
            if(userModel.getToken().equals(token))
            {
                userModel.setUserName(editRequest.getUserName());
            }
        });

        return "OK";
    }

}
