package db;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DataBaseTest {
    private DataBase db;
    public БазаДаних dbLegacy;

    @Test
    public void getUserData() {
        db = new DataBase();
        dbLegacy = new БазаДаних();
        assertEquals(
                db.getUserData(),
                dbLegacy.отриматиДаніКористувача()
        );
    }

    @Test
    public void getStatisticalData() {
        db = new DataBase();
        dbLegacy = new БазаДаних();
        assertEquals(
                db.getStatisticalData(),
                dbLegacy.отриматиСтатистичніДані()
        );
    }
}