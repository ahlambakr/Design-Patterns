public class AussieBurgerResturant extends Resturant{
    @Override
    public Burger CreateObject() {
        return new AussieBurger();
    }
}
