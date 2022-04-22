import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

import org.junit.*;


public class MarkdownParseTest {
    
    @Test                           //Marks method as test
    public void additionTest(){     //Name for method
        assertEquals(2, 1+1);       //What the program does, and asserts what is correct
    }

    @Test 
    public void markdownTestFileOne() throws IOException{

        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
	    System.out.println(links);

        ArrayList<String> expected = new ArrayList<>();
        expected.add("https://something.com");
        expected.add("some-thing.html");

        assertEquals(expected, links );


    }

}
