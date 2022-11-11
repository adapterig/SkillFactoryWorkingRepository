package module27;

// конкретная имплементация интерфейса Terminal
public class TouchTerminal implements Terminal {
    @Override
    public void bill(int cost) {
        System.out.println("Touch Terminal billing " + cost);
    }
}
