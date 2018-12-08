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
 * The class for the Outlook User Supported Time Zones Collection Request Builder.
 */
public class OutlookUserSupportedTimeZonesCollectionRequestBuilder extends BaseOutlookUserSupportedTimeZonesCollectionRequestBuilder implements IOutlookUserSupportedTimeZonesCollectionRequestBuilder {

    /**
     * The request builder for this collection of OutlookUser
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OutlookUserSupportedTimeZonesCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * The request builder for this collection of OutlookUser
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param timeZoneStandard the timeZoneStandard
     */
    public OutlookUserSupportedTimeZonesCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final TimeZoneStandard timeZoneStandard) {
        super(requestUrl, client, requestOptions, timeZoneStandard);
    }
}
