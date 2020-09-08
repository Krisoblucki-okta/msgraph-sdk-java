// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IReportRootGetOffice365GroupsActivityFileCountsRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Report Root Get Office365Groups Activity File Counts Request Builder.
 */
public interface IReportRootGetOffice365GroupsActivityFileCountsRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IReportRootGetOffice365GroupsActivityFileCountsRequest
     *
     * @return the IReportRootGetOffice365GroupsActivityFileCountsRequest instance
     */
    IReportRootGetOffice365GroupsActivityFileCountsRequest buildRequest();

    /**
     * Creates the IReportRootGetOffice365GroupsActivityFileCountsRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetOffice365GroupsActivityFileCountsRequest instance
     */
    IReportRootGetOffice365GroupsActivityFileCountsRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
