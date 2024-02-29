public abstract class Resturant {
    public Burger order() {
        Burger burger = CreateObject() ;
        burger.prepare();
        return  burger;
    }

    public abstract Burger CreateObject ();

}
