package net.frank.api.kafka.service;

import net.frank.api.kafka.domain.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserService {
    Mono<User> save(User entity);
    Mono<User> findById(String id);
    Flux<User> findAll();
    Mono<Void> deleteById(String id);

}
