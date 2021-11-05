package com.khartec.waltz.integration_test.inmem.helpers;

import com.khartec.waltz.model.EntityReference;
import com.khartec.waltz.service.external_identifier.ExternalIdentifierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExternalIdHelper {

    private final ExternalIdentifierService externalIdentifierService;

    @Autowired
    public ExternalIdHelper(ExternalIdentifierService externalIdentifierService) {
        this.externalIdentifierService = externalIdentifierService;
    }

    public int createExtId(EntityReference ref, String extId, String name) {
       return externalIdentifierService.create(ref, extId, name);
    }

}
