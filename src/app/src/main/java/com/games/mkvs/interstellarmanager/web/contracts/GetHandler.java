package com.games.mkvs.interstellarmanager.web.contracts;

import okhttp3.Call;
import okhttp3.Response;

/**
 * Created by Martin on 1.1.2019 г..
 */

public interface GetHandler {
    void handleGet(Call call, Response response);

    void handleError(Call call, Exception ex);
}
