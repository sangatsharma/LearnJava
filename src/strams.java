import java.util.*;

public class strams {
    public static void main(String[] args) {
        String[] array = new String[] { "cow", "bull", "ox" };
        // map

        String[] newarray = Arrays.stream(array).map(s -> s.toUpperCase()).toArray(String[]::new);
        System.out.println(Arrays.toString(newarray));

        // filter
        String[] filterarray = Arrays.stream(array).filter(s -> s.length() > 2).map(s -> s.toUpperCase())
                .toArray(String[]::new);
        System.out.println(Arrays.toString(filterarray));

        // reduce
        String reducearray = Arrays.stream(filterarray).reduce("", (s, s2) -> s +"1"+ s2);
        System.out.println(reducearray);
    }

}
