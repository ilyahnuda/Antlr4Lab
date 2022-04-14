import Elements.Program;
import com.antr.testLexer;
import com.antr.testParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import wallker.MyWalker;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) throws Exception {
        CharStream inputStream = null;
        try {
            inputStream = CharStreams.fromFileName("D:\\JavaPr\\APIS\\src\\main\\java\\example");
        } catch (IOException e) {
            e.printStackTrace();
        }

        testLexer lexer = new testLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        testParser parser = new testParser(tokens);

        MyWalker walker = new MyWalker();
        var tree = parser.program();

        Program result = walker.visitProgram(tree);
        toJava(result.toString(), Paths.get("D:\\JavaPr\\APIS\\src\\main\\java\\Test.java"));


    }

    public static void toJava(String _code, Path path) throws Exception {
        var code = new ArrayList<String>();

        code.add("public class Test{");
        code.add("\tprivate static Test test = new Test();");
        code.add(_code);
        code.add("}");
        if (Files.exists(path)) {
            System.out.println("File already exists");
        } else {

            try {
                Files.createFile(path);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            Files.write(path, code, StandardCharsets.UTF_8,
                    StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println("**********");
        Process pro = Runtime.getRuntime().exec("javac -cp src src/main/java/Test.java");
        pro.waitFor();
        /*System.out.println("**********");
        runProcess("java -cp src/main/java Test Hi Pankas");*/

    }
    /*  private static void printLines(String cmd, InputStream ins) throws Exception {
        String line = null;
        BufferedReader in = new BufferedReader(
                new InputStreamReader(ins));
        while ((line = in.readLine()) != null) {
            System.out.println(cmd + " " + line);
        }
    }
    private static void runProcess(String command) throws Exception {
        Process pro = Runtime.getRuntime().exec(command);
        printLines(command + " stdout:", pro.getInputStream());
        printLines(command + " stderr:", pro.getErrorStream());
        pro.waitFor();
        System.out.println(command + " exitValue() " + pro.exitValue());
    }*/
}
