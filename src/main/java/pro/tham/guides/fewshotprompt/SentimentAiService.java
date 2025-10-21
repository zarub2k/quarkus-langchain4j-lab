package pro.tham.guides.fewshotprompt;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import io.quarkiverse.langchain4j.RegisterAiService;

/**
 *
 * @author Tham
 */

@RegisterAiService
@SystemMessage("You are an assistant that classifies text sentiment.")
public interface SentimentAiService {
    
    @UserMessage("""
                 INPUT: This product is fantastic!   
                 OUTPUT: POSITIVE
                 
                 INPUT: Terrible customer service.
                 OUTPUT: NEGATIVE
                 
                 INPUT: {text}
                 OUTPUT:
                 """)
    String classifySentiment(String text);
}
