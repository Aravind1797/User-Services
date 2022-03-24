package com.example.demo.modal;


import com.sun.istack.internal.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection="comment_db")
@NoArgsConstructor
@AllArgsConstructor

public class User {

    @Id

    @NotNull
    private String firstname;
    private String middleName;
    @NotBlanck
    private String lastName;
    private String phoneNumber;
    private String gender;
    private String employeeNumber;
    private String maritalStatus;
    private Date dateOfBirth;
    private String bloodGroup;
     private String email;
     private String password;

    public String getFirstName() {
        return getFirstName();
    }

    public String getUserId() {
        return getUserId();
    }

    public String getEmployeeNumber() {
        return getEmployeeNumber();
    }

    public String getLastName() {
        return getUserId();
    }

    public String getBloodGroup() {
        return  getBloodGroup();
    }
}
