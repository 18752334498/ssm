package com.yucong.service;

import java.util.List;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yucong.client.UserClient;
import com.yucong.model.User;

@Service
@WebService(endpointInterface = "com.yucong.client.UserClient")
public class UserService {

    @Autowired
    private UserClient userClient;

	@Transactional
    public List<User> getAllUsers() {
        return userClient.getAllUsers();
    }
}
