package org.moita.app.service;

import org.springframework.stereotype.Service;

@Service
public class SimpleRepositoryService implements RepositoryService {

    @Override
    public String getRepositoryId() {
        return "REPO-123";
    }
}
