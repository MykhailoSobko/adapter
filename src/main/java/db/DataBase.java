package db;

public class DataBase extends БазаДаних {
    private БазаДаних db;

    public DataBase() {
        this.db = new БазаДаних();
    }

    public String getUserData() {
        return this.db.отриматиДаніКористувача();
    }

    public String getStatisticalData() {
        return this.db.отриматиСтатистичніДані();
    }
}
