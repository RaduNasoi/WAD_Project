package WADproject;


public class user {
    String username;
    String password;
<<<<<<< HEAD
    String pos;

    public user(String username, String password, String pos) {
        this.username = username;
        this.password = password;
        this.pos = pos;
=======

    public user(String username, String password) {
        this.username = username;
        this.password = password;
>>>>>>> 60ec931fe0292a9faa61ef4c99663e8ddeaf9743
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
<<<<<<< HEAD

    public String getPos() {
        return pos;
    }
    
    
=======
>>>>>>> 60ec931fe0292a9faa61ef4c99663e8ddeaf9743
    }

