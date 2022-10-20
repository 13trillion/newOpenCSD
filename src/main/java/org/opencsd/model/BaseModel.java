package org.opencsd.model;

import org.springframework.data.annotation.Id;

import java.util.List;

public class BaseModel{
    @Id
    public long id;
    public  List<String> attributes;
}



