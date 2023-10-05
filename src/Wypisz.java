public class Wypisz {
    public static void main(String[] args){
        WielomianKwadratowy obj,obj2,obj3;
        obj=new WielomianKwadratowy(5,-3,-20);
        obj2=new WielomianKwadratowy(4,2,5);
        obj3=obj.dodawanie(obj2);
        System.out.println(obj3);
        System.out.println(obj3.miejscaZerowe());
    }
}
