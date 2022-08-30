import java.util.Map;
import java.util.function.Function;

public class TextFormat {

    Map<SyntaxFormat, Function<String, String>> syntaxMaping =
            Map.of(
                    SyntaxFormat.MD, (s) -> "**" + s + "**",
                    SyntaxFormat.HTML, (s) -> boldHTML(s),
                    SyntaxFormat.BB, (s) -> "[b]" + s + "[/b]"
            );

    public String bold(String text, SyntaxFormat syntaxFormat){
       return syntaxMaping.get(syntaxFormat).apply(text);
    }


    private String boldMD(String text){
        return "**" + text + "**";
    }

    private String boldHTML(String text) {
        return "<strong>" + text + "</strong>";
    }

    enum SyntaxFormat{
        MD,
        HTML,
        BB
    }
}
