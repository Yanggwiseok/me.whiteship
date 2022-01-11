package me.whiteship.demoSpringmvc;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class EventService {
//    public List<Event> getEvents(){
//        Event event1 = Event.builder()
//                .name("스프링 웹 MVC 스터디")
//                .limitOfEnrollment(5)
//                .startDateTime(LocalDateTime.of(2019, 1, 10,10, 0))
//                .endDateTime(LocalDateTime.of(2019, 1, 10,10, 0));
//    }
    public List<Event> getEvents(){
        Event
                event1 = Event.builder()
                .name("스프링 웹 MVC 스터디1")
                .startDateTime(LocalDateTime.of(2020, 1, 17,10, 0))
                .endDateTime(LocalDateTime.of(2020, 1, 17,10, 0)).build();

        Event event2 = Event.builder()
                .name("스프링 웹 MVC 스터디2")
                .startDateTime(LocalDateTime.of(2019, 1, 17,10, 0))
                .endDateTime(LocalDateTime.of(2019, 1, 17,10, 0)).build();

        return  List.of(event1, event2);
    }
}
