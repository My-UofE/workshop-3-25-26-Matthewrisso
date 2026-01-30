public class NumbersInSpanish {
    public static void main(String[] args) {
        // read the first argument passed to the program
        int number = Integer.parseInt(args[0]); 
        String spanish_number = "";
        switch (number){
            case 1:
                spanish_number = "uno";
                break;
            case 2:
                spanish_number = "dos";
                break;
            case 3:
                spanish_number = "tres";
                break;
            case 4:
                spanish_number = "quatro";
                break;
            case 5:
                spanish_number = "cinco";
                break;
            default:
                spanish_number = "Sorry I do not know that!";
        }
    
        // delete the line below and replace with your code
        System.out.println(spanish_number);
    }
 }