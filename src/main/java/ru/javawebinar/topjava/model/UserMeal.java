package ru.javawebinar.topjava.model;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class UserMeal {
    private final LocalDateTime dateTime;
    private final String description;
    private final int calories;

    public UserMeal(LocalDateTime dateTime, String description, int calories) {
        this.dateTime = dateTime;
        this.description = description;
        this.calories = calories;
    }
}
