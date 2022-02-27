package com.example.project1.service;

import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

@Service
public class GameService {

    private static final String TOKEN = "Bearer rqtu70gt1l7utkvo45zyhwym5i1vyi";
    private static final String CLIENT_ID = "jc9w124hhrunx3drrwn7zhly963e7g";
    private static final String TOP_GAME_URL = "https://api.twitch.tv/helix/games/top?first=%s";
    private static final String GAME_SEARCH_URL_TEMPLATE = "https://api.twitch.tv/helix/games?name=%s";
    private static final int DEFAULT_GAME_LIMIT = 20;

    private String buildGameUrl(String url, String gameName, int limit) {
        if (gameName.equals("")) {
            return String.format(url, limit);
        } else {
            try {
                gameName = URLEncoder.encode(gameName, "UTF-8");
            } catch(UnsupportedEncodingException ex) {
                ex.printStackTrace();
            }
        }
    }
}
