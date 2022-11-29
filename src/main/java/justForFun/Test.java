package justForFun;


class Test{
    public void bla(String s){
        System.out.println("in string");
    }
    public void bla(Object s){
        System.out.println("in object");
    }
    public void kla(int n){
        System.out.println("in int");
    }
    public void kla(Integer n){
        System.out.println("in integer");
    }
    public void kla(Number n){
        System.out.println("in number");
    }
    public static void main(String[] args) {
        new Test().bla("ss");
        new Test().kla(12);

    }
}