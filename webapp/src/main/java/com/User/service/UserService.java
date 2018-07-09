package java.com.User.service;
import java.com.User.entity.User;

public interface UserService {

    void registerUser(User user);
    void resetPwd(User user);
    void loginIn(User user);
}
