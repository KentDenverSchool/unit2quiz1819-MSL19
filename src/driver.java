/**
 * Name: Max Lewis
 * Lab Name: Driver
 * Lab Purpose: this is a driver to display the capabilities of the hashTable1 class
 * Date: 10/02/18
 * Collaborators: None
 */
public class driver {
    public static void main(String[] args) {
        hashTable1 h = new hashTable1(10);
        System.out.println("Testing edge case of geting from empty:");
        System.out.println(h.get("wow"));
        System.out.println("Encoding (4i, wowo ljldksjdlaksjdlsakdjslj");
        h.put("4i", "wowo ljldksjdlaksjdlsakdjslj");
        for(int i =0; i<10; i++){
            h.put(i+"i", i+"kljasdfhkljsdhfkljsdahfkljsdhflkjsdahflkjsdhfksdhflksdhfsdahkf");
        }
        System.out.println("The hash table should have just thrown an error from a collision");
        System.out.println("expected: wowo ljldksjdlaksjdlsakdjslj");
        System.out.println(h.get("4i"));
        h.resize(12);
        System.out.println(h.get("4i"));


    }
}
