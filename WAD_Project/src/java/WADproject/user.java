package WADproject;


public class user {
    String username;
    String password;
    String pos;

    public user(String username, String password, String pos) {
        this.username = username;
        this.password = password;
        this.pos = pos;
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

    public String getPos() {
        return pos;
    }
    
    
    }

