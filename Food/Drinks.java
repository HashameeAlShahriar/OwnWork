import java.lang.*;

//create a sub class for food

public class Drinks extends Food {

    private String Type;
    private int sizeInLitter;

//default constractor
    
    Drinks(){

    }

    Drinks(String name, String[] ingredients, double price, float calories, String type, int sizeInLitter){

        super(name,ingredients,price,calories);
        Type = type;
        this.sizeInLitter = sizeInLitter;
    }

    public void setType(String type){
        Type = type;
    }

    public String getType(){
        return Type;
    }

    public void setSize(int sizeInLitter){
        this.sizeInLitter = sizeInLitter;
    }

    public int getSize(){
        return sizeInLitter;
    }


    @Override
    public void showDetails(){
        System.out.println("Drinks name: " + getName());

        System.out.print("Ingredints of this Drinks: ");
        for(String ingredient : getIngredients()){
            System.out.println(ingredient);

        }

        System.out.println("Price of Drinks: "+ getPrice());

        System.out.println("Calories in this Drinks :" + getCalories());

        System.out.println("Type of Drinks: "+ getType());

        System.out.println("Size of the Drinks: "+ getSize());
    }

    
}
