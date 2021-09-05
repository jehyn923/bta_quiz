package net.frank.api.kafka.service;

import lombok.Builder;
import lombok.RequiredArgsConstructor;
import net.frank.api.kafka.domain.Quiz;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

@Service @RequiredArgsConstructor
public class QuizServiceImpl implements QuizService {
    private final GeneratorService service;

    @Override
    public Quiz creteQuiz() {
        int factorA = service.randomFactor();
        int factorB = service.randomFactor();
        Quiz quiz = new Quiz(factorA, factorB);
        return quiz;
    }

    @Override
    public List<Quiz> getQuizzes() {
        List<Quiz> quizzes = new ArrayList<>();
        quizzes.add(creteQuiz());
        quizzes.add(creteQuiz());
        quizzes.add(creteQuiz());
        quizzes.add(creteQuiz());
        quizzes.add(creteQuiz());
        return quizzes;
    }


}