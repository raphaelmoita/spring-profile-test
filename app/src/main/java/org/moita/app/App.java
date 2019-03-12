package org.moita.app;

import org.moita.app.service.ContextService;
import org.moita.app.service.RepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@SpringBootApplication
@Component
public class App
{
    private ContextService contextService;
    private RepositoryService repositoryService;

    @Value("${app.id}")
    public String appId;

    @Autowired
    public App(ContextService contextService, RepositoryService repositoryService)
    {
        this.contextService = contextService;
        this.repositoryService = repositoryService;
    }

    @PostConstruct
    public void execute()
    {
        System.out.println("App-ID = " + appId + " Context = " + contextService.getContext() + " - " + repositoryService.getRepositoryId());
    }

    public static void main(String[] args)
    {
        SpringApplication.run(App.class, args);
    }
}
