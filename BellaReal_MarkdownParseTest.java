import static org.junit.Assert.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import org.junit.*;

public class MarkdownParseTest {
    @Test
    public void getLinksSnippet1() throws IOException{
        String content = Files.readString(Path.of("snippet1.md"));
        assertEquals(List.of("`google.com", "google.com", "ucsd.edu"),
            MarkdownParse.getLinks(content));
    }

    @Test
    public void getLinksSnippet2() throws IOException{
        String content = Files.readString(Path.of("snippet2.md"));
        assertEquals(List.of("a.com", "a.com(())", "example.com"),
            MarkdownParse.getLinks(content));
    }

    @Test
    public void getLinksSnippet3() throws IOException {
        String content = Files.readString(Path.of("snippet3.md"));
        assertEquals(List.of( 
    "https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule"),
        MarkdownParse.getLinks(content));
    }

}
