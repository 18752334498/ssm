package com.yucong.client;
import com.yucong.model.User;

import javax.jws.WebService;
import java.util.List;

@WebService
public interface UserClient {
    List<User> getAllUsers();
}
