import java.util.HashMap;

public class MapsPlayground {

    public static void main(String[] args) {

        HashMap<String, Integer> trainerEmploymentLengths = new HashMap<>();
        //Maps store data in key-value pairs
        trainerEmploymentLengths.put("Colin", 11);
        trainerEmploymentLengths.put("Anna", 4);
        trainerEmploymentLengths.put("Iain", 9);

        //use .get() method to retrieve data
        int annaEmploymentLength = trainerEmploymentLengths.get("Anna");
        System.out.println(annaEmploymentLength);

        trainerEmploymentLengths.replace("Colin", 12);
        System.out.println(trainerEmploymentLengths.get("Colin"));
    }
}
