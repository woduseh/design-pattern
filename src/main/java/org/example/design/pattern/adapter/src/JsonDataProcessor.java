package org.example.design.pattern.adapter.src;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JsonDataProcessor {
    public void processJson(String json) {
        log.info("Processing JSON: {}", json);
    }
}
