import java.lang.*;
import java.util.*;
public class Start{
    public static void main(String[]args){
        Scanner d1 = new Scanner(System.in);

       // d1.nextLine();
        System.out.print("Enter The name: ");
        
        String a=d1.nextLine();

        //d1.nextLine();
        System.out.print("Enter Ingredients :");
        
        String b=d1.nextLine();

        System.out.print("Enter Price :");
        double c=d1.nextDouble();

        System.out.print("Enter Calories :");
        float d=d1.nextFloat();

        System.out.print("Enter Type:");
        d1.nextLine();
        String e=d1.nextLine();

        System.out.print("Enter Size:");
        int f=d1.nextInt();

        Drinks d2 = new Drinks();
        d2.setName(a);
        d2.addIngredient(b);
        d2.setPrice(c);
        d2.setCalories(d);
        d2.setType(e);
        d2.setSize(f);

        d2.showDetails();
    }
}