package com.games.mkvs.interstellarmanager.web.contracts;

/**
 * Created by Martin on 1.1.2019 г..
 */

public interface IHttpRequester {
    void get(final GetHandler handler, String url);

    void post(final PostHandler handler, String url, String bodyText);
}
