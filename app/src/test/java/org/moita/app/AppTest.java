package org.moita.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Component
public class AppTest
{
    private App app;

    @Autowired
    public AppTest(App app)
    {
        this.app = app;
    }

    public static void main(String[] args)
    {
        SpringApplication.run(AppTest.class, args);
    }
}
