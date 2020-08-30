package com.hg.fsd.userservice.service;


import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

import com.hg.fsd.userservice.dao.UserDao;
import com.hg.fsd.userservice.dtos.UserRequestModel;
import com.hg.fsd.userservice.dtos.UserResponseModel;
import com.hg.fsd.userservice.model.User;

@Service
public class UserServiceImpl implements UserService {
	
	 	private UserDao userDAO;
	    private ModelMapper modelMapper;

	    public UserServiceImpl(UserDao userDAO, ModelMapper modelMapper) {
	        this.userDAO = userDAO;
	        this.modelMapper = modelMapper;
	    }

	    @Override
	    public UserResponseModel addUser(UserRequestModel userRequestModel) {
	        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
	        User user = modelMapper.map(userRequestModel,User.class);
	        userDAO.save(user);
	        return modelMapper.map(user,UserResponseModel.class);
	    }

	    @Override
	    public UserResponseModel updateUser(UserRequestModel userRequestModel) {
	        userDAO.save(modelMapper.map(userRequestModel, User.class));
	        Optional<User> optionalUser = userDAO.findById(userRequestModel.getId());
	        User user = optionalUser.get();
	        return modelMapper.map(user, UserResponseModel.class);
	    }

		

}
