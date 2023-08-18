package com.mtbp.business.service;

import com.mtbp.data.entity.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
