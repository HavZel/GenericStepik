package GenericStepik;

public class Main {

    public static void main(String[] args) {
        Double[] dArr = new Double[] {1.33, 4.12, 72.7, -32.0, 0.0};
        GenericClass<Double> dGeneric = new GenericClass<Double>(dArr);
        System.out.println("Double");
        System.out.println("\tMax: " + dGeneric.max());
        System.out.println("\tSum: " + dGeneric.sum());

        Integer[] iArr = new Integer[] {3, -4, 9, 16};
        GenericClass<Integer> iGeneric = new GenericClass<Integer>(iArr);
        System.out.println("Integer");
        System.out.println("\tMax: " + iGeneric.max());
        System.out.println("\tSum: " + iGeneric.sum());

    }
}
