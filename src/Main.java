public class Main {
    public static void main(String[] arg){
        Calculator calc = Calculator.instance.get();// Зачем гет?
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.devide.apply(a, b);//Калькулятор не умеет делить на нуль
        int abs= calc.abs.apply(-7);
        calc.println.accept(c);
        calc.println.accept(abs);
    }
}
