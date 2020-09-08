// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsAscRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Asc Request Builder.
 */
public interface IWorkbookFunctionsAscRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsAscRequest
     *
     * @return the IWorkbookFunctionsAscRequest instance
     */
    IWorkbookFunctionsAscRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsAscRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsAscRequest instance
     */
    IWorkbookFunctionsAscRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
