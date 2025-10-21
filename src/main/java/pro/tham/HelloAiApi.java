package pro.tham;

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
@Path("/helloai")
@Produces(MediaType.TEXT_PLAIN)
public class HelloAiApi {
    @Inject HelloAiService aiService;
    
    @GET
    public String hello(@QueryParam("topic") String topic, @QueryParam("lines") int lines) {
        return aiService.writeAPoem(topic, lines);
    }
}
