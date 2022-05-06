//https://howtodoinjava.com/java/io/java-read-file-to-string-examples/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParse {

    public static ArrayList<String> getLinks(String markdown) {
        ArrayList<String> toReturn = new ArrayList<>();
        // find the next [, then find the ], then find the (, then read link upto next )
        int currentIndex = 0;
        while(currentIndex <= markdown.length()) {
            int openBracket = markdown.indexOf("[", currentIndex);
            int closeBracket = markdown.indexOf("]", openBracket);
            int openParen = markdown.indexOf("(", closeBracket);
            int closeParen = markdown.indexOf(")", openParen);
            //if(openParen != -1 && closeParen != -1) {
                if(closeBracket == openParen - 1) {
                    toReturn.add(markdown.substring(openParen + 1, closeParen));
                }
            //}
            currentIndex = closeParen + 1;
            System.out.println("new addition");

            if(markdown.indexOf("[", currentIndex) == -1 || markdown.indexOf("(", currentIndex) == -1) {
                break;
            }
        }

        // index -> 44, 70
        // length -> 72

        String temp = "This is a test";
        return toReturn;
    }
}