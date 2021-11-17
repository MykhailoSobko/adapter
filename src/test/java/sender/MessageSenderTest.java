package sender;

import facebook.FacebookUser;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import twitter.TwitterUser;

import java.util.Date;

public class MessageSenderTest {
    private MessageSender messageSender;
    private FacebookUser facebookUser;
    private TwitterUser twitterUser;

    @Test
    public void send() {
        messageSender = new MessageSender();
        facebookUser = new FacebookUser(
                "example@mail.com",
                "Country",
                new Date((long) (new Date().getTime() - 120*60*1e3))
        );
        twitterUser = new TwitterUser(
                "example@mail.com",
                "Country",
                new Date((long) (new Date().getTime() - 120*60*1e3))
        );
        messageSender.send("example text", facebookUser, "Country");
        messageSender.send("example text", twitterUser, "Country");
    }
}