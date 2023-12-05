//import java.util.Arrays;


public class run {

    public static void main(String[] args) {
        boolean[] s_switch = { true, true };
        FactoryMethod.m_halfAdder(s_switch);
        System.out.println("Bulb 1: " + s_switch[0] + " Bulb 2: " + s_switch[1]);
        boolean[] t_array = { false, false, false };
        System.out.print("Array:");
        FactoryMethod.m_print_array(t_array);
        FactoryMethod.testArray(t_array);
        System.out.print("Array:");
        FactoryMethod.m_print_array(t_array);

    }
}
