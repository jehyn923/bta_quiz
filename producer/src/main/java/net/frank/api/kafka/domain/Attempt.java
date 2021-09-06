package net.frank.api.kafka.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "attempts")
@Data
public class Attempt {
    @Id private String id;
    private String alias;
    private String result;
    private int quizNo;
}
