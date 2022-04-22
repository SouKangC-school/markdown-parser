import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
public class MarkdownParseTest {
    // @Test
    // public void testForTestFile() throws IOException {
    //     List<String> temp = MarkdownParse.getLinks(Files.readString(Path.of("test-file.md")));
    //     List<String> expected = List.of("https://something.com", "some-thing.html");
    //     assertEquals(expected, temp);
    // }
    @Test
    public void testForNewTest() throws IOException {
        List<String> temp = MarkdownParse.getLinks(Files.readString(Path.of("new-test.md")));
        List<String> expected = List.of("https://something.com", "some-thing.html", "image.png");
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
}