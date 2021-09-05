package net.frank.api.kafka;

import lombok.RequiredArgsConstructor;
import net.frank.api.kafka.domain.Quiz;
import net.frank.api.kafka.service.QuizService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/kafka")
public class ProducerController {
    private final ProducerComponent producer;
    private final QuizService quizService;
    @GetMapping()
    public String kafka(){
        return "Hello Kafka";
    }

    @PostMapping
    public String sendMessage(@RequestParam("message") String message){
        System.out.println("############ sendMessage 진입 ############");
        this.producer.sendMessage(message);
        return "Kafka Successfully";
    }

    @GetMapping("/quizzes")
    public List<Quiz> getQuizzes(){
        return quizService.getQuizzes();
    }
}
