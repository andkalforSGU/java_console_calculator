public class Calculator {

    public Calculator(){}

    public int operation (int a, String operand, int b){
        int result = 0;
        switch(operand){
            case "+": result = a + b; break;
            case "-": result = a - b; break;
            case "*": result = a * b; break;
            case "/": result = a / b; break;
            default: break;
        }
        return result;
    }

    public int calculate(String[] splitExpr) throws CalculatorException {
        if (splitExpr[0].length() > 1 || splitExpr[2].length() > 1) throw new CalculatorException("ERROR: Число больше 10");//TODO: написать сообщение об ошибке числа больше 10
        else return operation(Integer.parseInt(splitExpr[0]), splitExpr[1], Integer.parseInt(splitExpr[2]));
    }
}
