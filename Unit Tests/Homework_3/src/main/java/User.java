
public class User {

    String name;
    String password;
    Boolean isAdmin;
    Boolean isAuthenticate = false;

    public User(String name, String password, boolean isAdmin) {
        this.name = name;
        this.password = password;
        this.isAdmin = isAdmin;

    }

    public boolean authenticate(String name, String password) {
        return this.name.equals(name) && this.password.equals(password);
    }
}

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (!name.equals(user.name)) return false;
        if (!password.equals(user.password)) return false;
        return Objects.equals(isAdmin, user.isAdmin);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + password.hashCode();
        return result;*/

