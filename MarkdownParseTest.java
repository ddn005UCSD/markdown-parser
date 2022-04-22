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

    @Test 
    public void markdownTestFileTwo() throws IOException{

        Path fileName = Path.of("test2.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
	    System.out.println(links);

        ArrayList<String> expected = new ArrayList<>();
        expected.add("Supposed link");

        assertEquals(expected, links );


    }
    
    @Test 
    public void markdownTestFileThree() throws IOException{

        Path fileName = Path.of("test3.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
	    System.out.println(links);

        ArrayList<String> expected = new ArrayList<>();
        expected.add("true link");

        assertEquals(expected, links );


    }

    @Test 
    public void markdownTestFilesRepository2() throws IOException{

        Path fileName = Path.of("test-file2.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
	    System.out.println(links);

        ArrayList<String> expected = new ArrayList<>();
        expected.add("https://something.com");
        expected.add("some-page.html");

        assertEquals(expected, links );


    }

    @Test 
    public void markdownTestFilesRepository3() throws IOException{

        Path fileName = Path.of("test-file3.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
	    System.out.println(links);

        ArrayList<String> expected = new ArrayList<>();
        assertEquals(expected, links );


    }

    @Test 
    public void markdownTestFilesRepository4() throws IOException{

        Path fileName = Path.of("test-file4.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
	    System.out.println(links);

        ArrayList<String> expected = new ArrayList<>();
        assertEquals(expected, links );


    }

    @Test 
    public void markdownTestFilesRepository5() throws IOException{

        Path fileName = Path.of("test-file5.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
	    System.out.println(links);

        ArrayList<String> expected = new ArrayList<>();
        assertEquals(expected, links );


    }

    @Test 
    public void markdownTestFilesRepository6() throws IOException{

        Path fileName = Path.of("test-file6.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
	    System.out.println(links);

        ArrayList<String> expected = new ArrayList<>();
        assertEquals(expected, links );


    }

    @Test 
    public void markdownTestFilesRepository7() throws IOException{

        Path fileName = Path.of("test-file7.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
	    System.out.println(links);

        ArrayList<String> expected = new ArrayList<>();
        assertEquals(expected, links );


    }

    @Test 
    public void markdownTestFilesRepository8() throws IOException{
        System.out.println("Test8");
        Path fileName = Path.of("test-file8.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
	    System.out.println(links);

        ArrayList<String> expected = new ArrayList<>();
        

        assertEquals(expected, links );


    }

    
}
