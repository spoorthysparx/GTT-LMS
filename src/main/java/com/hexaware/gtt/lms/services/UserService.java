package com.hexaware.gtt.lms.services;

import java.util.List;
import java.util.UUID;

import com.hexaware.gtt.lms.dto.UserDto;
import com.hexaware.gtt.lms.entities.Users;

public interface UserService {
	
	public Users createUsers(UserDto userDto);
	public List<Users> getUsers();
	public Users getUserById(UUID uId);
    public Users updateUser(UserDto userDto,UUID uId);
    public String deleteUser(UUID uId);
}
