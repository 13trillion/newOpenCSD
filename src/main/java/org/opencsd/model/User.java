//Imports
package org.opencsd.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("users")
public class User extends BaseModel{
//    @Id
//    private long id;

    private String name;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String username;
    private String email;
    private String password;
    private String accountStatus;

    private String preferences;
    private String gender;
    private String birthday;
    private String lives;


    public User(long id, String name, String username, String email, String password){
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public String getPreferences() {
        return preferences;
    }

    public String getGender() {
        return gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getLives() {
        return lives;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public void setPreferences(String preferences) {
        this.preferences = preferences;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setLives(String lives) {
        this.lives = lives;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", accountStatus='" + accountStatus + '\'' +
                '}';
    }



}