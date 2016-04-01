package com.hotmail.kalebmarc;

import com.hotmail.kalebmarc.jtools.Console;
import com.tinify.Source;

import java.io.IOException;

import static com.tinify.Tinify.fromFile;
import static com.tinify.Tinify.setKey;

public class tinyimg {
    private final static String API_KEY = "";//Get API key from https://tinypng.com/developers
    //private final static String IN = "";
    //private final static String OUT = "";

    public static void main(String args[]) {
        setKey(API_KEY);

        if (args.length == 0){
            System.out.println("No images have requested.");//TODO this needs better wording
            Console.pause();
            System.exit(0);
        }

        System.out.println("+-------------------------");
        System.out.println("|        Tiny Img        |");
        System.out.println("| Powered by tinypng.com |");
        System.out.println("|                        |");
        System.out.println("| Application by Kaleb   |");
        System.out.println("| github.com/hhaslam11   |");
        System.out.println("+------------------------|");

        System.out.println("Running");
        for(int i = 0; i < args.length - 1; i++){
            try {
                System.out.println("Compressing " + args[i]);
                Source source = fromFile(args[i]);
                source.toFile(args[args.length - 1] + "\\" + i + ".png");
                System.out.println("Done!");
            } catch (IOException e) {
                e.printStackTrace();
                System.exit(-1);
            }
        }
    }
}
