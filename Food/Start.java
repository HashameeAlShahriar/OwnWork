public class Start {
    public static void main(String[] args){
        Drinks d1= new Drinks("coke", new String[]{"Water","Suger"}, 15.00, 1, "Soft", 1);
        Burger b1= new Burger("Mutton Burgur", new String[]{"Cheese","Sauce","Tomato"}, 12.2, 2, 3);
        Pizza p1= new Pizza("Don", new String[]{"Dough","Cheese",}, 130, 1, 12);

        d1.showDetails();
        b1.showDetails();
        p1.showDetails();
    }
    
}
