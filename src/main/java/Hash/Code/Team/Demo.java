package Hash.Code.Team;

import java.util.HashSet;
import java.util.Set;

public class Demo {

    IntercomInterface simpleInterface;
    
    public static void main(String[] args) {

        Inhabitant i1 = new Inhabitant(111, 6666);
        Inhabitant i2 = new Inhabitant(222, 7777);
        Inhabitant i3 = new Inhabitant(333, 8888);
        Set<Inhabitant> inhabitants = new HashSet<Inhabitant>();
        inhabitants.add(i1);
        inhabitants.add(i2);
        inhabitants.add(i3);

        Intercom intercom = new Intercom(inhabitants);
        IntercomInterface intercomInterface = new IntercomInterface(intercom);
        intercomInterface.startInterface();
    }
    
    void addDemoInhabitants() {

    }

}
