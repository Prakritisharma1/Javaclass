package Set1;

import java.util.HashSet;
import java.util.Set;

public class Set2 {

    public void comp()
    {
        Set<Integer>table = new HashSet<Integer>();
        table.add(3);
        table.add(4);
        table.add(6);
        table.add(7);
        System.out.println(table);
        table.remove(3);
        System.out.println(table);

        Set<Integer>mouse = new HashSet<Integer>();
        mouse.add(6);
        mouse.add(7);
        mouse.add(8);
        mouse.add(9);

        table.addAll(mouse);
        table.retainAll(mouse);

        for(int a : table)

        {

            System.out.println(a);
        }

    }
}
