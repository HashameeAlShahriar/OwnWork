import java.lang.*;

public class HappyBirthday {

    public static void main(String[] args) {

        for (int r = 1; r <= 5; r++) {
            String message = "HAPPY";
            for (int i = 0; i < message.length(); i++) {
                char letter = message.charAt(i);

                // Add spaces between letters for readability
                if (i > 0) {
                    System.out.print("   ");
                }

                // Print each letter
                switch (letter) {
                    case 'H':
                        for (int c = 1; c <= 5; c++) {
                            if (c == 1 || r == 3 || c == 5) {
                                System.out.print(" *");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        break;

                    

                    case 'P':
                        for (int c = 1; c <= 5; c++) {
                            if (c==1 || r==1 || r==3 || (c==5 & r<=3)) {
                                System.out.print(" *");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        break;

                    case 'Y':
                        
                        for(int c=1;c<=5;c++){
                            if((r==c&r<=3)||(r+c==6 & r<=3)|| (c==3)){
                                System.out.print(" *");
                            }
                            else{
                                System.out.print("  ");
                            }
                        }
                        break;

                    case 'A':
                        for (int c = 1; c <= 5; c++) {
                            if (r==1||c==5||r==3||c==1) {
                                System.out.print(" *");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        break;
                }
            }
            System.out.println(); // Move to the next line for the next section
        }
        System.out.println("    ");

         int k = 1;


        for (int r = 1; r <= 5; r++) {
            String message = "BIRTHDAY";
            for (int i = 0; i < message.length(); i++) {
                char letter = message.charAt(i);

                // Add spaces between letters for readability
                if (i > 0) {
                    System.out.print("   ");
                }

                // Print each letter
                switch (letter) {
                    case 'H':
                        for (int c = 1; c <= 5; c++) {
                            if (c == 1 || r == 3 || c == 5) {
                                System.out.print(" *");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        break;

                    

                    case 'B':
                     for(int c=1;c<=5;c++){
                        if(c==1||(r==1&c<=4)||r==3||(r==5&c<=4)||((r>=2&r<=4)&c==5)){
                            System.out.print(" *");
                        }
                        else{
                            System.out.print("  ");
                        }
                     }
                        break;
                    case 'I':
                        
                     for (int c = 1; c <= 3; c++) {
                        if (r == 1 || r == 5 || c == 2) {
                          System.out.print(" *");
                        } else {
                          System.out.print("  ");
                        }
                      }
                        break;   
                        
                    case 'R':
                     
                     for (int c = 1; c <= 4; c++) {
                        if (c == 1 || r == 1 || r == 3 || (c == 4 && r <= 2) || (r + c == k)) {
                            System.out.print(" *");
                        } else {
                            System.out.print("  ");
                        }
                     }
                     k += 2; 
    
                        break;   
                        
                    case 'T':
                        
                     for (int c = 1; c <= 5; c++) {
                        if (r == 1 || c == 3) {
                          System.out.print(" *");
                         }
                         else {
                          System.out.print("  ");
                        }
                      }
                        break;    
                        
                    case 'D':
                        
                     for(int c=1;c<=5;c++){
                        if(c==1||(r==1&c<=4)||(r==5&c<=4)||((r>=2&r<=4)&c==5)){
                            System.out.print(" *");
                        }
                        else{
                            System.out.print("  ");
                        }
                     }
                        break;    

                    case 'Y':
                        
                        for(int c=1;c<=5;c++){
                            if((r==c&r<=3)||(r+c==6 & r<=3)|| (c==3)){
                                System.out.print(" *");
                            }
                            else{
                                System.out.print("  ");
                            }
                        }
                        break;

                    case 'A':
                        for (int c = 1; c <= 5; c++) {
                            if (r==1||c==5||r==3||c==1) {
                                System.out.print(" *");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        break;
                }
            }
            System.out.println(); // Move to the next line for the next section
        }
        System.out.println("    ");




        for (int r = 1; r <= 5; r++) {
            String message = "MOHONA";
            for (int i = 0; i < message.length(); i++) {
                char letter = message.charAt(i);

                // Add spaces between letters for readability
                if (i > 0) {
                    System.out.print("   ");
                }

                // Print each letter
                switch (letter) {
                    case 'M':
                        for (int c = 1; c <= 5; c++) {
                            if (c == 1 || c == 5 || (c + r == 6 && r <= 3) || (r == c && r <= 2)) {
                                System.out.print(" *");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        break;

                    case 'O':
                        for (int c = 1; c <= 5; c++) {
                            if ((r == 1 && c >= 2 && c <= 4) || (c == 1 && r >= 2 && r <= 4) || (c == 5 && r >= 2 && r <= 4) || (r == 5 && c <= 4 && c >= 2)) {
                                System.out.print(" *");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        break;

                    case 'H':
                        for (int c = 1; c <= 5; c++) {
                            if (c == 1 || r == 3 || c == 5) {
                                System.out.print(" *");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        break;

                    case 'N':
                        int a = 2;
                        for (int c = 1; c <= 5; c++) {
                            if (c==1||c==5||c+r==a) {
                                System.out.print(" *");
                            } else {
                                System.out.print("  ");
                            }
                            a=a+2;
                        }
                        break;

                    case 'A':
                        for (int c = 1; c <= 5; c++) {
                            if (r==1||c==5||r==3||c==1) {
                                System.out.print(" *");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        break;
                }
            }
            System.out.println(); // Move to the next line for the next section
        }


         //HEART_SHAPE
         for(int i=1;i<=3;i++){
            for(int j=1;j<=15;j++){
                if((j>=4-i && j<=4+i)||(j>=12-i&&j<=12+i)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        for(int i =8;i>=1;i--){
            for(int j=1;j<=8-i;j++){
                System.out.print(" ");

            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
