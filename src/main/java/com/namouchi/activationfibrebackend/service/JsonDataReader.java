package com.namouchi.activationfibrebackend.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

@Service
public class JsonDataReader {

    private final ObjectMapper objectMapper;

    public JsonDataReader(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public Map<String, Object> readData(InputStream inputStream) throws IOException {
        return objectMapper.readValue(inputStream, new TypeReference<Map<String, Object>>() {});
    }
}
