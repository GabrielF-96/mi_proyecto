package uml;


public class Database {
    private String driver;
    private String url;
    private String user;
    private String pass;

    public Database() {
        this.driver="com.mysql.jdbc.Driver";
        this.url="jdbc:mysql://localhost:3306/WZX45KJ90";
        this.user="root";
        this.pass="itca123";
    }

    public String getDriver() {
        return driver;
    }

    public String getUrl() {
        return url;
    }

    public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }
    
    
}

