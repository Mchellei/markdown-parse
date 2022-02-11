import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;


public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testFile1() throws IOException {
        String contents= Files.readString(Path.of("/Users/michellechen/Documents/GitHub/markdown-parse/test-file.md"));
        List<String> expect = List.of("https://something.com", "some-page.html");
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }

   /* @Test
    public void test2() throws IOException {
        String contents= Files.readString(Path.of("/Users/michellechen/Documents/GitHub/markdown-parse/test-2.md"));
        List<String> expect = List.of("https://test2.com", "test2.html");
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }

    @Test
    public void test3() throws IOException {
        String contents= Files.readString(Path.of("/Users/michellechen/Documents/GitHub/markdown-parse/test-3.md"));
        List<String> expect = List.of("Hello");
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }

    @Test
    public void testFile2() throws IOException {
        String contents= Files.readString(Path.of("/Users/michellechen/Documents/GitHub/markdown-parse/test-file2.md"));
        List<String> expect = List.of("https://something.com", "some-page.html");
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }

    @Test
    public void testFile3() throws IOException {
        String contents= Files.readString(Path.of("/Users/michellechen/Documents/GitHub/markdown-parse/test-file3.md"));
        List<String> expect = new ArrayList<>();
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }

    @Test
    public void testFile4() throws IOException {
        String contents= Files.readString(Path.of("/Users/michellechen/Documents/GitHub/markdown-parse/test-file4.md"));
        List<String> expect = new ArrayList<>();
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }

    @Test
    public void testFile5() throws IOException {
        String contents= Files.readString(Path.of("/Users/michellechen/Documents/GitHub/markdown-parse/test-file5.md"));
        List<String> expect = new ArrayList<>();
        expect.add("page.com");
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }
    
    @Test
    public void testFile6() throws IOException {
        String contents= Files.readString(Path.of("/Users/michellechen/Documents/GitHub/markdown-parse/test-file6.md"));
        List<String> expect = new ArrayList<>();
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }

    @Test
    public void testFile7() throws IOException {
        String contents= Files.readString(Path.of("/Users/michellechen/Documents/GitHub/markdown-parse/test-file7.md"));
        List<String> expect = new ArrayList<>();
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }

    @Test
    public void testFile8() throws IOException {
        String contents= Files.readString(Path.of("/Users/michellechen/Documents/GitHub/markdown-parse/test-file8.md"));
        List<String> expect = List.of("a link on the first line");
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }*/
    
    
}
    
    

