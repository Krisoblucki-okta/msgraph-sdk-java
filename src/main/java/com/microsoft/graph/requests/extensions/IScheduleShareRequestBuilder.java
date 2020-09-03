// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IScheduleShareRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Schedule Share Request Builder.
 */
public interface IScheduleShareRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IScheduleShareRequest
     *
     * @return the IScheduleShareRequest instance
     */
    IScheduleShareRequest buildRequest();

    /**
     * Creates the IScheduleShareRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IScheduleShareRequest instance
     */
    IScheduleShareRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
