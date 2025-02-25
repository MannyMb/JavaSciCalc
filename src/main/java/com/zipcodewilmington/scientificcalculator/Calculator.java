package com.zipcodewilmington.scientificcalculator;

public class Calculator {
    private static double state = 0;
    private static double stored = 0; 
    public static void topMenu() {
        int input;
        //Display options to select mathematical operation
        Console.println("Select the type of mathematical operation to perform");
        Console.println("1: Basic");
        Console.println("2: Scientific");
        input = Console.getIntegerInput("Enter number for menu options");

        if (input ==1) {
            basicOptionsMenu();
        } if (input == 2) {
            scientificOptionsMenu();
        } else if (input != 1 && input != 2) {
            Console.getIntegerInput("Please try again...Enter a number from the menu options \n>");
            topMenu();
        }
    // Console.println("Put in a number!");
    }

    public static void setStored(double valueToStore){
        stored = valueToStore;
    }

    public static void setState(double valueToStore){
        state = valueToStore;
    }

    public static double getState(){
        return state;
    }

    public static double getStored(){
        return stored;
    }


    public static void basicOptionsMenu(){
        int input;

        Console.println("1: Addition");
        Console.println("2: Subtraction");
        Console.println("3: Multiplication");
        Console.println("4: Division");
        Console.println("5: More Functions");
        Console.println("6: Return to Top Menu");

        input = Console.getIntegerInput("Enter number for menu option");
        int inputA;
        int inputB;

        switch (input) {
            case 1:
                inputA = Console.getIntegerInput("First number");
                inputB = Console.getIntegerInput("Second number");
                Double sum = BasicFunctions.addIt(inputA, inputB);
                Console.println(sum.toString());
                state = sum;
                basicOptionsMenu();
                break;
            case 2:
                inputA = Console.getIntegerInput("First number");
                inputB = Console.getIntegerInput("Second number");
                Double differ = BasicFunctions.subtractIt(inputA, inputB);
                Console.println(differ.toString());
                state = differ;
                basicOptionsMenu();
                break;
            case 3:
                inputA = Console.getIntegerInput("First number");
                inputB = Console.getIntegerInput("Second number");
                Double product = BasicFunctions.multiplyIt(inputA, inputB);
                Console.println(product.toString());
                state = product;
                basicOptionsMenu();
                break;
            case 4:
                inputA = Console.getIntegerInput("First number");
                inputB = Console.getIntegerInput("Second number");
                if(inputA == 0 || inputB == 0){
                    Console.println("ERR");
                } else {
                    Double quotient = BasicFunctions.divideIt(inputA, inputB);
                    Console.println(quotient.toString());
                    state = quotient;
                }
                basicOptionsMenu();
                break;
            case 5:
                moreFunctionsMenu();
            default:
                topMenu();

        }
    }
    public static void moreFunctionsMenu() {
        //more advanced functions with exponents and whatnot
        int input;

        Console.println("1: Exponent");
        Console.println("2: Square");
        Console.println("3: Square Root of()");
        Console.println("4: Inverse");
        Console.println("5: Flip It");
        Console.println("6: Return to Basic");

        input = Console.getIntegerInput("Enter number for menu option");

        int inputA;
        int inputB;
        int inputC;
        int inputD;


        switch (input) {
            case 1:
                inputA = Console.getIntegerInput("Base number");
                inputB = Console.getIntegerInput("To the Power of");
                Double power = BasicFunctions.powerExponent(inputA, inputB);
                Console.println(power.toString());
                state = power;
                break;
            case 2:
                inputA = Console.getIntegerInput("Base number");
                Double square = BasicFunctions.squareIt(inputA);
                Console.println(square.toString());
                state = square;
                break;
            case 3:
                inputC = Console.getIntegerInput("Square Root of");
                Double sqrt = BasicFunctions.squareRootIt(inputC);
                Console.println(sqrt.toString());
                state = sqrt;
                break;
            case 4:
                inputD = Console.getIntegerInput("Square Root of");
                Double inverse = BasicFunctions.inverseIt(inputD);
                Console.println(inverse.toString());
                state = inverse;
                break;
            case 5:
                inputA = Console.getIntegerInput("Square Root of");
                Double flip = BasicFunctions.changeSigns(inputA);
                Console.println(flip.toString());
                state = flip;
                break;
            default:
                basicOptionsMenu();

        }
    }
    public static void scientificOptionsMenu(){
        int input;

        Console.println("1: Trigonometry");
        Console.println("2: Factorials");
        Console.println("3: Logarithms");
        Console.println("4: Return to Top Menu");

        input = Console.getIntegerInput("Enter number from the menu option");

        //Double inputA = Console.getDoubleInput("First number");
        //Integer inputB = Console.getIntegerInput("First number");

        switch (input) {
            case 1:
                trigOptionsMenu();
                break;
            case 2:
                Integer inputB = Console.getIntegerInput("First number");
                Integer factorialValue = ScientificFunctions.getFactorial(inputB);
                Console.println(factorialValue.toString());
                state = factorialValue;
                scientificOptionsMenu();
                break;
            case 3:
                logOptionsMenu();
                break;
            case 4:
                topMenu();
                break;
            default:
                break;
        }
    }

