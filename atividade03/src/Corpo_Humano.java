public class Corpo_Humano {
    private double massa;
    private double volume;
    private double densidade;
    private double altura;
    private double imc;
    

    public Corpo_Humano(){

    }
    
    public Corpo_Humano(double massa, double volume, double altura){
        this.massa = massa;
        this.volume = volume;
        densidade = massa/volume;
        this.altura = altura;
        imc = massa/altura/altura;
    }

    public void setMassa(double massa){
        this.massa = massa;
        densidade = massa/volume;
        imc=massa/altura/altura;
    }

    public void setVolume(double volume){
        this.volume = volume;
        densidade = massa/volume;
    }

    public void setAltura(double altura){
        this.altura= altura;
        imc=massa/altura/altura;
    }

    public double getImc(){
        return imc;
    }
    public double getMassa(){
        return massa;
    }

    public double getVolume(){
        return volume;
    }

    public double getDensidade(){
        return densidade;
    }

    public double getAltura(){
        return altura;
    }

}