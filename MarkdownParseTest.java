import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
public class MarkdownParseTest {
    @Test
    public void testReadFile() throws IOException {
        List<String> temp = MarkdownParse.getLinks(Files.readString(Path.of("test-file.md")));
        List<String> expected = List.of("https://something.com", "some-thing.html");
        assertEquals(expected, temp);
    }
}