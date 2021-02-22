package exercises;

//OVERLOADING CONSTRUCTORS 4.4

public class Scrap {
    private String message0 = "Hello World0";
    private String message1 = "Hello World1";
    private String message2 = "Hello World2";
    private String message3 = "Hello World3";


    public Scrap(String message0, String message1,
                 String message2, String message3) {
        this.message0 = message0;
        this.message1 = message1;
        this.message2 = message2;
        this.message3 = message3;
    }

    public Scrap(String message0, String message1, String message2) {
        this(message0, message1, message2, "BLANK3");
    }

    public Scrap(String message0, String message1) {
        this(message0, message1, "BLANK2", "BLANK3");
    }

    public Scrap(String message0) {
        this(message0, "BLANK1", "BLANK2", "BLANK3");
    }

    public Scrap() {
        this("BLANK0", "BLANK1", "BLANK2", "BLANK3");
    }

    public String getMessage0() { return message0; }
    public String getMessage1() { return message1; }
    public String getMessage2() { return message2; }
    public String getMessage3() { return message3; }

    public void setMessage0(String aMessage0) { message0 = aMessage0; }
    public void setMessage1(String aMessage1) { message1 = aMessage1; }
    public void setMessage2(String aMessage2) { message2 = aMessage2; }
    public void setMessage3(String aMessage3) { message3 = aMessage3; }

    public static void main(String[] args) {
        //Scrap test = new Scrap("Hello0blabla", "Hello1blabla", "Hello2See");
        Scrap test0 = new Scrap();
        System.out.println(test0.getMessage0() + " " + test0.getMessage1() + " " + test0.getMessage2() + " " + test0.getMessage3());



        Scrap test1 = new Scrap("AAAAA");
        test1.setMessage3("DDDDD");
        System.out.println(test1.getMessage0() + " " + test1.getMessage1() + " " + test1.getMessage2() + " " + test1.getMessage3());
        test1.setMessage2("CCCCC");
        System.out.println(test1.getMessage0() + " " + test1.getMessage1() + " " + test1.getMessage2() + " " + test1.getMessage3());
        //test1.setMessage2("AAAAA",null ,null, "DDDDD");
        //System.out.println(test1.getMessage0() + " " + test1.getMessage1() + " " + test1.getMessage2() + " " + test1.getMessage3());
        Scrap test2 = new Scrap("AAAAA", "BBBBB");
        System.out.println(test2.getMessage0() + " " + test2.getMessage1() + " " + test2.getMessage2() + " " + test2.getMessage3());
        Scrap test3 = new Scrap("AAAAA", "BBBBB", "CCCCC");
        System.out.println(test3.getMessage0() + " " + test3.getMessage1() + " " + test3.getMessage2() + " " + test3.getMessage3());
        Scrap test4 = new Scrap("AAAAA", "BBBBB", "CCCCC", "DDDDD");
        System.out.println(test4.getMessage0() + " " + test4.getMessage1() + " " + test4.getMessage2() + " " + test4.getMessage3());
    }

}



