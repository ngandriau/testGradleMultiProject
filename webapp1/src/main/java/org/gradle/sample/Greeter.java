package org.gradle.sample;

import org.apache.cxf.helpers.IOUtils;

import java.io.InputStream;
import java.util.logging.LogManager;

public class Greeter {


    public String getGreeting() throws Exception {

        InputStream greetingStr = getClass().getResourceAsStream("/greeting.txt");
        try {
            return IOUtils.toString(greetingStr).trim();
        }
        finally {
            greetingStr.close();
        }
    }
}
