package SpringMvc_applicatio.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jackrutorial.dao.UserDao;
import com.jackrutorial.model.User;
public class UserServicer implements UserService {
	UserDao userDao;
	 public void setUserDao(UserDao userDao) {
		  this.userDao = userDao;
		 }

		 public List listAllUsers() {
		  return userDao.listAllUsers();
		 }

		 public void addUser(User user) {
		  userDao.addUser(user);
		 }

		 public void updateUser(User user) {
		  userDao.updateUser(user);
		 }

		 public void deleteUser(int id) {
		  userDao.deleteUser(id);
		 }

		 public User findUserById(int id) {
		  return userDao.findUserById(id);
		 }

		}
}
