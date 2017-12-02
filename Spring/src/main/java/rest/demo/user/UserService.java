package rest.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public List<User> user = new ArrayList<User>();

    public String getCurrentDateAndTime() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }

    public TimeZone getTimeZone() {
        TimeZone tz = TimeZone.getDefault();
        return tz;
    }

    public String getIp() throws UnknownHostException {
        InetAddress inetAddress = InetAddress.getLocalHost();
        String ipAddress = inetAddress.getHostAddress();
        return ipAddress;
    }

    public List<User> getNames(){

        List<User> users = new ArrayList<User>();
        userRepo.findAll().forEach(users::add);
        if (users.isEmpty()) {
            users.add(new User("Anonymous"));
            return users;
        }
        return users;
    }

    public void addName(User user){
        userRepo.save(user);
    }


}