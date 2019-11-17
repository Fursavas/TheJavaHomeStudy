package Day26_JavaExceptionTest;

public class JavaExceptionTest {

    public static void main0(String[] args) {
        throw new ArithmeticException();
    }

////Options: Answer is 1.
////1. RuntineException:java.lang.ArithmeticExcetion
////2. RuntineException:/ by zero
////3. RuntineException:java.lang.ArithmeticExcetion:/ by zero
////4. RuntineException:ArithmeticExcetion


//    static ArithmeticException ae = new ArithmeticException();
//
//    public static void main1(String[] args) {
//
//        throw ae;
//    }
////Options: Answer 1.
////1. RuntineException:java.lang.ArithmeticExcetion
////2. RuntineException:/ by zero
////3. RuntineException:java.lang.ArithmeticExcetion:/ by zero
////4. RuntineException:ArithmeticExcetion
//


    static ArithmeticException ae;

    public static void main2(String[] args) {
        throw ae;

    }
//Options:
//1. RuntineException:java.lang.ArithmeticExcetion
//2. RuntineException:NullPointerException
//3. No Output
//4. RuntineException:ArithmeticExcetion


    public static void main3(String[] args) {
////        System.out.println("Hello TECHNO"); // should be like this
        throw new ArithmeticException("/ by zero");
//        System.out.println("Hello TECHNO"); // should go upper
    }
////Options:
////1. Run-time Exception
////2. Compile-time error
////3. No Output
////4. Compile-time Exception


    public static void main(String[] args) {

//        throw new TECHNO();
//        System.out.println("Hello TECHNO"); // should go upper
    }
////Options:
////1. Run-time Exception
////2. Compile-time error
////3. No Output
////4. Compile-time Exception


    static class Test {
        void m1() throws ArithmeticException {
            throw new ArithmeticException("Calculation error");
        }

        void m2() throws ArithmeticException {
            m1();
        }

        void m3() {
            try {
                m2();
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException");
            }
        }

        public static void main(String args[]) {
            Test t = new Test();
            t.m3();
            System.out.println("Handled by TECHNO");
        }
    }

    ////Options:
////1. Calculation error
////2. ArithmeticException
////3. Handled by TECHNO
////4. ArithmeticException Handled by TECHNO
//
    static class Test1 {
        void method1() throws ArithmeticException {
            throw new ArithmeticException("Calculation error");
        }

        void method2() throws ArithmeticException {
            method1();
        }

        void method3() {
            try {
                method2();
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException");
                System.out.println(e.getMessage());
            }
        }

        public static void main(String args[]) {
            Test1 t = new Test1();
            t.method3();
            System.out.println("Handled by TECHNO");
        }
    }


}