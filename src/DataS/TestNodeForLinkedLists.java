package DataS;

public class TestNodeForLinkedLists {
    public static void main(String[] args) {
        Ode OdeA = new Ode(6);
        Ode OdeB = new Ode(3);
        Ode OdeC = new Ode(4);
        Ode OdeD = new Ode(2);
        Ode OdeE = new Ode(1);

        OdeA.next = OdeB;
        OdeB.next = OdeC;
        OdeC.next = OdeD;
        OdeD.next = OdeE;

        System.out.println("This linked list's length is: (should print 5)");
        System.out.println(countOdes(OdeA));
    }

    private static int countOdes(Ode head) {
        // assuming that head != null
        int count = 1;
        Ode current = head;
        while (current.next != null) {

            System.out.println(current.data);
            current = current.next;
            count += 1;
        }
        return count;
    }
}

class Ode {
    int data;
    Ode next;
    Ode(int data) {
        this.data = data;
    }
}