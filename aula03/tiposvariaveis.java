
public class tiposvariaveis {
  public static void main(String[] args) 
  {
    int myNum = 5;               // integer (whole number)
    float myFloatNum = 5.99f;    // floating point number
    char myLetter = 'D';         // character
    boolean myBool = true;       // boolean
    String myText = "Hello";     // String    
    int numberOne = 10;
    int numberTwo = 44;
    float numberThree= 10.231f;
    float somaTotal = numberOne + numberTwo * numberThree;
    char moeda = '$';
    System.out.println(myNum);
    System.out.println(myFloatNum);
    System.out.println(myLetter);
    System.out.println(myBool);
    System.out.println(myText);
    System.out.println(somaTotal + moeda);


                                                    //In Java, there are two types of casting:
                                                    //Widening Casting (automatically) - converting a smaller type to a larger type size
                                                    //byte -> short -> char -> int -> long -> float -> double
                                                    //^ type que tem menos propriedades para o menor
                                                    //Narrowing Casting (manually) - converting a larger type to a smaller size type
                                                    //double -> float -> long -> int -> char -> short -> byte


    int myInt = 9;                                       //<----- convertendo uma variavel com menos propriedades para uma com mais propriedades. É automático! widening casting.
    double myDouble = myInt; // Automatic casting: int to double

    System.out.println(myInt);      // Outputs 9
    System.out.println(myDouble);   // Outputs 9.0    


    double myDoubleM = 9.78d;                                       //<-- convertendo uma variavel com mais propriedade para uma com menos. Nesse caso é Manual. Narrowing Casting.
    int myIntM = (int) myDoubleM; // Manual casting: double to int

    System.out.println(myDoubleM);   // Outputs 9.78
    System.out.println(myIntM);      // Outputs 9                         
  }
}
