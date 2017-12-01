package RestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.net.UnknownHostException;
import java.util.TimeZone;

@RestController
public class Controller {

    @Autowired
    private UserService userService;

    @RequestMapping("/date")
    public String getDate(){
        return userService.getTime();
    }

    @RequestMapping("/timezone")
    public TimeZone getTimeZone(){
        return userService.getTimeZone();
    }

    @RequestMapping("/ip")
    public String getIp() throws UnknownHostException {
        return userService.getIp();
    }

    @RequestMapping(method = RequestMethod.POST, value ="/name")
    public void addName(@RequestBody User newName){
        userService.addName(newName);
    }


}