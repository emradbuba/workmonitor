package com.github.emradbuba.learning.workmonitor.rest_api_service.events;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class WorkEventService {

    public void processEventString(String eventString) {
        log.info("Processing event string: {}", eventString);
        String normlizedEventString = Optional.ofNullable(eventString).map(String::toUpperCase).map(String::strip).orElse("EMPTY_STRING");

        log.info("Normalized to: {}", normlizedEventString);
    }
}
