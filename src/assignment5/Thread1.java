/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment5;

/**
 *
 * @author Akash
 */
public class Thread1 extends Thread {
    @Override
    public void run() {

    }
    
    public void playDoTone() {
        for(int i = 0; i < 100; i++) {
        FilePlayer.play("/Users/Akash/Downloads/Multithreading  Resources/Sounds/do.wav"); }
    }
    
    
    
    public void playMiTone() {
        for(int i = 0; i < 100; i++) {
        FilePlayer.play("/Users/Akash/Downloads/Multithreading  Resources/Sounds/mi.wav");}
    }
    
    
    
    public void playSolTone() {
        for(int i = 0; i < 100; i++) {
        FilePlayer.play("/Users/Akash/Downloads/Multithreading  Resources/Sounds/sol.wav");}
    }
    
    
    
    public void playSiTone() {
        for(int i = 0; i < 100; i++) {
        FilePlayer.play("/Users/Akash/Downloads/Multithreading  Resources/Sounds/si.wav");}
    }
    
    public void playDoOctaveTone() {
        for(int i = 0; i < 100; i++) {
        FilePlayer.play("/Users/Akash/Downloads/Multithreading  Resources/Sounds/do-octave.wav");}
    }
    
}
