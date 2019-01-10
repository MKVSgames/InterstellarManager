package com.games.mkvs.interstellarmanager.web.repositories.base;

import com.games.mkvs.interstellarmanager.models.World;
import com.games.mkvs.interstellarmanager.web.contracts.GetHandler;
import com.games.mkvs.interstellarmanager.web.contracts.PostHandler;

import java.util.List;

public interface WorldRepository {

    void getAllWorlds(GetHandler handler);

    void getWorldById(GetHandler handler);

    void createWorld(PostHandler handler, String newWorldJson);
}
