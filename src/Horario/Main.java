package src.Horario;
public class Main
{
    public static void main (String[] args)
    {
        try
        {
            Horario agora = new Horario ((byte)8,(byte)23,(byte)30);
            System.out.println(agora);
            agora.avance((short)18000);
            System.out.println (agora);
            agora.retroceda((short)25000);
            System.out.println (agora);
        }
        catch (Exception erro)
        {
            System.err.println (erro.getMessage());
        }
    }
}