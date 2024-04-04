public class Corpo_Humano {
    private float massa;
    private float volume;
    private float densidade;
    private float altura;
    private float imc;

    public Corpo_Humano(){

    }
    
    public Corpo_Humano(float massa, float volume, float altura){
        this.massa = massa;
        this.volume = volume;
        densidade = massa/volume;
        this.altura = altura;
        imc = massa/altura * 2;
    }

    public void setMassa(float massa){
        this.massa = massa;
        densidade = massa/volume;
        imc=massa/altura*2;
    }

    public void setVolume(float volume){
        this.volume = volume;
        densidade = massa/volume;
    }

    public void setAltura(float altura){
        this.altura= altura;
        imc=massa/altura*2;
    }

    public float getImc(){
        return imc;
    }
    public float getMassa(){
        return massa;
    }

    public float getVolume(){
        return volume;
    }

    public float getDensidade(){
        return densidade;
    }

    public float getAltura(){
        return altura;
    }

    public void Calcular_IMC(float massa,  float altura){
        imc = massa/altura*2;
    }
}