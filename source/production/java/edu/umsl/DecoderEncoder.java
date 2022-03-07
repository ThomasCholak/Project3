package edu.umsl;

import org.apache.commons.codec.binary.Base64;
import java.util.Scanner;

public class DecoderEncoder {
    public static void main(String[] args) {
        //part 1 -decoding the given string
        String input = "SSBsb3ZlIG15IENNUCBTQ0kgMjI2MSBjbGFzcyBzbyBtdWNoLCBJIHdpc2ggSSBjb3VsZCBiZSBqdXN0IGFzIGNvb2wgYXMgbXkgcHJvZmVzc29y";
        String readableString = new String(decodeBase64(input));
        System.out.println(readableString);

        //part 2 - encoding a string given by the user
        Scanner reader = new Scanner(System.in); System.out.println();
        System.out.println("Please input the text you would like to be encoded:");
        String input2 = reader.nextLine();
        byte[] newBytes = input2.getBytes(); //converts string to bytes
        String readableString2 = new String(encodeBase64(newBytes)); //converts bytes to string
        System.out.println(readableString2);
    }
    private static byte[] decodeBase64(String base64String) { return Base64.decodeBase64(base64String); }
    private static byte[] encodeBase64(byte[] binaryData) { return Base64.encodeBase64(binaryData); }
}
