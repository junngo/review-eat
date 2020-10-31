package org.revieweat.junngo.web;

import lombok.RequiredArgsConstructor;
import org.revieweat.junngo.service.PostsService;
import org.revieweat.junngo.web.dto.PostsSaveRequestDto;
import org.revieweat.junngo.web.dto.PostsUpdateRequestDto;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto) {
        return postsService.update(id, requestDto);
    }
}
