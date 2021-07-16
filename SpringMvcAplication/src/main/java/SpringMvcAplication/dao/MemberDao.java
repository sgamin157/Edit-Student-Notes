package SpringMvcAplication.dao;
import java.util.List;
import com.jackrutorial.model.User;
public interface User.Dao {
	 public List listAllUsers();
	 
	 public void addUser(User user);
	 
	 public void updateUser(User user);
	 
	 public void deleteUser(int id);
	 
	 public User findUserById(int id);
	}


}
