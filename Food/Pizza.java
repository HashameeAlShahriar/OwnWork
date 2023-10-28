import java.lang.*;

public class Pizza extends Food {
    private int sizeInInches;

    Pizza(){

    }

    Pizza(String name, String[] ingredients, double price, float calories, int sizeInInches){

        super(name,ingredients,price,calories);

        this.sizeInInches = sizeInInches;

    }

    public void setSize(int sizeInInches){
        this.sizeInInches = sizeInInches;
    }

    public int getSize(){
        return sizeInInches;

    }

    @Override
    public void showDetails(){

        System.out.println("Pizza name: " + getName());

        System.out.print("Ingredints of this Pizza: ");
        for(String ingredient : getIngredients()){
            System.out.println(ingredient);

        }

        System.out.println("Price of Pizza: "+ getPrice());

        System.out.println("Calories in this Pizza:" + getCalories());

        System.out.println("Size of this Pizza: "+ getSize());
    }

    
}
