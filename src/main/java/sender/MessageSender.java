package sender;

import facebook.FacebookUser;
import twitter.TwitterUser;

public class MessageSender {
    public void send(String text, Object user, String country) {
        if (user instanceof FacebookUser) {

        } if (user instanceof TwitterUser) {
        }
    }
}
