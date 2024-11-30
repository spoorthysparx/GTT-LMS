package com.hexaware.gtt.lms.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.gtt.lms.dto.OffersDto;
import com.hexaware.gtt.lms.dto.OffersResponseDto;
import com.hexaware.gtt.lms.dto.UserDto;
import com.hexaware.gtt.lms.dto.UserResponseDto;
import com.hexaware.gtt.lms.entities.Offers;
import com.hexaware.gtt.lms.entities.Users;
import com.hexaware.gtt.lms.services.UserService;

@RestController
@RequestMapping("api/v1/lms/users")
public class UsersController {
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/createUser")
	public ResponseEntity<UserResponseDto> createUser(@RequestBody UserDto userDto){
		
	    Users user=userService.createUsers(userDto);
	    UserResponseDto userResponseDto=modelMapper.map(user, UserResponseDto.class);
	    return ResponseEntity.ok(userResponseDto);
	    
	}
	
	@GetMapping("/getUsers")
	public ResponseEntity<List<UserResponseDto>> getUsers(){
		List<Users> userList=userService.getUsers();
		List<UserResponseDto> userResponseDtoList=new ArrayList<>();
		for(Users user:userList) {
			UserResponseDto userResponseDto=modelMapper.map(user, UserResponseDto.class);
			userResponseDtoList.add(userResponseDto);
		}
		return ResponseEntity.ok(userResponseDtoList);
	}

	@GetMapping("/getUserById")
	public ResponseEntity<UserResponseDto> getUserById(@RequestParam("uId") UUID uid){
		Users user = this.userService.getUserById(uid);
		UserResponseDto userResponseDto= this.modelMapper.map(user,UserResponseDto.class);
		return ResponseEntity.ok(userResponseDto);
	}
	
	@PutMapping("/updateUser")
   public ResponseEntity<UserResponseDto> updateUsers(@RequestBody UserDto usersDto,@RequestParam("uId") UUID u_id) {
		
		Users user=this.userService.updateUser(usersDto,u_id);
		UserResponseDto userResponseDto= this.modelMapper.map(user,UserResponseDto.class);
		return ResponseEntity.ok(userResponseDto);
	}
		
	@DeleteMapping("/deleteUsers")
	public ResponseEntity<String> deleteUser(@RequestParam("uId") UUID u_id) {
		String s = this.userService.deleteUser(u_id);
		return ResponseEntity.ok(s);
	}
	

}
