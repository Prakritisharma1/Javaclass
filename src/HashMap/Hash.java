package HashMap;

import java.util.HashMap;

public class Hash {

    public void Pakku()
    {

        HashMap<Integer, String> nik = new HashMap<Integer, String> ();

        nik.put(2 , " java ");
        nik.put(3 , " four ");
        nik.put(4 , " five ");
        nik.put(5 , " six ");

        System.out.println(nik);
        nik.remove(3);
        System.out.println(nik);

    }
}
