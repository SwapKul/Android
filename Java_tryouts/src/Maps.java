import java.util.*;

public class Maps {

    public static void main (String[] args) {

        Map map = new HashMap();
        map.put("Master", "Swapnil");
        map.put("Servant", "Adam");
        map.put("Maid", "Jessy");
        System.out.println(map.get("Master"));
        System.out.println(map.toString());
        map.remove("Maid");
        System.out.println(map.toString());
        System.out.println(map.size());

    }

}
