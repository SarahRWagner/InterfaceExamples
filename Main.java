
/**
 * @author Sarah Wagner
 * @version 1.0
 * This is the driver class for finding Quadratic equations. It calls upon the Quadratic class to build Quadratic
 * objects. It asks for the real or complex roots, if the discriminant is negative or positive and what the first
 * derivative would be of the given equation.
 */
import java.util.*;
public class Main {

    public static void main(String[] args) {

        Quadratic equationOne = new Quadratic(); // build the default Quadratic class
        equationOne.getA(); // get the a value
        equationOne.setA(6.7); // set a to 6.7 instead
        equationOne.realOrComplexRoot(); // find if equationOne has real or complex roots


        Quadratic equationTwo = new Quadratic(4.0, 5.0, 6.0); // build this Quadratic class
        boolean realorComplex = equationTwo.realOrComplexRoot(); // stores the boolean value if the equation has real or complex roots
        boolean negativeOrPositive = equationTwo.negativeOrPositive(); // stores the boolean value if the discriminant is negative or positive
        double derivative = equationTwo.derivative(6); // stores the derivative value
        equationTwo.findComplexRoots(); // finds the roots of the given equation.
        equationTwo.findRealRoots();

        Quadratic equationThree = new Quadratic(6.0, 7.0, 6.0);
        Quadratic equationFour = new Quadratic(10, 5,4);

        int compareValue = equationTwo.compareTo(equationOne);

        ArrayList<Quadratic> equations =new ArrayList<Quadratic>();

        equations.add(equationOne);
        equations.add(equationTwo);
        equations.add(equationThree);
        equations.add(equationFour);

        Collections.sort(equations);



    } // end of main method
} // end of program
