package com.github.toastedflaco.redditclon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class RedditclonApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedditclonApplication.class, args);
    }

}
