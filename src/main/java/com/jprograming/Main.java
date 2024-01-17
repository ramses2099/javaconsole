package com.jprograming;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        logger.info( "Hello World!" );
        logger.debug( "Hello World!" );
        logger.warn( "Hello World!" );
        System.out.println("Test the System");
        logger.error( "Hello World!" );
        logger.fatal( "Hello World!" );
    }
}