public class Calculator {

    public Object addition(Object firstNum, Object secondNum) {
        System.out.print("Суммируем " + firstNum + " и "+ secondNum);
        int result = (Integer)firstNum + (Integer)secondNum;
        System.out.println(" = " + result);
        return result;
    }
    public Object subtraction(Object firstNum, Object secondNum) {
        System.out.print("Вычитаем " + firstNum + " из "+ secondNum);
        int result = (Integer)firstNum - (Integer)secondNum;
        System.out.println(" = " + result);
        return result;
    }
    public Object multiplication(Object firstNum, Object secondNum) {
        System.out.print("Умножаем " + firstNum + " на "+ secondNum);
        int result = (Integer)firstNum * (Integer)secondNum;
        System.out.println(" = " + result);
        return result;
    }
    public Object division(Object firstNum, Object secondNum) {
        System.out.print("Делим " + firstNum + " на "+ secondNum);
        int result = (Integer)firstNum / (Integer)secondNum;
        System.out.println(" = " + result);
        return result;
    }
}
