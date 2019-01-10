package com.games.mkvs.interstellarmanager.web.repositories;

import com.games.mkvs.interstellarmanager.web.contracts.GetHandler;
import com.games.mkvs.interstellarmanager.web.contracts.IHttpRequester;
import com.games.mkvs.interstellarmanager.web.contracts.PostHandler;
import com.games.mkvs.interstellarmanager.web.repositories.base.CompanyRepository;

/**
 * Created by Martin on 1.1.2019 г..
 */

public class HttpCompanyRepository implements CompanyRepository {

    private final IHttpRequester mHttpRequester;
    private final String mServerUrl;

    public HttpCompanyRepository(String serverUrl, IHttpRequester httpRequester) {
        mServerUrl = serverUrl;
        mHttpRequester = httpRequester;
    }


    @Override
    public void getAllCompanies(GetHandler handler) {
        mHttpRequester.get(handler,mServerUrl/*put some root mapping her*/);
    }

    @Override
    public void getCompanyById(GetHandler handler) {
        mHttpRequester.get(handler,mServerUrl/*put some root mapping her*/);
    }

    @Override
    public void createCompany(PostHandler handler, String newCompanyJson) {
        mHttpRequester.post(handler,mServerUrl/*put some root mapping her*/,newCompanyJson);
    }
}
