package stepDefinations;

import java.util.*;

public class collections {

    public static void main(String[] args) {
        System.out.println("----------------------------------ArrayList----------------------------------------");
        /*ArrayList- ArrayList can be dynamic in size whereas Array is fixed size*/
        /*ArrayList- ArrayList can add/remove from any index*/
        /*can accept any duplicate values*/

        ArrayList<String> a = new ArrayList<String>();
        a.add("Name");
        a.add("LastName");
        a.add(0, "ID"); /* we can add,remove at any index */
        a.forEach(s -> System.out.println(s));
        System.out.println("--" + a.get(2));  /* we can get from any index*/
        System.out.println(a.contains("testing")); /*we can check if any element is present in ArrayLisy*/
        System.out.println(a.indexOf("LastName"));/*We can check index of any object in ArrayList*/
        System.out.println(a.isEmpty()); /*Can check is arrayList is empty*/

        System.out.println("----------------------------------HASHSET----------------------------------------");
        /*HASHSET,TREESET,LINKEDSET implements set interface*/
        /*SET will not accept any duplicate values*/
        /*no flexibilty of adding at any index - just add and retrieve */

        HashSet<String> H = new HashSet<>();
        H.add("India");
        H.add("Canada");
        H.add("US");
        H.add("Japan");
        H.add("India");
        System.out.println(H.size()); /*Even adding India 2 times- count will be same. Returned 4 size*/

        System.out.println("----------------------------------Iterator----------------------------------------");
        /*Iteator is interface used to triverse though each and every value in Set- will give output in random sequence order*/

        Iterator<String> I = H.iterator();
        while (I.hasNext()) {
            System.out.println(I.next());
        }

        System.out.println("----------------------------------HashMap----------------------------------------");
        /*Hashmap takes key value pair*/
        /*Put is used to store values*/

        HashMap<Integer, String> HM = new HashMap<>();
        HM.put(1, "First"); /*Put is used to store values*/
        HM.put(2, "TWO");
        HM.put(3, "THREE");

        System.out.println(HM.get(2));
        System.out.println(HM.keySet()); /*to get all the keys*/
        System.out.println("---Values " + HM.values()); /*to get all the values*/

//      System.out.println(HM.remove(1));
        Set set = HM.entrySet(); /*COnverted HashMap to HashSET and now will use itertor to traverse*/
        Iterator SI = set.iterator();
        while (SI.hasNext()) {
            System.out.println(SI.next());
        }

        System.out.println("----------------------------------HashTable----------------------------------------");
        /*HashTable is thread safe that means second operation will start only when first thread completes operation
         * Where as HashMap is not thread safe means multiple thread can perform opertion and makes is non synchornised */

    }
}
