package com.jlg.library.domain.user;


import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@AllArgsConstructor
@Getter
@Document
public class User {

    @Id
    private UUID id;

    private String email;
}
