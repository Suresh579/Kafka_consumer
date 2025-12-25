package kafka.producer.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class User {
    private  String firstName;
    private String lastName;
    private  Integer userId;
    private LocalDateTime loginDate;
}
