import java.util.Scanner;

public class OutputFormatting {
    public static void main(String[] args) {

        Numbers n1 = new Numbers(123, 32, "Jaime");
        Numbers n2 = new Numbers(75,23,"Roberto");
        double presicion = 3.1416548754;

        System.out.printf("The values of the %s are:%n%s%n%%%n%s%n", n1.name,n1.getNum2(),n1.getNum1());
        System.out.printf("The values of the %s are:%n%s%n%%%n%s%n", n2.name,n2.getNum2(),n2.getNum1());

        System.out.println("Using precision in the printf");

        System.out.printf("%.1f%n",presicion); //to precision, use dot and the number of decimal that you want
        System.out.printf("%.4f%n",presicion); //you cannot to use precision with characters, int values.

        System.out.println("Using width in the printf"); //use width to define the number of spaces that have the statement

        System.out.printf("%4d%5d%n",123,546);
        System.out.printf("%3d%n",213);
        System.out.printf("%7.3f%n",213.54);//combine precision with width. the decimal separator counts as a space in the width

        System.out.printf("%-6d%s%n",213,"hola");//use the negative number in width, invert the order of the start spaces.
        //cannot use width with '%n' new line

        System.out.println("flags in 'printf'"); //work with all except %n new line
        System.out.printf("%-6o%d%n",213,23);//'-' flag use to star the object in the first space
        System.out.printf("%+3d%n",-213);//'+'flag guarantees that the symbol conserve or apper the plus symbol
        System.out.printf("%+3d%n",213);
        System.out.printf("% 3d%n",213);//space flag add one space before the object
        System.out.printf("%05d%n",213);//zero flag need to combine with width, and complete the empty space with zeros.
        System.out.printf("%06.1fx`%n",213.54);
        System.out.printf("%,5d%n",2013);//coma flag add one coma inside the values
        System.out.printf("%,7d%n",2001200);
        System.out.printf("%,015d%n",21356434);
        System.out.printf("%#o%n",21356434);//'#' flag add one zero before the number. only with %o, %x, %X, %e, %E, %f, %a, %A
        System.out.printf("%#.0f%n",21.2);//and # show the dot in the decimal or scientific notation.
        System.out.printf("%1$d%2$d%3$d%n",1,2,3);//using $, you can use the argument index
        System.out.printf("%2$d%2$d%3$d%n",1,2,3);
        System.out.printf("%1$d%2$d%d%n",1,2,3);
        System.out.printf("%1$d%<d%<d%n",1,2,3);
        System.out.printf("%1$d%2$d%<d%n",1,2,3);
        System.out.printf("%d%2$d%3$d%n",1,2,3);

        Scanner s1 = new Scanner(System.in);
        System.out.println("Input a name");
        String name = s1.nextLine();
        System.out.println("Input a number");
        int number = s1.nextInt();
        System.out.printf("%-15s%03d%n", name, number);






    }

    //For the format you can use %s to Strings or variables to objects, %n new line
    public static class Numbers{
        double num1;
        double num2;
        String name;

        public Numbers(double num1, double num2, String name){
            this.num1 = num1;
            this.num2 = num2;
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getNum1() {
            return num1;
        }

        public void setNum1(double num1) {
            this.num1 = num1;
        }

        public double getNum2() {
            return num2;
        }

        public void setNum2(double num2) {
            this.num2 = num2;
        }
    }
}
