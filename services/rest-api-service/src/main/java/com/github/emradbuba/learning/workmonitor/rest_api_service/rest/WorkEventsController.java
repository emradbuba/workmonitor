package com.github.emradbuba.learning.workmonitor.rest_api_service.rest;

import com.github.emradbuba.learning.workmonitor.rest_api_service.events.WorkEventService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/work")
@Slf4j
@RequiredArgsConstructor
public class WorkEventsController {

    private final WorkEventService workEventService;

    @PostMapping("/event/{event_string}")
    public void startWork(@PathVariable("event_string") String eventString) {

       log.info("Received POST with event string --> <{}>", eventString);

       workEventService.processEventString(eventString);
    }
}
