package RestService;

import org.springframework.stereotype.Service;

import java.net.UnknownHostException;
import java.util.*;

@Service
public class UserService {

    User user1 = new User();

    String getTime(){
        return user1.getCurrentDateAndTime();
    }

    TimeZone getTimeZone(){
        return user1.getTimeZone();
    }

    String getIp() throws UnknownHostException {
        return user1.getIp();
    }

    void addName(User newName){
        user1.setName(name);
    }

    String getName(){
        return user1.getName();
    }




}
