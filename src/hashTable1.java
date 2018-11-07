/**
 * Name: Max Lewis
 * Lab Name: hashTable1
 * Lab Purpose: create a hash table, which has methods that are all O(1), which is better than a normal dictionary
 * Date: 10/02/18
 * Collaborators: None
 */
import java.util.*;

public class hashTable1 {
    //Challenge 1: x should be a large prime because if it has multiple factors then multiple values will work....essentially you will get more collission
    //Challenge 2: Although 599 is prime, it is not very large and summing the values of the chars is very predictable
    //challenge 3: 31*result + .......

    //initializes an array of size capacity
/* old memes
    String[][] hashAr;
    String[][] hashKeyAr;
    */
    ArrayList<String>[] hashAr;
    ArrayList<String>[] hashKeyAr;

    public hashTable1(int capacity){
        this.hashAr = new ArrayList[capacity];
        this.hashKeyAr = new ArrayList[capacity];
    }

    //put hashes the key to an index in your array, and places the value there. Fails if there are collisions/repeat keys.
    public void put(String key, String value){
        int index = key.hashCode()%hashAr.length;
      /*  boolean retB = (hashAr[index] == null);
        try{
            if (retB) {
                hashAr[index] = value;
                hashKeyAr[index] = key;
            } else {
                throw new Exception("Collision occured");
            }
        }
        catch(Exception E) {
            System.out.println(E);
        }
        return retB;
        */
      hashAr[index].add(value);
      hashKeyAr[index].add(key);
    }

    //Updates m to the new value. Rehashes all keys
    public void resize(int newM){
        ArrayList<String>[] tempAr = new ArrayList[newM];
        ArrayList<String>[] tempKeyAr = new ArrayList[newM];
        hashTable1 tempHT = new hashTable1(newM);
        for(int i = 0; i<newM; i++){
            if(i>hashAr.length-1){
                i = newM;
            }
            else {
                for(int i = 0; )
                String tempV = get(hashKeyAr[i]);
                String tempK = hashKeyAr[i];
                tempHT.put(tempK, tempV);
            }
        }
        this.hashAr = tempHT.hashAr;
        this.hashKeyAr = tempHT.hashKeyAr;
    }

    //get hashes the key to get the index, and returns that element. Returns null if key not found.
    public String get(String key){
        int index = key.hashCode()%hashAr.length;
        for(i = 0; i<hashKeyAr[index].size; i++){
            if(key == hashKeyAr[index].get(i)){
                return hashAr[index].get(i);
            }
        }
        return null;
    }

    //returns the unique int in the range of the [0, array length)
    //private int hashCode(String key)
}
