package ai.project.spring_ai.service;

import ai.project.spring_ai.model.Answer;
import ai.project.spring_ai.model.GetCapitalRequest;
import ai.project.spring_ai.model.Question;

public interface OpenAIService {
    String getAnswer(String question);
    Answer getAnswer(Question question);
    Answer getCapital(GetCapitalRequest getCapitalRequest);
}
