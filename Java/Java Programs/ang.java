import angular_encryption.Angular_encryption;
public class ang{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Angular_encryption obj = new Angular_encryption();
       System.out.println(obj.decrypt(obj.encrypt("abcdefghijklmnopqrs_tuvwxyz0123456789,. ?the quick brown fox jumps upon the little lazy dog. the quick brown fox jumps upon the little lazy dog.abcdefghijklmnopqrs_tuvwxyz0123456789,. ?the quick brown fox jumps upon the little lazy dog. the quick brown fox jumps upon the little lazy dog.abcdefghijklmnopqrs_tuvwxyz0123456789,. ?the quick brown fox jumps upon the little lazy dog. the quick brown fox jumps upon the little lazy dog.abcdefghijklmnopqrs_tuvwxyz0123456789,. ?the quick brown fox jumps upon the little lazy dog. the quick brown fox jumps upon the little lazy dog.abcdefghijklmnopqrs_tuvwxyz0123456789,. ?the quick brown fox jumps upon the little lazy dog. the quick brown fox jumps upon the little lazy dog.", 1)));
       //System.out.println(obj.enc_string);
       //System.out.println(obj.compres_string);
       System.out.println("Encryption time : " + obj.getEncryptionTime());
       System.out.println("Compression time : " + obj.getCompressionTime());
       System.out.println("Decryption time : " + obj.getDecryptionTime());
       System.out.println("Extraction time : " + obj.getExtractionTime());
       
       
        //System.out.println(obj.nenc(','));
    }
}
