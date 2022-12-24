
/**
 *
 * @author 4715
 */
class Mahasiswa <T,U,V> {
     //T Adalah Kepanjangan dari Tipe Parameter
    private T Nim;
    private U Name;
    private V Clas;
    
    //Method Void Set Dengan Tipe Parameter T
    protected void setNim(T Nim){
        this.Nim = Nim;
    }
    //Method Void Set Dengan Tipe Parameter U
    protected void setName(U Name){
        this.Name = Name;
    }
    //Method Void Set Dengan Tipe Parameter V
    protected void setClas(V Clas){
        this.Clas = Clas;
    }
    //Method Return Get Yang Mengembalikan Nilai
    protected T getNim(){
        return Nim;
    }
    protected U getName(){
        return Name;
    }
    protected V getClas(){
        return Clas;
    }
}
