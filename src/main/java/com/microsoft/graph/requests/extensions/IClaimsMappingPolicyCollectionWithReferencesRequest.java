// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ServicePrincipal;
import com.microsoft.graph.models.extensions.ClaimsMappingPolicy;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Claims Mapping Policy Collection With References Request.
 */
public interface IClaimsMappingPolicyCollectionWithReferencesRequest {

    void get(final ICallback<IClaimsMappingPolicyCollectionWithReferencesPage> callback);

    IClaimsMappingPolicyCollectionWithReferencesPage get() throws ClientException;

    IClaimsMappingPolicyCollectionWithReferencesRequest expand(final String value);
    
    IClaimsMappingPolicyCollectionWithReferencesRequest select(final String value);

    IClaimsMappingPolicyCollectionWithReferencesRequest top(final int value);

}
