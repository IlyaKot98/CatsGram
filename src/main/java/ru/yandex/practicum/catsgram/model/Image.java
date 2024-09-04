package ru.yandex.practicum.catsgram.model;

import lombok.*;

@Data
@AllArgsConstructor
@EqualsAndHashCode(of = {"id"})
public class Image {
    // уникальный идентификатор изображения
    private final Long id;
    // уникальный идентификатор поста, к которому прикреплено изображение
    private final long postId;
    // имя файла, который содержит изображение
    private String originalFileName;
    // путь, по которому изображение сохранено
    private String filePath;
}
