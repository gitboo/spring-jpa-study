package boo.study.jpa;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;


/**
 *
 */


@Component
public class PostListener {

    @EventListener
    public void onApplicationEvent(PostPublishedEvent event) {

        System.out.println(event.getPost().toString());
            }
}

