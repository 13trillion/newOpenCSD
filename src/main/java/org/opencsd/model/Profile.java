package org.opencsd.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("profile")
public class Profile {
    private String progress;
    private String rating;
    private String reviews;
    private String following;
    private String creatorfollowed;
    private String timeline;

}
