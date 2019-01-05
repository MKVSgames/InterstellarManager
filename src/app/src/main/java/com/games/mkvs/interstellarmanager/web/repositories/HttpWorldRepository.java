package com.games.mkvs.interstellarmanager.web.repositories;

import com.games.mkvs.interstellarmanager.web.contracts.GetHandler;
import com.games.mkvs.interstellarmanager.web.contracts.IHttpRequester;
import com.games.mkvs.interstellarmanager.web.contracts.PostHandler;
import com.games.mkvs.interstellarmanager.web.repositories.base.WorldRepository;

/**
 * Created by Martin on 1.1.2019 г..
 */

public class HttpWorldRepository implements WorldRepository{

    private final IHttpRequester mHttpRequester;
    private final String mServerUrl;

    public HttpWorldRepository(String serverUrl, IHttpRequester httpRequester) {
        mServerUrl = serverUrl;
        mHttpRequester = httpRequester;
    }

    @Override
    public void getAllWorlds(GetHandler handler) {
        mHttpRequester.get(handler,mServerUrl/*put some root mapping here*/);
    }

    @Override
    public void getWorldById(GetHandler handler) {
       mHttpRequester.get(handler,mServerUrl/*put some root mapping here*/);
    }

    @Override
    public void createWorld(PostHandler handler, String newWorldJson) {
        mHttpRequester.post(handler,mServerUrl+"/worlds",newWorldJson);
    }
}
