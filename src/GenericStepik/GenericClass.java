package GenericStepik;

public class GenericClass<T extends java.lang.Number> {
    private T[] _array;

    GenericClass(T[] array) {
        _array = array;
    }

    public double max( ) {
        double maxNumber = _array[0].doubleValue();
        for (T i : _array) {
            if (maxNumber < i.doubleValue()) {
                maxNumber = i.doubleValue();
            }
        }
        return maxNumber;
    }

    public double sum( ) {
        double sumValue = 0;
        for (T i : _array) {
            sumValue += i.doubleValue();
        }
        return sumValue;
    }
}
