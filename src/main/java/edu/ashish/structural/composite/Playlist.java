package edu.ashish.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Playlist implements IComponent {

    private String playlistName;

    private List<IComponent> children = new ArrayList<>();

    public Playlist(String playlistName) {
        this.playlistName = playlistName;
    }

    @Override
    public void play() {
        System.out.println();
        System.out.println("Playing playlist: " + playlistName);
        for(IComponent component : children) {
            component.play();
        }
    }

    @Override
    public void setPlaybackSpeed(float speed) {

        for(IComponent component : children) {
            component.setPlaybackSpeed(speed);
        }
    }

    @Override
    public String getName() {
        return playlistName;
    }

    public void add(IComponent component) {
        children.add(component);
    }

    public void remove(IComponent component) {
        children.remove(component);
    }
}
