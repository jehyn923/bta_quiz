package net.frank.api.kafka.service;


import net.frank.api.kafka.domain.Quiz;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface QuizService {
    Quiz creteQuiz();
    List<Quiz> getQuizzes();
}