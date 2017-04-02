
public class user {
    String username;
    String password;

    public user(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    
    public boolean equals(user User)
    {
        if (this.username == User.username && this.password == User.password)
            return true;
        
        return false;
                
    }
    }

