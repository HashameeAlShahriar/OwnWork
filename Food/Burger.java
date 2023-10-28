import java.lang.*;

public class Burger extends Food {

    private int numberOfPatty;

    Burger(){

    }

    Burger(String name, String[] ingredients, double price, float calories, int numberOfPatty){
        super(name,ingredients,price,calories);
        this.numberOfPatty = numberOfPatty;
    }

    public void setNumberOfPatty(int numberOfPatty){
        this.numberOfPatty = numberOfPatty;
    }

    public int getNumberOfPatty(){
        return numberOfPatty;
    }

    @Override
    public void showDetails(){

        System.out.println("Burger name: " + getName());

        System.out.print("Ingredints of this Burger: ");
        for(String ingredient : getIngredients()){
            System.out.println(ingredient);

        }

        System.out.println("Price of Burger: "+ getPrice());

        System.out.println("Calories in this Burger :" + getCalories());

        System.out.println("Number of Patty in this Burger: "+ getNumberOfPatty());
    }
    
}
