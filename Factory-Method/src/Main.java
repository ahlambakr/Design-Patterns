//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      Resturant order1 = new BeefBurgerResturant() ;
      Burger beefburger = order1.CreateObject();

        Resturant order2 = new AussieBurgerResturant() ;
        Burger assieburger = order2.CreateObject();


    }
}