public class Test {

    public void test() {
        String foo = nullableResponse();

        if (foo == null) {
            // do something
        } else {
            // do something
        }
    }

    private String nullableResponse() {
        return null;
    }
}
