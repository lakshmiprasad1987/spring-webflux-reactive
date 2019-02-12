package com.bp.reactive.repository;

import reactor.core.publisher.Flux;
import com.bp.reactive.model.Comment;

public interface CommentRepository {
    Flux<Comment> findAll();
}