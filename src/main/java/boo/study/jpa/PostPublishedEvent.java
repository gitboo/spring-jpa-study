package boo.study.jpa;

import lombok.Data;
import org.springframework.context.ApplicationEvent;


@Data
public class PostPublishedEvent extends ApplicationEvent {

    private final Post post;

    public PostPublishedEvent(Object source) {
        super(source);
        this.post = (Post) source;
    }
}
