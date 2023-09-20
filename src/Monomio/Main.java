package src.Monomio;

public class Main
{
    public static void main (String[] args)
    {
        try
        {
            Monomio m1 = new Monomio (7,2); // 7 x ao quadrado
            // Monomio m2 = new Monomio (3,0); // 3
            Monomio m3 = new Monomio (0,2); // 0
            Monomio m4 = new Monomio (4,2); // 4 x ao quadrado
            Monomio m5 = new Monomio (5,3); // 5 x ao cubo

            Monomio m6 = m1.mais(m4); // 11 x ao quadrado
            System.out.println (m6);  // printa 11x2

            Monomio m7 = m1.menos(m4); // 3 x ao quadrado
            System.out.println (m7);   // printa 3x2

            Monomio m8 = m4.vezes(m5); // 20 x elevado à quinta potência
            System.out.println (m8);   // printa 20x5

            Monomio m9 = m4.divididoPor(m5); // 0.8 x elevado a -1
            System.out.println (m9);         // printa 0,8x

            // 2 elevado a 3 vale 8. 5 vezes 8 vale 40.
            System.out.println (m5.aplicadoA(2)); // printa 40

            m4.divididoPor(m3);

            m4.mais(m5);

            m4.menos(m5);
        }
        catch (Exception erro)
        {
            System.err.println(erro.getMessage());
        }
    }
}