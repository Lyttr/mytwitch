package com.logicalshovel.mytwitch.external;


import com.logicalshovel.mytwitch.external.model.Clip;
import com.logicalshovel.mytwitch.external.model.Game;
import com.logicalshovel.mytwitch.external.model.Stream;
import com.logicalshovel.mytwitch.external.model.Video;
import com.logicalshovel.mytwitch.external.TwitchApiClient;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;


@Service
public class TwitchService {


    private final TwitchApiClient twitchApiClient;


    public TwitchService(TwitchApiClient twitchApiClient) {
        this.twitchApiClient = twitchApiClient;
    }


    public List<Game> getTopGames() {
        return twitchApiClient.getTopGames().data();
    }


    public List<Game> getGames(String name) {
        return twitchApiClient.getGames(name).data();
    }


    public List<Stream> getStreams(List<String> gameIds, int first) {
        return twitchApiClient.getStreams(gameIds, first).data();
    }


    public List<Video> getVideos(String gameId, int first) {
        return twitchApiClient.getVideos(gameId, first).data();
    }


    public List<Clip> getClips(String gameId, int first) {
        return twitchApiClient.getClips(gameId, first).data();
    }


    public List<String> getTopGameIds() {
        List<String> topGameIds = new ArrayList<>();
        for (Game game : getTopGames()) {
            topGameIds.add(game.id());
        }
        return topGameIds;
    }
}
