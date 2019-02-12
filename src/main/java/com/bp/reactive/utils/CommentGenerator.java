package com.bp.reactive.utils;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
public class CommentGenerator {

    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    private static final Random RANDOM = new Random(System.currentTimeMillis());

    private static final List<String> COMMENT_AUTHOR =
            Arrays.asList(
                    "Lakshmi", "Vishnu", "Peter", "Rahul", "Srikant",
                    "Vinod", "lax", "Jabez", "howla", "Jaffa");


    private static final List<String> COMMENT_MESSAGE =
            Arrays.asList(
                    "Common , guys, its time to built reactive apps!",
                    "Yes, stop using old stuff, start recative thinking!",
                    "Reactive-Wow",
                    "True!",
                    "Hello everyone Reactive here?",
                    "Good!");

    public static String randomAuthor() {
        return COMMENT_AUTHOR.get(RANDOM.nextInt(COMMENT_AUTHOR.size()));
    }

    public static String randomMessage() {
        return COMMENT_MESSAGE.get(RANDOM.nextInt(COMMENT_MESSAGE.size()));
    }

    public static String getCurrentTimeStamp() {
        return dtf.format(LocalDateTime.now());
    }
}