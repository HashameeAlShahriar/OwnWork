import java.lang.*;
public class Drinks extends Food {

    private String Type;
    private int sizeInLitter;

    public Drinks(){
        

    }

    public Drinks(String name, String[] ingredients, double price, float calories, String type, int sizeInLitter){
        super(name,ingredients,price,calories);
        Type=type;
        this.sizeInLitter=sizeInLitter;
    }

    public void setType(String type){
        Type=type;
    }

    public String getType(){
        return Type;
    }

    public void setSize(int sizeInLitter){
        this.sizeInLitter=sizeInLitter;
    }

    public int getSize(){
        return sizeInLitter;
    }

    @Override
    public void showDetails(){
        System.out.println("Name :"+ getName());
        System.out.print("Ingredients :");
        for(String ingredient : getIngredients()){
            if(ingredient != null){
                System.out.println(ingredient + " ");
            }
        }
        System.out.println("Price :"+ getPrice());
        System.out.println("Calories :"+ getCalories());
        System.out.println("Type :"+ getType());
        System.out.println("Size :"+ getSize());

    }
    
}
