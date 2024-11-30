package com.hexaware.gtt.lms.servicesImpl;

import java.util.List;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.gtt.lms.dto.UserDto;
import com.hexaware.gtt.lms.entities.Partner;
import com.hexaware.gtt.lms.entities.Tiers;
import com.hexaware.gtt.lms.entities.Users;
import com.hexaware.gtt.lms.repositories.PartnerRepository;
import com.hexaware.gtt.lms.repositories.TiersRepository;
import com.hexaware.gtt.lms.repositories.UserRepository;
import com.hexaware.gtt.lms.services.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private TiersRepository tiersRepository;
	
	@Autowired
	private PartnerRepository partnerRepository;
	

	@Override
	public Users createUsers(UserDto userDto) {
		Users users=modelMapper.map(userDto, Users.class);
		Tiers tiers=tiersRepository.findById(userDto.getTierId()).get();
		users.setTiers(tiers);
		Partner partners=partnerRepository.findById(userDto.getPartnerId()).get();
		users.setPartner(partners);
		return userRepository.save(users);
	}

	@Override
	public List<Users> getUsers() {
		List<Users> users=userRepository.findAll();
		return users;
	}

	@Override
	public Users getUserById(UUID uId) {
		Users users=userRepository.findById(uId).get();
		if(users!=null) {
			return users;
		}
		else {
			return null;
		}
	}

	@Override
	public Users updateUser(UserDto userDto,UUID uId) {
		Users users=userRepository.findById(uId).get();
		if(users!=null) {
			users.setUserId(userDto.getUserId());
			users.setTotalPoints(userDto.getTotalPoints());
			users.setExpiry(userDto.getExpiry());
			users.setPartner(partnerRepository.findById(userDto.getPartnerId()).get());
			users.setTiers(tiersRepository.findById(userDto.getTierId()).get());
			return users;
		}
		
		else {
			return null;
		}
	}

	@Override
	public String deleteUser(UUID uId) {
		Users users=userRepository.findById(uId).get();
		if(users!=null) {
			this.userRepository.delete(users);
				return " user "+uId+"deleted successfully" ;
			}
			else {
				return " user "+uId + "doesn't exist" ;
			}
		}
	}
   

