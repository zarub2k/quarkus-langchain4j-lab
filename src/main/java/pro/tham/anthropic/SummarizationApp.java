package pro.tham.anthropic;

import io.quarkus.runtime.QuarkusApplication;
import jakarta.inject.Inject;
import java.io.File;
import java.nio.file.Files;

/**
 *
 * @author Tham
 */

//@QuarkusMain
public class SummarizationApp implements QuarkusApplication {
    
    @Inject SummarizationService ai;

    @Override
    public int run(String... args) throws Exception {
        if (args.length == 0) {
            System.out.println("##### Please provide the path of the file #####");
            return 1;
        }
        
        System.out.println("$$$ Required file path is given $$$");
        System.out.println("Path: " + args[0]);
        System.out.println("Path: " + new File(args[0]).toPath());
        var article = Files.readString(new File(args[0]).toPath());
        System.out.println(ai.summarize(article));
        return 0;
    }
}
