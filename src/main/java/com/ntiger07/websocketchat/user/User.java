package com.ntiger07.websocketchat.user;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document
public class User {
    @Id
    private String nickName;
    private String fullname;
    private Status status;
}
