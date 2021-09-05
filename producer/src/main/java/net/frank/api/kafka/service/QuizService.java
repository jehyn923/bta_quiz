package net.frank.api.kafka.service;


import net.frank.api.kafka.domain.Quiz;
import reactor.core.publisher.Mono;

public interface QuizService {
    Mono<Quiz> creteQuiz();
}