package ai.project.spring_ai.service;

import ai.project.spring_ai.model.*;

public interface OpenAIService {
    String getAnswer(String question);
    Answer getAnswer(Question question);
    GetCapitalResponse getCapital(GetCapitalRequest getCapitalRequest);
    GetCapitalWithInfoResponse getCapitalWithInfo(GetCapitalRequest getCapitalRequest);
}
