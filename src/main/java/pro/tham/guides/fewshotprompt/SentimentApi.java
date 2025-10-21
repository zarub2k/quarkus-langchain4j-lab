package pro.tham.guides.fewshotprompt;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

/**
 *
 * @author Tham
 */

@Path("sentiment")
@Produces(MediaType.TEXT_PLAIN)
public class SentimentApi {
    @Inject SentimentAiService aiService;
    
    @GET
    public String analyze(@QueryParam("text") String text) {
        return aiService.classifySentiment(text);
    }
}
