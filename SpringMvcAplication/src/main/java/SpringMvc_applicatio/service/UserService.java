package SpringMvc_applicatio.service;

import java.util.List;

import SpringMvcAplication.dao.User;

public interface UserService {
	public List listAllUsers();
	 
	 public void addUser(User user);
	 
	 public void updateUser(User user);
	 
	 public void deleteUser(int id);
	 
	 public User findUserById(int id);
}