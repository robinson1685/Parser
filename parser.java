import java.io.*;
import java.nio.charset.Charset;
import java.util.*;

public class parser {
    public static boolean error = true;
    int depth;
    int scope;
    int tokenCounter;
    int scopeDepth;
    BufferedReader br;
    char line;
    private static final char EOF = (char) (-1); // end of file
    int numberbuffer = 0; // number of literals
    String alphaBuffer = ""; // buffer
    private static StreamTokenizer tokens;
    private static char ch;
    ArrayList<Character> sample = new ArrayList<Character>();


    public TokenReader followingTok() throws IOException {

        int numberbuffer = 0; // number of literals
        String alphaBuffer = ""; // buffer
        int decBuffer = 0;
        boolean skipped = false;

        while (true) { // check to see if line is skipped
            if (line == EOF && !skipped) {
                skipped = true;
            } else if (skipped) {
                try {
                    br.close(); // close reader if no line can be skipped
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return null;
            }
        }
    }
}
/*
    //SemiColon
    private void semicolon() throws IOException {
        // check if expression ends with ';' and print value
        if (ch == ';')
            error = true;
        else
            error = false;
    }

    //This starts the recursive descent parser methods
    //Program --> declaration-list || void main ()
    public void program() throws IOException {
        delerationlist();
    }

    public void declerationlist() throws IOException {
        decleration();
        declerationloop();
    }

    public void declerationloop() throws IOException {
        if (declarations()) {
            decleration();
            declerationloop();
        } else getToken();
    }

    public void deleration() throws IOException {
        typespecifier();
        isAlpha(token);
        onedelaration();
    }

    public void onedelaration() throws IOException {
        declerationtype();
        if (match('(')) {
            if (isAlpha(ch)) {
                alphaBuffer += line;
                if (match(')')) {
                    compoundstatement();
                }
            }
        }
    }

    public void declarationType() throws IOException {
        if (tokens.equals(';')) {
            semicolon();
        }
    }

    public boolean match(char token) throws IOException {
        {
            Boolean match = false;
            if (tokens.equals(token)) {
                getToken();
            } else error();
        }
    }

    public void error() {
        System.out.println("Reject");
        System.exit(1);
    }

    public void typespecifier() throws IOException {
        scopeDepth = 0;
        while (tokens.nextToken() != StreamTokenizer.TT_EOF) {
            if (tokens.equals("int")) {
                return;
            } else if (tokens.equals("float")) {
                return;
            } else if (tokens.equals("void")) {
                return;
            } else {
                error = false;
            }
        }
    }


    // reads the next line
    private char read() {
        // TODO Auto-generated method stub
        try {
            return (char) (br.read());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return EOF;
    }

    // checks to see if the next character is an numerical number
    private boolean isNum(char c) {
        if (c >= '0' && c <= '9')
            return true;
        return false;
    }

    // checks to see if the next character is an alphabetial letter
    public boolean isAlpha(char c) {
        if (c >= 'a' && c <= 'z')
            return true;
        if (c >= 'A' && c <= 'Z')
            return true;
        return false;
    }
}*/
