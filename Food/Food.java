import java.lang.*;

//create abstract superclass

public abstract class Food{

    private String name;
    private String ingredients[];
    private  double price;
    private float calories;

    
    
//default constractor

    Food(){

    }

//constractor with value

    Food(String name, String[] ingredients, double price, float calories){
        
        this.name = name;
        this.ingredients = ingredients;
        this.price = price;
        this.calories = calories;

    }

//set get method for all

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setIngredients(String[] ingredients){
        this.ingredients = ingredients;
    }

    public String[] getIngredients(){
        return ingredients;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public void setCalories(float calories){
        this.calories = calories;
    }

    public float getCalories(){
        return calories;
    }

 //add and remove item
 
    public void removeIngredient(String ingredient){
        for(int i=0; i<ingredients.length; i++){
            if(ingredients[i]==ingredient){
                ingredients[i]="";
            }
            break;

        }
    }

    public void addingIngredient(String ingredient){
        for(int i=0; i<ingredients.length;i++){
            if(ingredients[i]==null){
                ingredients[i]=ingredient;
            }
            break;
        }
    }

//create abstract method    

    abstract void showDetails();


}