public class Menu
{
    public static void Menu()
    {
        System.out.println("0 pour chiffrer");
        System.out.println("1 pour déchiffrer");
        System.out.print("Merci de tapper le numéro : ");
        Boolean ChiffrementDechiffrement = getChiffrementDechiffrement(WaitUserInput.WaitUserInput());
        System.out.println("Merci de tapper le text à ");
        if (ChiffrementDechiffrement)
        {
            System.out.print("chiffrer : ");
        }
        else
        {
            System.out.print("déchiffrer : ");
        }
        String Phrase = WaitUserInput.WaitUserInput();
        System.out.println("Merci de tapper la clef de rotation (Valeur numérique (ex : 16)) : ");
        String clef    = WaitUserInput.WaitUserInput();
        int    clefNum = 0;
        if (IsNumeric(clef))
        {
            clefNum = Integer.valueOf(clef);
        }
        System.out.println("");
        System.out.println("Fin : ");
        System.out.println("");
        System.out.println(RotateText.RotateText(Phrase, clefNum, ChiffrementDechiffrement));
    }

    public static Boolean getChiffrementDechiffrement(String ChiffrementDechiffrement)
    {
        if (IsNumeric(ChiffrementDechiffrement))
        {
            if (Integer.valueOf(ChiffrementDechiffrement) == 0)
            {
                return true;
            }
            else if (Integer.valueOf(ChiffrementDechiffrement) == 1)
            {
                return false;
            }
        }
        return false;
    }

    public static boolean IsNumeric(String Valeur)
    {
        if (Valeur == null || Valeur.equals(""))
        {
            System.out.println("Valeur impossible à vérifier (soit null soit vide)");
            return false;
        }

        try
        {
            int i = Integer.parseInt(Valeur);
            return true;
        }
        catch (NumberFormatException e)
        {
            System.out.println(e.getStackTrace());
        }
        return false;
    }
}