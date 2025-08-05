public class Lesson1 {
    public static void main(String[] args){
        
        //Syntax 
        // datatype[] variable_name = new datatype[size];


        int[] rollNo = new int[5]; // rollNo reference variable is pointing to an array object that contains integer type



        //or directly
        int[] rollNo2 = {34, 4, 2, 5, 7};

        System.out.println("first roll No " + rollNo2[0]);

        int[] rollNo3; // Declaration: Only the reference variable is created in the stack (happened at compile time)
        rollNo3 = new int[6]; // Initialization: Memory creation. The array object is created in the heap. (happened at runtime -> Dynamic Memory Allocation)

        // new is used to create object at heap memory: dynamic memory allocation

    }
}
