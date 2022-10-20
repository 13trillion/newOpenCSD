package org.opencsd.model;


import org.springframework.data.mongodb.core.mapping.Document;

@Document("client")
public class Client extends BaseModel{
    private String email;
    private String company;
    private String name;

    public Client(long id, String email, String company, String name) {
        this.id = id;
        this.email = email;
        this.company = company;
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
