import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

public class Binary {
	
	public static void main(String args[]){

        System.out.println("Binary Translator - Kaleb Haslam");
		System.out.println("Getting Input..");
		String input = JOptionPane.showInputDialog(null, "Enter you phrase to be converted", "Binary Translator", JOptionPane.PLAIN_MESSAGE);
        char[] charArray = input.toCharArray();

        System.out.println("Converting to binary..");
        String output = "";
		for(int i = 0; i < charArray.length; i++){
            output += getCoded(charArray[i]);
        }

        System.out.println(output);

        System.out.println("Copying to clipboard..");
        StringSelection selection = new StringSelection(output);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selection, selection);
        System.out.println("Successfully copied.");

        String temp = output;
        if (output.length() > 135){
            System.out.println("String too long to show in MessageDialog.");
            temp = "";
        }
        JOptionPane.showMessageDialog(null, "Binary code has been copied to the clipboard. \n\n\n" + temp, "Binary Translator", JOptionPane.PLAIN_MESSAGE);

        System.out.println("Exiting program..");
	}
	private static String getCoded(char x) {
        switch (x) {
            case 'a':
                return "01100001 ";

            case 'b':
                return "01100010 ";

            case 'c':
                return "01100011 ";

            case 'd':
                return "01100100 ";

            case 'e':
                return "01100101 ";

            case 'f':
                return "01100110 ";

            case 'g':
                return "01100111 ";

            case 'h':
                return "01101000 ";

            case 'i':
                return "01101001 ";

            case 'j':
                return "01101010 ";

            case 'k':
                return "01101011 ";

            case 'l':
                return "01101100 ";

            case 'm':
                return "01101101 ";

            case 'n':
                return "01101110 ";

            case 'o':
                return "01101111 ";

            case 'p':
                return "01110000 ";

            case 'q':
                return "01110001 ";

            case 'r':
                return "01110010 ";

            case 's':
                return "01110011 ";

            case 't':
                return "01110100 ";

            case 'u':
                return "01110101 ";

            case 'v':
                return "01110110 ";

            case 'w':
                return "01110111 ";

            case 'x':
                return "01111000 ";

            case 'y':
                return "01111001 ";

            case 'z':
                return "01111010 ";

            case 'A':
                return "01000001 ";

            case 'B':
                return "01000010 ";

            case 'C':
                return "01000011 ";

            case 'D':
                return "01000100 ";

            case 'E':
                return "01000101 ";

            case 'F':
                return "01000110 ";

            case 'G':
                return "01000111 ";

            case 'H':
                return "01001000 ";

            case 'I':
                return "01001001 ";

            case 'J':
                return "01001010 ";

            case 'K':
                return "01001011 ";

            case 'L':
                return "01001100 ";

            case 'M':
                return "01001101 ";

            case 'N':
                return "01001110 ";

            case 'O':
                return "01001111 ";

            case 'P':
                return "01010000 ";

            case 'Q':
                return "01010001 ";

            case 'R':
                return "01010010 ";

            case 'S':
                return "01010011 ";

            case 'T':
                return "01010100 ";

            case 'U':
                return "01010101 ";

            case 'V':
                return "01010110 ";

            case 'W':
                return "01010111 ";

            case 'X':
                return "01011000 ";

            case 'Y':
                return "01011001 ";

            case 'Z':
                return "01011010 ";

            case '0':
                return "00110000 ";

            case '1':
                return "00110001 ";

            case '2':
                return "00110010 ";

            case '3':
                return "00110011 ";

            case '4':
                return "00110100 ";

            case '5':
                return "00110101 ";

            case '6':
                return "00110110 ";

            case '7':
                return "00110111 ";

            case '8':
                return "00111000 ";

            case '9':
                return "00111001 ";

            case ' ':
                return "00100000 ";

            case ',':
                return "00101100 ";

            case '.':
                return "00101110 ";

            case '!':
                return "00100001 ";

            case '?':
                return "00111111 ";

            case ':':
                return "00111010 ";

            case ';':
                return "00111011 ";

            case '"':
                return "00100010 ";

            case '@':
                return "01000000 ";

            case '#':
                return "00100011 ";

            case '$':
                return "00100100 ";

            case '%':
                return "00100101 ";

            case '^':
                return "01011110 ";

            case '&':
                return "00100110 ";

            case '*':
                return "00101010 ";

            case '(':
                return "00101000 ";

            case ')':
                return "00101001 ";

            case '_':
                return "01011111 ";

            case '-':
                return "00101101 ";

            case '+':
                return "00101011 ";

            case '=':
                return "00111101 ";

            default:
                System.err.println("Character unsupported: " + x);
                return "";

        }
    }
}
