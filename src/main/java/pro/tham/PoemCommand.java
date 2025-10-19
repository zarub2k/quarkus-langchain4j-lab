package pro.tham;

import jakarta.inject.Inject;
import picocli.CommandLine;
import picocli.CommandLine.Parameters;

/**
 *
 * @author Tham
 */

//@CommandLine.Command(name = "poem", mixinStandardHelpOptions = true)
public class PoemCommand implements Runnable {

    @Parameters(paramLabel = "<topic>", defaultValue = "Java",
            description = "The topic")
    String topic;
    
    @CommandLine.Option(names = "--lines", defaultValue = "5",
            description = "The number of lines in the poem")
    int lines;
    
    @Inject HelloAiService helloAiService;
    
    @Override
    public void run() {
        String response = helloAiService.writeAPoem(topic, lines);
        System.out.println(response);
    }
}
