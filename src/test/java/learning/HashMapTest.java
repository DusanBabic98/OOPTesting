package learning;

import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args) {

        HashMap<String, String> FootballClubsWebList = new HashMap<>();

        FootballClubsWebList.put("OFK Belgrade", "www.ofk.org");
        FootballClubsWebList.put("Partizan", "www.partizan.rs");
        FootballClubsWebList.put("FK Nis", "www.nis.rs");
        FootballClubsWebList.put("BSK Belgrade", "www.bsk.com");

        System.out.println(FootballClubsWebList);

        for (String myList : FootballClubsWebList.keySet()) {
            System.out.println(myList);
        }
        System.out.println(FootballClubsWebList.get("Partizan"));

        FootballClubsWebList.remove("FK Nis");

        System.out.println(FootballClubsWebList);

        FootballClubsWebList.clear();

        System.out.println(FootballClubsWebList);


    }
}
