package Facade;

public class CarFacade {
    MediaPlayer mediaPlayer = new MediaPlayer();
    Engine engine = new Engine();
    WindowControl windowControl = new WindowControl();

    public void turnOnAllSystem(){
        engine.engineOn();
        mediaPlayer.mediaPlayerOn();
        windowControl.windowOpen();
    }

    public void turnOffAllSystem(){
        windowControl.windowClose();
        mediaPlayer.mediaPlayerOff();
        engine.engineOff();
    }
}
