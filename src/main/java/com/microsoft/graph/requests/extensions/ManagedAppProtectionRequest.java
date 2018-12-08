// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Managed App Protection Request.
 */
public class ManagedAppProtectionRequest extends BaseManagedAppProtectionRequest implements IManagedAppProtectionRequest {

    /**
     * The request for the ManagedAppProtection
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public ManagedAppProtectionRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<? extends ManagedAppProtection> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the ManagedAppProtection
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedAppProtectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagedAppProtection.class);
    }
}
