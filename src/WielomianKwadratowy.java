public class WielomianKwadratowy {
    double x2,x1,wolny;
    WielomianKwadratowy(){
        x2=0;
        x1=0;
        wolny=0;
    }
    WielomianKwadratowy(double x2, double x1, double wolny){
        this.x2=x2;
        this.x1=x1;
        this.wolny=wolny;
    }
    public String toString(){
        String drugi=""+x1;
        String trzeci=""+wolny;
       if(x1>0){
           drugi="+"+x1;
       }
       if(wolny>0){
           trzeci="+"+wolny;
       }
       return ""+x2+"x²"+drugi+"x"+trzeci;
    }
    public WielomianKwadratowy dodawanie(WielomianKwadratowy w){
        return new WielomianKwadratowy(x2+w.x2,x1+w.x1,+wolny+w.wolny);
    }
    public String miejscaZerowe(){
        double delta=Math.pow(x1,2)-4*x2*wolny;
        if(delta>0){
        double pierwiastek1=(-x1+Math.sqrt(delta))/2*x2;
        double pierwiastek2=(-x1-Math.sqrt(delta))/2*x2;
        return "Pierwszy pierwiastek: "+pierwiastek1+" Drugi pierwiastek: "+pierwiastek2;
        }
        else if(delta==0){
            double pierwiastek=-x1/(2*x2);
            return "Pierwiastek: "+pierwiastek;
        }
        else{
            return "Brak pierwiastków";
        }
    }
}
