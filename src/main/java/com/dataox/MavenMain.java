package com.dataox;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Yevhenii Filatov
 * @since 1/15/21
 */

public class MavenMain {
    private static final Logger logger = Logger.getLogger("MavenMain Logger");

    public static void main(String[] args) {
        logger.log(Level.INFO, "Hello, world!");
    }
}
