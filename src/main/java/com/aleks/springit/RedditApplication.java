package com.aleks.springit;

import com.aleks.springit.domain.Comment;
import com.aleks.springit.domain.Link;
import com.aleks.springit.repository.CommentRepository;
import com.aleks.springit.repository.LinkRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class RedditApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedditApplication.class, args);
    }

    //@Bean
    CommandLineRunner runner(LinkRepository linkRepository, CommentRepository commentRepository) {
        return args -> {
            Link link = new Link("Getting Started with SB2","https;kok cobaka");
            linkRepository.save(link);
            Comment comment = new Comment("Suck my cock",link);
            commentRepository.save(comment);

            link.addComment(comment);
        };
    }

}
