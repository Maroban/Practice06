package com.javaex.ex07;

public class SmartPhone extends MusicPhone {
    
    public void execute(String str){
        
        if("음악".equals(str)){
            playMusic();
        } else if("앱".equals(str)){
            app();
        } else {
        	super.execute(str);
        }
        
    }
    
    protected void app(){
        System.out.println("앱실행");
    }
    
    protected void playMusic(){
        System.out.println("다운로드해서 음악재생");
    }
 
    
    
    
    
}
