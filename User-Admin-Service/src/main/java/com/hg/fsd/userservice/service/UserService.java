package com.hg.fsd.userservice.service;

import com.hg.fsd.userservice.dtos.UserRequestModel;
import com.hg.fsd.userservice.dtos.UserResponseModel;

public interface UserService {

	public UserResponseModel addUser(UserRequestModel userRequestModel);
    public UserResponseModel updateUser(UserRequestModel userRequestModel);
}
