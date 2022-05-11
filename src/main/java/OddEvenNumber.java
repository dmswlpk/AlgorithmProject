public class OddEvenNumber {
    /**
     * Создать алгоритм OddEven, который принимает на вход целое число, возвращает “Odd”,
     * если число нечетное, и “Even”, если число четное. Во всех остальных случаях результат будет “Undefined”.
     * <p>
     * Test Data:
     * -345 →  “Odd”
     * 0 →  “Even”
     * 222222 →  “Even”
     * 2147483647 + 1 →  “Undefined
     */


    public String oddEvenNumber(long n) {
        if (n <= Integer.MIN_VALUE || n >= Integer.MAX_VALUE) {

            return "Undefined";
        } else if (n % 2 == 0) {

                return "Even";
        } else {

                return "Odd";
            }
}
}
