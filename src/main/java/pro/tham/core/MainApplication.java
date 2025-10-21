package pro.tham.core;

import io.quarkus.runtime.QuarkusApplication;

/**
 *
 * @author Tham
 */

//@QuarkusMain
public class MainApplication implements QuarkusApplication {

    @Override
    public int run(String... args) throws Exception {
        System.out.println("<< Enters MainApplication.run() >>");
        return 0;
    }
}
