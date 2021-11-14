package db;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AuthorizationTest {
    private Authorization authorization;
    private Авторизація authorizationLegacy;
    private DataBase db;

    @Test
    public void authorize() {
        authorization = new Authorization();
        authorizationLegacy = new Авторизація();
        db = new DataBase();
        assertEquals(
                authorization.authorize(db),
                authorizationLegacy.авторизуватися(db)
        );
    }
}