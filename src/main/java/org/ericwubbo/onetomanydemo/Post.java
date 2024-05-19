package org.ericwubbo.onetomanydemo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Getter
public class Post {
    @Id
    @GeneratedValue
    private Long id;

    private Author author;

    private String text;

    public Post(Author author, String text) {
        this.author = author;
        this.text = text;
    }
}
