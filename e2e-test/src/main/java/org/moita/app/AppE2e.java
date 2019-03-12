package org.moita.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@ComponentScan("org.moita")
@PropertySource("file:app/src/main/resources/application.properties")
public class AppE2e
{
    private App app;

    @Autowired
    public AppE2e(App app)
    {
        this.app = app;
    }

    public static void main(String[] args)
    {
        SpringApplication.run(AppE2e.class, args);
    }
}
