package org.ericwubbo.onetomanydemo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PostController {
    private final PostRepository postRepository;

    @GetMapping
    public List<Post> getAll(@RequestParam(required = false) String author) {
        return author == null ? postRepository.findAll() : postRepository.findByAuthorName(author);
    }
}
