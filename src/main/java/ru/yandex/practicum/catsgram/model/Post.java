package ru.yandex.practicum.catsgram.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Data
@EqualsAndHashCode(of = {"id"})
public class Post {
    // уникальный идентификатор сообщения
    private Long id;
    // автор сообщения
    private long authorId;
    // описания сообщения
    private String description;
    // дата и время создания сообщения
    private Instant postDate;
}
