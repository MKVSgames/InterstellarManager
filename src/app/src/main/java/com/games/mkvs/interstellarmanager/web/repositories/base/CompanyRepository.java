package com.games.mkvs.interstellarmanager.web.repositories.base;

import com.games.mkvs.interstellarmanager.models.Company;
import com.games.mkvs.interstellarmanager.web.contracts.GetHandler;
import com.games.mkvs.interstellarmanager.web.contracts.PostHandler;

import java.util.List;

public interface CompanyRepository {

    void getAllCompanies(GetHandler handler);

    void getCompanyById(GetHandler handler);

    void createCompany(PostHandler handler, String newCompanyJson);

}
