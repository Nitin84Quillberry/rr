import java.util.ArrayList;

public class Lamba_Terminals {

    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();
        names.add("Ellie");
        names.add("Bellie");
        names.add("Elly");
        names.add("kli");
        names.add("Ely");

        long size= names.stream().filter(s -> s.startsWith("E")).count();
        System.out.println(size);

         names.stream().forEach(s -> System.out.println(s));


    }
}
