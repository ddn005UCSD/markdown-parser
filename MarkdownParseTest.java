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

    @Test 
    public void markdownTestFilesRepository9() throws IOException{
        System.out.println("Test5");
        Path fileName = Path.of("test5.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
	    System.out.println(links);

        ArrayList<String> expected = new ArrayList<>();
        

        assertEquals(expected, links );


    }

    @Test 
    public void markdownTestLab7GroupBTest() throws IOException{

        Path fileName = Path.of("lab7OutsideTest.md");
        String content = Files.readString(fileName);
        ArrayList<String> result = MarkdownParse.getLinks(content);
        assertEquals(new ArrayList<String>(), result);

    }

    @Test 
    public void labReport4SnippetOne() throws IOException{
        System.out.println("LabReport4S1");
        Path fileName = Path.of("labReport4Snippet1.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
	    System.out.println(links);

        ArrayList<String> expected = new ArrayList<>();
        expected.add("`google.com");
        expected.add("google.com");
        expected.add("ucsd.edu");
        

        assertEquals(expected, links );


    }

    @Test 
    public void labReport4SnippetTwo() throws IOException{
        System.out.println("LabReport4S2");
        Path fileName = Path.of("labReport4Snippet2.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
	    System.out.println(links);

        ArrayList<String> expected = new ArrayList<>();
        expected.add("a.com");
        expected.add("a.com(())");
        expected.add("example.com");
        assertEquals(expected, links );
    }

    @Test 
    public void labReport4SnippetThree() throws IOException{
        System.out.println("LabReport4S2");
        Path fileName = Path.of("labReport4Snippet3.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
	    System.out.println(links);

        ArrayList<String> expected = new ArrayList<>();
        expected.add("https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule");
        assertEquals(expected, links );
    }


}
