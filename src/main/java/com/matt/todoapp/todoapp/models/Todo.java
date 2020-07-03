package com.matt.todoapp.todoapp.models;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "todos")
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String userName;


    private String description;
    private Date targetDate;

    public Todo() {
        super();
    }

    public Todo(String userName, String description, Date targetDate, boolean isDone) {
        this.userName = userName;
        this.description = description;
        this.targetDate = targetDate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(Date targetDate) {
        this.targetDate = targetDate;
    }
}
