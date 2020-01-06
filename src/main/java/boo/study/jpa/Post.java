package boo.study.jpa;

import lombok.Data;
import org.springframework.data.domain.AbstractAggregateRoot;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
@Data
public class Post extends AbstractAggregateRoot<Post> {

    @Id
    @GeneratedValue
    private Long id;
    private String author;
    @Lob
    private String content;

    public Post publish() {
        this.registerEvent(new PostPublishedEvent(this));
        return this;
    }
}
