/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liebreytortuga;

/**
 *
 * @author Usuario DAM
 */
public class Liebre extends Thread{
    private Carrera carrera;
    private int pasos;
    
    public Liebre(Carrera c){
        carrera = c;
        pasos = 1;
    }
    
    @Override
    public void run(){
        do{
            int aleatorio = (int) (Math.random() * 10);
            if(aleatorio < 2){
                try{
                    sleep(1000);
                }catch(InterruptedException e){}
            }
            else if(aleatorio < 4)
                pasos = carrera.LiebreMueve(9);
            else if(aleatorio < 5)
                pasos = carrera.LiebreMueve(-12);
            else if(aleatorio < 8)
                pasos = carrera.LiebreMueve(1);
            else
                pasos = carrera.LiebreMueve(-2);
        }while(pasos<70);
    }
    
}
