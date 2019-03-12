package org.moita.app.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("production")
public class ContextProductionService implements ContextService {

    @Override
    public String getContext() {
        return "Production context";
    }
}
