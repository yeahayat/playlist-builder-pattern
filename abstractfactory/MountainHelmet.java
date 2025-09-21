package abstractfactory;

public class MountainHelmet implements Helmet {
    @Override
    public void wear() {
        System.out.println("Wearing a mountain helmet!");
    }
}
