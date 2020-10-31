package org.revieweat.junngo.service;

import lombok.RequiredArgsConstructor;
import org.revieweat.junngo.domain.posts.PostsRepository;
import org.revieweat.junngo.web.dto.PostsSaveRequestDto;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService {
    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto requestDto) {
        return postsRepository.save(requestDto.toEntity()).getId();
    }
}
