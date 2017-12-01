package RestService;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import javax.persistence.Entity;

@Entity
public class User {

    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    Date date = new Date();

    private String name;

    User(){}

    User(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrentDateAndTime() {
        return dateFormat.format(date);
    }

    public TimeZone getTimeZone() {
        TimeZone tz = TimeZone.getDefault();
        return tz;
    }

    String getIp() throws UnknownHostException {
        InetAddress inetAddress = InetAddress.getLocalHost();
        String str = inetAddress.getHostAddress();
        return str;
    }

}
