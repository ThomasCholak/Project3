package edu.umsl;

import org.apache.commons.codec.binary.Base64;

public class DecoderEncoder {
    public static void main(String[] args) {
        String input = "SSBsb3ZlIG15IENNUCBTQ0kgMjI2MSBjbGFzcyBzbyBtdWNoLCBJIHdpc2ggSSBjb3VsZCBiZSBqdXN0IGFzIGNvb2wgYXMgbXkgcHJvZmVzc29y";
        String decodedString = new String(decodeBase64(input));
        System.out.println(decodedString);
    }
    private static byte[] decodeBase64(String base64String) {
        return Base64.decodeBase64(base64String);
    }
}
