public class Validator {

    public boolean romeDigits = false;

    public Validator() {}

    private boolean isDigit(String expr) throws NumberFormatException {
        try {
            Integer.parseInt(expr);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean isRomeDigit(String expr) {
        String[] romeDigits = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        for (String rd : romeDigits) {
            if (expr.equals(rd)) {
                return true;
            }
        }
        return false;
    }

    private boolean isOperand(String expr) {
        String operands = "+-*/";
        return expr.length() == 1 && operands.contains(expr);
    }

    public boolean isValidate(String[] splitExpr) throws CalculatorException{
        if (splitExpr.length == 3){
            if (this.isOperand(splitExpr[1])){
                if ((this.isDigit(splitExpr[0]) && this.isDigit(splitExpr[2])) ||
                (this.isRomeDigit(splitExpr[0]) && this.isRomeDigit(splitExpr[2]))) {
                    this.romeDigits = isRomeDigit(splitExpr[0]);
                    return true;
                }else{throw new CalculatorException("ERROR: Некорректный ввод чисел");}//TODO: написать сообщение об ошибке
            }else{throw new CalculatorException("ERROR: Отсутствует операнд");}
        }else{throw new CalculatorException("ERROR: Больше двух чисел в выражении");}
    }
}
