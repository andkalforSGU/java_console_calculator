import java.util.Scanner;

public class Main  {
    public static void main(String[] args) throws Exception {
        //читаем
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the expression\n> ");
        String expr = scanner.nextLine();

        //сплитим
        String[] splitExpr = expr.trim().split("\\s+");

        //валидим
        Validator validator = new Validator();
        if (validator.isValidate(splitExpr)){
            if (validator.romeDigits){
                RomeTranslator romeTranslator = new RomeTranslator();
                splitExpr = romeTranslator.translateFromRomeToArabic(splitExpr);
            }
            //считаем
            Calculator calculator = new Calculator();
            int result = calculator.calculate(splitExpr);
            //выводим
            if (validator.romeDigits){
                //обратный перевод
                RomeTranslator romeTranslator = new RomeTranslator();
                String romeResult = romeTranslator.translateFromArabicToRome(result);
                System.out.println(romeResult);
            } else {
                System.out.println(result);
            }
        }
    }
}
