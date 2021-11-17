package sender;

import facebook.FacebookUser;
import twitter.TwitterUser;

import java.util.Date;

public class MessageSender {
    public void send(String text, Object user, String country) {
        if (user instanceof FacebookUser) {
            if (
                    ((FacebookUser) user).getUserActiveTime().getTime()
                    < new Date().getTime() - 60*60*1e3
                    && ((FacebookUser) user).getUserCountry().equals(country)
            ) {
                System.out.println("Message \"" + text + "\" sent\n");
            }
        }
        if (user instanceof TwitterUser) {
            if (
                    ((TwitterUser) user).getLastActiveTime().getTime()
                            < new Date().getTime() - 60*60*1e3
                            && ((TwitterUser) user).getCountry().equals(country)
            ) {
                System.out.println("Message \"" + text + "\" sent\n");
            }
        }
    }
}
