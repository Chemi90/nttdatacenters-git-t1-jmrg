package com.nttdata.mvn;

import org.apache.commons.lang3.RandomStringUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        String randomStr = RandomStringUtils.randomAlphanumeric(10);
        System.out.println(randomStr);
    }
}
