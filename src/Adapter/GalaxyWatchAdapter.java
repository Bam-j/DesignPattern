package Adapter;

public class GalaxyWatchAdapter extends GalaxyWatch implements GalaxyWatchInterface {
    public GalaxyWatchAdapter(){
        System.out.println("아이폰에 갤럭시워치 연결");
    }

    @Override
    public void galaxyFitness() {
        super.galaxyFitness();
    }
}
