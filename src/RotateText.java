public class RotateText
{
    public static String RotateText(String text, int amountOfRotation, Boolean Chiffrer)
    {
        String string = "";
        for (char lettre : text.toCharArray())
        {
            int temp = LettreToInt(lettre);
            if (Chiffrer)
            {
                temp += amountOfRotation;
            }
            else
            {
                temp -= amountOfRotation;
            }
            char NouvelleLettre = IntToLettre(temp);
            string += NouvelleLettre;
        }
        return string;
    }

    public static int LettreToInt(char Lettre)
    {
        return (int) Lettre;
    }

    public static char IntToLettre(int ValeurLettre)
    {
        return (char) ValeurLettre;
    }
}