package db;

public class Authorization extends Авторизація {
    private Авторизація authorization;

    public Authorization() {
        this.authorization = new Авторизація();
    }

    public boolean authorize(DataBase db) {
        db.getUserData();
        return true;
    }
}
