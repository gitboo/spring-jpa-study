package boo.study.jpa;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;


@SpringBootTest
class JpaApplicationTests {

    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    private PostRepository postRepository;

    @Test
    public void eventPost() {
        Post post = new Post();
        post.setAuthor("test");
        postRepository.save(post.publish());
    }



    @Test
    public void event() {
        Post post = new Post();
        post.setAuthor("sss");
        PostPublishedEvent event = new PostPublishedEvent(post);
        applicationContext.publishEvent(event);
    }
}
