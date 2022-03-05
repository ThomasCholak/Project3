package edu.umsl;

import org.apache.commons.codec.binary.Base64;
import java.util.Scanner;

public class DecoderEncoder {
    public static void main(String[] args) {
        //part 1 -decoding the given string
        String input = "SSBsb3ZlIG15IENNUCBTQ0kgMjI2MSBjbGFzcyBzbyBtdWNoLCBJIHdpc2ggSSBjb3VsZCBiZSBqdXN0IGFzIGNvb2wgYXMgbXkgcHJvZmVzc29y";
        String decodedString = new String(decodeBase64(input));
        System.out.println(decodedString);

        //part 2 - encoding a string given by the user
        Scanner reader = new Scanner(System.in); System.out.println();
        System.out.println("Please input the text you would like to be encoded:");
        String input2 = reader.nextLine();
        byte[] encodedBytes = Base64.encodeBase64(input2.getBytes());
        String encodedString = encodeBase64String(encodedBytes);
        System.out.println(encodedString);
    }

    private static byte[] decodeBase64(String base64String) {
        return Base64.decodeBase64(base64String);
    }

    private static String encodeBase64String(byte[] binaryData) {
        return Base64.encodeBase64String(binaryData);
    }

}
