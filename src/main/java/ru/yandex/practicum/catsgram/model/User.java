package ru.yandex.practicum.catsgram.model;

import lombok.*;

import java.time.Instant;

@Data
@AllArgsConstructor
@EqualsAndHashCode(of = {"email"})
public class User {
    // уникальный идентификатор пользователя
    private final Long id;
    // имя
    private String username;
    // почта
    private String email;
    // пароль
    private String password;
    // дата и время регистрации
    private Instant registrationDate;
}
