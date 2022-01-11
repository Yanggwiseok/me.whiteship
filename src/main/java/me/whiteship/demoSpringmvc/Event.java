package me.whiteship.demoSpringmvc;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor @AllArgsConstructor
public class Event {
    private String name;
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;
}
