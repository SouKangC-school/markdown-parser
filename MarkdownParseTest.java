import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
public class MarkdownParseTest {
    @Test
    public void testForTestFile() throws IOException {
        List<String> temp = MarkdownParse.getLinks(Files.readString(Path.of("test-file.md")));
        List<String> expected = List.of("https://something.com", "some-thing.html");
        assertEquals(expected, temp);
    }
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
}