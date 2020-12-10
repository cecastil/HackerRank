public class JavaIfElse {
    public static void main(String[] args) {

        int value = 2;
        System.out.printf(javaIfElse(value));



    }
    public static String javaIfElse(int n){
        String word = null;

        if(n%2 == 1){
            word = "Weird";
        }
        else if(n%2 == 0){
            if(n>=2 && n<=5){
                word = "Not Weird";
            }
            else if(n>=6 && n<=20){
                word = "Weird";
            }
            else if(n > 20){
                word = "Not Weird";
            }

        }

        return word;
    }
}
