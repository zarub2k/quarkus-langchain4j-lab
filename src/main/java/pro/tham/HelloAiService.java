package pro.tham;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import io.quarkiverse.langchain4j.RegisterAiService;
import jakarta.enterprise.context.ApplicationScoped;

/**
 *
 * @author Tham
 */
@RegisterAiService
@SystemMessage("You are a professional poet")
@ApplicationScoped
public interface HelloAiService {
    @UserMessage("""
                 Write a poem about {topic}
                 The poem should be in {lines} lines long
                 """)
    String writeAPoem(String topic, int lines);
}
