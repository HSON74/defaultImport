public class FactoryMethod {
    public static boolean m_Compare(int p_Num1, int p_Num2) {
        return (p_Num1 == p_Num2 ? Boolean.TRUE : Boolean.FALSE);
    }

    public static boolean m_and(boolean p_bool1, boolean p_bool2) {
        return p_bool1 && p_bool2;
    }

    public static boolean m_or(boolean p_bool1, boolean p_bool2) {
        return p_bool1 || p_bool2;
    }

    public static boolean m_not(boolean p_bool1) {
        return !p_bool1;
    }

    public static boolean m_nand(boolean p_bool1, boolean p_bool2) {
        return m_not(m_and(p_bool1, p_bool2));
    }

    public static boolean m_nor(boolean p_bool1, boolean p_bool2) {
        return m_not(m_or(p_bool1, p_bool2));
    }

    public static boolean m_xor(boolean p_bool1, boolean p_bool2) {
        boolean s_1_or_bool = m_or(p_bool1, p_bool2);
        boolean s_2_xor_bool = m_nand(p_bool1, p_bool2);
        return m_and(s_1_or_bool, s_2_xor_bool);
    }

    public static void m_halfAdder(boolean[] p_switch) {
        boolean s_1_bool = m_xor(p_switch[0], p_switch[1]);
        boolean s_2_bool = m_and(p_switch[0], p_switch[1]);
        p_switch[0] = s_1_bool;
        p_switch[1] = s_2_bool;
    }

    public static boolean m_fullAdder(boolean[] p_switch) {
        if(p_switch.length < 3;){
            return null;
        }
        return false;
    }

    public static void testArray(boolean[] p_test_array) {
        for (int i = 0; i < p_test_array.length; i++) {
            p_test_array[i] = true;
        }
    }

    public static void m_print_array(boolean[] p_test_array) {
        for (int i = 0; i < p_test_array.length; i++) {
            System.out.print(" " + p_test_array[i]);
        }
        System.out.println("");
    }
}
