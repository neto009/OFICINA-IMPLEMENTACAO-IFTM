package br.edu.iftm.agent.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmbeddingService {

    public List<float[]> embed(List<String> text) {
        return List.of();
    }
}
