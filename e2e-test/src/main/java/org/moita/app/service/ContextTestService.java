package org.moita.app.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("test")
public class ContextTestService implements ContextService {

    @Override
    public String getContext() {
        return "Test context";
    }
}
