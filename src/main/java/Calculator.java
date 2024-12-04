public class Calculator {

    /**
     * Adds two integers and returns the result.
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Subtracts the second integer from the first and returns the result.
     */
    public int dif(int a, int b) {
        return a - b;
    }

    /**
     * Divides the first integer by the second and returns the result.
     */
    public int div(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new IllegalArgumentException("You can't divide by zero");
        }
    }

    /**
     * multiply the first integer by the second and returns the result.
     */
    public int times(int a, int b) {
        return a * b;
    }

    /**
      Solves a mathematical expression using the provided methods.
     */
    public int solver(int a, int b, int c, int d) {
        return add(div(times(a, b), c), d);
    }
}
