import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
public class MarkdownParseTest {
    @Test
    public void testSingle() throws IOException {
        List<String> temp = MarkdownParse.getLinks(Files.readString(Path.of("new-test.md")));
        List<String> expected = List.of("https://something.com", "some-thing.html");
    }
    @Test
    public void testForTestFile() throws IOException {
        List<String> temp = MarkdownParse.getLinks(Files.readString(Path.of("test-file.md")));
        List<String> expected = List.of("https://something.com", "some-thing.html");
        assertEquals(expected, temp);
    }
    @Test
    public void testForThirdTestFile() throws IOException {
        List<String> temp = MarkdownParse.getLinks(Files.readString(Path.of("third-test-file.md")));
        List<String> expected = List.of("url.md");
        assertEquals(expected, temp);
    }
    @Test
    public void testForTestFile1() throws IOException {
        List<String> temp = MarkdownParse.getLinks(Files.readString(Path.of("test-file.md")));
        List<String> expected = List.of("https://something.com", "some-thing.html");
        assertEquals(expected, temp);
    }
    @Test
    public void testForTestFile2() throws IOException {
        List<String> temp = MarkdownParse.getLinks(Files.readString(Path.of("test-file2.md")));
        List<String> expected = List.of("https://something.com", "some-page.html");
        assertEquals(expected, temp);
    }
    @Test
    public void testForTestFile3() throws IOException {
        List<String> temp = MarkdownParse.getLinks(Files.readString(Path.of("test-file3.md")));
        List<String> expected = List.of();
        assertEquals(expected, temp);
    }
    @Test
    public void testForTestFile4() throws IOException {
        List<String> temp = MarkdownParse.getLinks(Files.readString(Path.of("test-file4.md")));
        List<String> expected = List.of();
        assertEquals(expected, temp);
    }
    @Test
    public void testForTestFile5() throws IOException {
        List<String> temp = MarkdownParse.getLinks(Files.readString(Path.of("test-file5.md")));
        List<String> expected = List.of();
        assertEquals(expected, temp);
    }
    @Test
    public void testForTestFile6() throws IOException {
        List<String> temp = MarkdownParse.getLinks(Files.readString(Path.of("test-file6.md")));
        List<String> expected = List.of("page.com");
        assertEquals(expected, temp);
    }
    @Test
    public void testForTestFile7() throws IOException {
        List<String> temp = MarkdownParse.getLinks(Files.readString(Path.of("test-file7.md")));
        List<String> expected = List.of();
        assertEquals(expected, temp);
    }
    @Test
    public void testForTestFile8() throws IOException {
        List<String> temp = MarkdownParse.getLinks(Files.readString(Path.of("test-file8.md")));
        List<String> expected = List.of("a link on the first line");
        assertEquals(expected, temp);
    }
    @Test
    public void testForTestFile9() throws IOException {
        List<String> temp = MarkdownParse.getLinks(Files.readString(Path.of("test-file9.md")));
        List<String> expected = List.of("`google.com");
        assertEquals(expected, temp);
    }
    @Test
    public void testForTestFile10() throws IOException {
        List<String> temp = MarkdownParse.getLinks(Files.readString(Path.of("test-file10.md")));
        List<String> expected = List.of("a.com", "a.com(())", "example.com");
        assertEquals(expected, temp);
    }
    @Test
    public void testForTestFile11() throws IOException {
        List<String> temp = MarkdownParse.getLinks(Files.readString(Path.of("test-file11.md")));
        List<String> expected = List.of("https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule");
        assertEquals(expected, temp);
    }
    String temp = "Another test";
    // new commands
    //another change
    //try again
}
