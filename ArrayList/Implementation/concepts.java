// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// PS : The name of the public class has to be Main for the code to work
import java.util.*;
public class concepts {
    public static void main(String[] args) {
        ArrayList<String> core=new ArrayList<>();
        core.add("OS");
        core.add(0,"DBMS");
        core.add("CN");
        core.add("OOP");
        System.out.println(core);
        System.out.println(core.get(1));
        System.out.println(core.indexOf("CN"));
        core.set(3,"OOPS");
        // System.out.println(core.remove("OOPS"));
        // System.out.println(core.remove(0));
        // core.clear();
        System.out.println(core.contains("OOPS"));
        System.out.println(core.isEmpty());
        System.out.println(core.size());
       String[] core_array = core.toArray(new String[0]);
        for(String i:core_array){
            System.out.println(i);
        }
    
    }
}