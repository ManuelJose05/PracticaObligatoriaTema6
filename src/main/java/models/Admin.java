package models;

import java.io.Serializable;

//ADMIN IS A CLASS WHICH HAS GOT TOTAL CONTROL OFF THE SOFTWARE
public class Admin implements Serializable {
    private int id;
    private String name;
    private String password;
    private String email;

    //CONSTRUCTOR
    public Admin(int id, String name, String password, String email) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
    }

    //GETTER AND SETTER

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //METHOD WHICH CHECK THE LOGIN OF THE ADMIN
    public boolean login(String email, String password){
        return this.email.equals(email) && this.password.equals(password);
    }

    //PRINT ADMIN

    @Override
    public String toString() {
        return "Id = " + id +
                "\nName = " + name +
                "\nPassword = " + password +
                "\nEmail = " + email +
                "\n=================";
    }
}