    public static void trigOptionsMenu() {
        int trigSelector;

        Console.println("1: Sine");
        Console.println("2: Cosine");
        Console.println("3: Tangent");
        Console.println("4: Inverse Sine");
        Console.println("5: Inverse Cosine");
        Console.println("6: Inverse Tangent");
        Console.println("7: Return to Trigonometry Menu");

        trigSelector = Console.getIntegerInput("Enter a number from the Trigonometry menu");


        Double trigNumber;

        switch (trigSelector) {
            case 1:
                trigNumber = Console.getDoubleInput("First number");
                Double sineValue = ScientificFunctions.getSine(trigNumber);
                Console.println(sineValue.toString());
                state = sineValue;
                trigOptionsMenu();
                break;
            case 2:
                trigNumber = Console.getDoubleInput("First number");
                Double cosineValue = ScientificFunctions.getCosine(trigNumber);
                Console.println(cosineValue.toString());
                state = cosineValue;
                trigOptionsMenu();
                break;
            case 3:
                trigNumber = Console.getDoubleInput("First number");
                Double tangentValue = ScientificFunctions.getCosine(trigNumber);
                Console.println(tangentValue.toString());
                state = tangentValue;
                trigOptionsMenu();
                break;
            case 4:
                trigNumber = Console.getDoubleInput("First number");
                Double inverseSineValue = ScientificFunctions.getSine(trigNumber);
                Console.println(inverseSineValue.toString());
                state = inverseSineValue;
                trigOptionsMenu();
                break;
            case 5:
                trigNumber = Console.getDoubleInput("First number");
                Double inverseCosineValue = ScientificFunctions.getCosine(trigNumber);
                Console.println(inverseCosineValue.toString());
                state = inverseCosineValue;
                trigOptionsMenu();
                break;
            case 6:
                trigNumber = Console.getDoubleInput("First number");
                Double inverseTangentValue = ScientificFunctions.getCosine(trigNumber);
                Console.println(inverseTangentValue.toString());
                state = inverseTangentValue;
                trigOptionsMenu();
                break;
            case 7:
                trigOptionsMenu();
            default:
                topMenu();
        }
    }

    private static void logOptionsMenu() {
        int logSelector;

        Console.println("1: Log");
        Console.println("2: Natural Log");
        Console.println("3: Inverse Log");
        Console.println("4: Inverse Natural Log");
        Console.println("5: Return to Trigonometry Menu");

        logSelector = Console.getIntegerInput("Enter a number from the Trigonometry menu");


        Double logNumber;

        switch (logSelector) {
            case 1:
                logNumber = Console.getDoubleInput("First number");
                Double logValue = ScientificFunctions.getSine(logNumber);
                Console.println(logValue.toString());
                state = logValue;
                logOptionsMenu();
                break;
            case 2:
                logNumber = Console.getDoubleInput("First number");
                Double naturalLogValue = ScientificFunctions.getCosine(logNumber);
                Console.println(naturalLogValue.toString());
                state = naturalLogValue;
                logOptionsMenu();
                break;
            case 3:
                logNumber = Console.getDoubleInput("First number");
                Double inverseLogValue = ScientificFunctions.getCosine(logNumber);
                Console.println(inverseLogValue.toString());
                state = inverseLogValue;
                logOptionsMenu();
                break;
            case 4:
                logNumber = Console.getDoubleInput("First number");
                Double inverseNaturalLogValue = ScientificFunctions.getSine(logNumber);
                Console.println(inverseNaturalLogValue.toString());
                state = inverseNaturalLogValue;
                logOptionsMenu();
                break;
            case 5:
                trigOptionsMenu();

            default:
                topMenu();

        }
    }


}
