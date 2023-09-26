/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
    private int idPneu;
    private String modelo;
    private double indiceDeVida;
    private char estado;
    private int horasDeUso;
    
    
    public Main(int idPneu, String modelo,int indiceDeVida){
        this.idPneu = idPneu;
        this.modelo = modelo;
        this.indiceDeVida = indiceDeVida;
        this.estado = 'N';
        this.horasDeUso = 0;
    }
    public boolean desgastar(int horaInicial, int horaFinal){
        if(this.estado == 'N' || this.estado == 'U'){
            double desgaste = (horaFinal - horaInicial) * 60 * 0.12345;
            this.horasDeUso += (horaFinal - horaInicial);
            this.indiceDeVida -= desgaste;
            if(this.estado == 'N'){
                this.estado = 'U';
            }
            if(this.indiceDeVida <= 0){
                this.estado = 'F';
            }
            return true;
        }
        else{
            return false;
        }
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public int getId(){
        return this.idPneu;
    }
    public double getIndiceDeVida(){
        return this.indiceDeVida;
    }
    public String getModelo(){
        return this.modelo;
    }
    public int getEstado(){
        return this.estado;
    }
    public int getHorasDeUso(){
        return this.horasDeUso;
    }
	public static void main(String[] args) {
		Main main = new Main(1, "Cantu", 110);
	    System.out.printf("Indice de vida:%.1f\nHoras de uso:%d\nestado do pneu:%c \n", main.getIndiceDeVida(),
                                                                                      main.getHorasDeUso(),
                                                                                      main.getEstado());
        boolean primeiroDesgaste = main.desgastar(4,14);
        if(primeiroDesgaste){
             System.out.printf("\nIndice de vida:%.1f\nHoras de uso:%d\nestado do pneu:%c \n", main.getIndiceDeVida(),
                                                                                      main.getHorasDeUso(),
                                                                                      main.getEstado());
        }
        else{
            System.out.println("Pneu fora de Uso");
        }
        boolean segundoDesgaste = main.desgastar(15,20);
        if(segundoDesgaste){
            System.out.printf("\nIndice de vida:%.1f\nHoras de uso:%d\nestado do pneu:%c \n", main.getIndiceDeVida(),
                                                                                      main.getHorasDeUso(),
                                                                                      main.getEstado());
        }
        else{
            System.out.println("Pneu fora de Uso");
        }
        boolean terceiroDesgaste = main.desgastar(21,23);
        if(terceiroDesgaste){
            System.out.printf("\nIndice de vida:%.1f\nHoras de uso:%d\nestado do pneu:%c \n", main.getIndiceDeVida(),
                                                                                      main.getHorasDeUso(),
                                                                                      main.getEstado());
        }
        else{
            System.out.println("Pneu fora de Uso");
        }

	}
}
/*public class Pneu{
    private int idPneu;
    private String modelo;
    private double indiceDeVida;
    private char estado;
    private int horasDeUso;
    
    
    public Pneu(int idPneu, String modelo,int indiceDeVida){
        this.idPneu = idPneu;
        this.modelo = modelo;
        this.indiceDeVida = indiceDeVida;
        this.estado = 'N';
        this.horasDeUso = 0;
    }
    public boolean desgastar(int horaInicial, int horaFinal){
        if(this.estado == 'N' || this.estado == 'U'){
            int desgaste = (horaFinal - horaInicial) * 60 * 0.12345;
            this.horasDeUso += (horaFinal - horaInicial);
            this.indiceDeVida -= desgaste;
            if(this.estado == 'N'){
                this.estado = 'U';
            }
            if(this.indiceDeVida <= 0){
                this.estado = 'F';
            }
            return true;
        }
        else{
            return false;
        }
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public int getId(){
        return this.idPneu;
    }
    public int getIndiceDeVida(){
        return this.indiceDeVida;
    }
    public String getModelo(){
        return this.modelo;
    }
}
*/
