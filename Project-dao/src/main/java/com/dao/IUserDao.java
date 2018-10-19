package com.dao;

import com.beans.User.UserVO;
import com.entity.UserEntity;

public interface IUserDao {
    public UserEntity queryByUserName(String username);
}
