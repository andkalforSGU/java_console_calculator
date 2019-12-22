//import com.sun.tools.javac.util.Pair;

//import java.util.Map;

public class RomeTranslator {

    public RomeTranslator(){}

    public String romeUnitsToArabic(String romeDigit){
        String arabicDigit = "";
        switch (romeDigit) {
            case "I": arabicDigit = "1"; break;
            case "II": arabicDigit = "2"; break;
            case "III": arabicDigit = "3"; break;
            case "IV": arabicDigit = "4"; break;
            case "V": arabicDigit = "5"; break;
            case "VI": arabicDigit = "6"; break;
            case "VII": arabicDigit = "7"; break;
            case "VIII": arabicDigit = "8"; break;
            case "IX": arabicDigit = "9"; break;
            case "X": arabicDigit = "10"; break;
            default: break;
        }
        return arabicDigit;
    }

    public String[] translateFromRomeToArabic(String[] splitExpr) {
        String[] translated = new String[3];
        translated[1] = splitExpr[1];
        translated[0] = romeUnitsToArabic(splitExpr[0]);
        translated[2] = romeUnitsToArabic(splitExpr[2]);
        return translated;
    }

    public String arabicUnitsToRome(int arabicUnits){
        String romeUnits;
        switch (arabicUnits) {
            case 1: romeUnits = "I"; break;
            case 2: romeUnits = "II"; break;
            case 3: romeUnits = "III"; break;
            case 4: romeUnits = "IV"; break;
            case 5: romeUnits = "V"; break;
            case 6: romeUnits = "VI"; break;
            case 7: romeUnits = "VII"; break;
            case 8: romeUnits = "VIII"; break;
            case 9: romeUnits = "IX"; break;
            default: romeUnits = ""; break;
        }
        return romeUnits;
    }

    public String arabicTensToRome(int arabicTens){
        String romeTens = "";
        switch (arabicTens) {
            case 1: romeTens = "X"; break;
            case 2: romeTens = "XX"; break;
            case 3: romeTens = "XXX"; break;
            case 4: romeTens = "XL"; break;
            case 5: romeTens = "L"; break;
            case 6: romeTens = "LX"; break;
            case 7: romeTens = "LXX"; break;
            case 8: romeTens = "LXXX"; break;
            case 9: romeTens = "XC"; break;
            default: break;
        }
        return romeTens;
    }

    public String translateFromArabicToRome(int arabicResult){
        if (arabicResult == 100) return "C";
        else if (arabicResult < 10) return arabicUnitsToRome(arabicResult);
        else return arabicTensToRome(arabicResult / 10) + arabicUnitsToRome(arabicResult % 10);
    }
}
