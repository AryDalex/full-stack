package models;

public class JavaClass {

    private int myInt = 0;
    private String myString = "Hello World";

    public JavaClass() { }

    public JavaClass(int myInt) { this.myInt = myInt; }

    public int getMyInt() {
        return myInt;
    }

    public void setMyInt(int arg){
        this.myInt = myInt;
    }

    public String getMyString() { return myString; }

    public void sum2numbers(){
        int a = 2;
        int b = 1;
        int sum = a + b;

        System.out.println(sum);
    }

    public void sum2numbers(int value){
        int a = value;
        int b = 1;
        int sum = a + b;

        System.out.println(sum);
    }

//    protected void sum2numbers(int value){
//        int a = value;
//        int b = 1;
//        int sim = a + b;
//
//        System.out.println(sum);
//    }

    // sem = models.JavaClass@63961c42
    // com = JavaClass{myInt=0myString=Hello World'}
    @Override
    public String toString() {
        return "JavaClass{" +
                "myInt=" + myInt +
                "myString=" + myString + '\'' +
                '}';
    }

//    @Override
//    public boolean equals(Object obj) {
//        return ;
//    }

}