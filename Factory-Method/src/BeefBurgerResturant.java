public class BeefBurgerResturant extends Resturant{
    @Override
    public Burger CreateObject() {
        return new BeefBurger() ;
    }
}
