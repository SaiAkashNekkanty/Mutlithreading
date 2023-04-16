/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment5;

/**
 *
 * @author Akash
 */
public class Thread2 extends Thread {
    public void run() {
       
    }
        
    
    public void playReTone() {
        for(int i = 0; i < 100; i++) {
        FilePlayer.play("/Users/Akash/Downloads/Multithreading  Resources/Sounds/re.wav"); }
    }
    
    
    
    public void playFaTone() {
        for(int i = 0; i < 100; i++) {
        FilePlayer.play("/Users/Akash/Downloads/Multithreading  Resources/Sounds/fa.wav");}
    }
    
    
    
    public void playLaTone() {
        for(int i = 0; i < 100; i++) {
        FilePlayer.play("/Users/Akash/Downloads/Multithreading  Resources/Sounds/la.wav");}
    }
   
    
    public void playDoOctaveTone() {
        for(int i = 0; i < 100; i++) {
        FilePlayer.play("/Users/Akash/Downloads/Multithreading  Resources/Sounds/do-octave.wav");}
    }
    
}
