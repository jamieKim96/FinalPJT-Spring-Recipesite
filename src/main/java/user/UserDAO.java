package user;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserDAO {
	
	public List<UserVO> listUser();
	public UserVO checkPw(String user_pw); // result 있다 parameter 있다
	public void insertUser(UserVO vo); // result 없다 parameter 있다
	public void updateUser(UserVO vo);// result 없다 parameter 있다
	public void deleteUser(String user_email, String user_pw);
	public String login(UserVO vo);
}
