
package test;

import model.*;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.Random;

public class AppCollections {

    public static void main(String[] args) {

        Lawyer l1 = new Lawyer(new Robot("legal stuff"));
        Customer bob = new Customer("Bob");

        Lawyer[] lawyers = {
            l1,
            new Lawyer(new Customer("Alice"))
        };

        for (int i = 0; i < lawyers.length; i++) {
            System.out.println(lawyers[i]);
            lawyers[i].sue(bob);
        }

        List<Lawyer> armyArray = new ArrayList<>();
        List<Lawyer> armyLinked = new LinkedList<>();

        List<List<Lawyer>> armies = new ArrayList<>();
        armies.add(armyArray);
        armies.add(armyLinked);

        Random r = new Random();
        int armySize = 1000 + r.nextInt(9001); 

        for (List<Lawyer> army : armies) {
            for (int i = 0; i < armySize; i++) {
                army.add(new Lawyer(new Robot("law")));
            }
            System.out.println(
                army.getClass().getSimpleName() + " size: " + army.size()
            );
        }


        Set<Lawyer> uniqueLawyers = new HashSet<>();

        Lawyer repeat = new Lawyer(new Robot("tax law"));

        uniqueLawyers.add(repeat);
        uniqueLawyers.add(repeat);
        uniqueLawyers.add(new Lawyer(new Robot("tax law"))); 

        System.out.println("HashSet size: " + uniqueLawyers.size());
        System.out.println("HashSet contents:");
        for (Lawyer l : uniqueLawyers) {
            System.out.println(l);
        }

        Map<String, Lawyer> caseAssignments = new HashMap<>();

        caseAssignments.put("CASE-001", l1);
        caseAssignments.put("CASE-002", new Lawyer(new Customer("Alice")));
        caseAssignments.put("CASE-003", repeat);


        Map<Lawyer, Integer> caseCounts = new HashMap<>();

        for (Lawyer l : caseAssignments.values()) {
            int count = caseCounts.getOrDefault(l, 0);
            caseCounts.put(l, count + 1);
        }

        for (Lawyer l : caseCounts.keySet()) {
            System.out.println(l + " -> " + caseCounts.get(l) + " case(s)");
        }
    }

}
