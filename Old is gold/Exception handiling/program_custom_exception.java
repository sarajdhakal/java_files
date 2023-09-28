public class program_custom_exception extends Exception {
    public program_custom_exception(String str) {
        super(str);
    }

    static void age(int age) throws program_custom_exception {
        if (age < 18) {
            throw new program_custom_exception("Not");
        } else {
            System.out.println("Hi");
        }
    }

    public static void main(String args[]) {
        try {
            age(17);
        } catch (program_custom_exception e) {
            System.out.println("Hello: " + e);
        } finally {
            System.out.println("WHat's up");
        }
    }
}