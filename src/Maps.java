import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        // always need to use java classes for these types, they cannot be primitive types as int
        // we need to use java wrapper classes for primitive types
        HashMap<String, Integer> empIds = new HashMap<>();

        empIds.put("Smith", 1234);
        empIds.put("John", 5763);

        System.out.println(empIds);
        System.out.println(empIds.get("John"));

        // check if there's a key like this
        System.out.println(empIds.containsKey("Nuwan"));
        System.out.println(empIds.containsKey("Smith"));

        // check if there's a value like this
        System.out.println(empIds.containsValue(1234));
        System.out.println(empIds.containsValue(123467));

        // put adds the key value pair or updates the value if the key already exists
        empIds.put("Nolan", 444);
        System.out.println(empIds);

        empIds.put("John", 789);
        System.out.println(empIds);

        // replace does not add a new key value pair it updates if exists and does nothing if it doesn't exist
        empIds.replace("Mike", 389);
        System.out.println(empIds);

        empIds.replace("John", 222);
        System.out.println(empIds);

        // only puts if absent
        empIds.putIfAbsent("John", 111);
        System.out.println(empIds);

        empIds.putIfAbsent("Marie", 221);
        System.out.println(empIds);

        empIds.remove("Marie");
        System.out.println(empIds);
    }
}
