package br.edu.iftm.agent.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class FAQService {

    private static final String SYSTEM_PROMPT = """
        Com base nas seguintes informações, responda de forma natural e humanizada à pergunta. Seja cordial, profissional e forneça uma resposta completa baseada apenas nas informações fornecidas.
        """;

    public String ask(String question, float distance) {
        return "";
    }

    private String generateAnswer(String question, String context) {
        return "";
    }
}
