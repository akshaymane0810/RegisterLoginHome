package amproject.services;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import amproject.GetUser;
import amproject.repository.UserRepository;

@Service
@Transactional
public class UserFun {

	private final UserRepository userRepository;
	
	public UserFun(UserRepository userRepository) {
		this.userRepository =  userRepository;
	}
	
	public void myUser(GetUser user) {
		userRepository.save(user);
	}
	
	public List<GetUser> showAllUsers(){
		
		List<GetUser> users = new ArrayList<GetUser>();
		
		for(GetUser user:userRepository.findAll()) {
			users.add(user);
		}
 			 return users;
	}
}
