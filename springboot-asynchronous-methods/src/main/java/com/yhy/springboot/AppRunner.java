package com.yhy.springboot;

import com.yhy.springboot.bean.User;
import com.yhy.springboot.service.GitHubLookupService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;

@Component
public class AppRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(AppRunner.class);

    private final GitHubLookupService gitHubLookupService;

    public AppRunner(GitHubLookupService gitHubLookupService) {
        this.gitHubLookupService = gitHubLookupService;
    }

    @Override
    public void run(String... args) throws Exception {
        // Start the clock
        long start = System.currentTimeMillis();

        // Kick of multiple, asynchronous lookups
        Future<User> page1 = gitHubLookupService.findUser("PivotalSoftware");
        Future<User> page2 = gitHubLookupService.findUser("CloudFoundry");
        Future<User> page3 = gitHubLookupService.findUser("Spring-Projects");

        // Wait until they are all done
        while (!(page1.isDone() && page2.isDone() && page3.isDone())) {
            //10-millisecond pause between each check
            Thread.sleep(10);
        }

        // Print results, including elapsed time
        logger.info("Elapsed time: " + (System.currentTimeMillis() - start));
        logger.info("--> " + page1.get());
        logger.info("--> " + page2.get());
        logger.info("--> " + page3.get());
    }

}