// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsMinRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Min Request Builder.
 */
public interface IWorkbookFunctionsMinRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsMinRequest
     *
     * @return the IWorkbookFunctionsMinRequest instance
     */
    IWorkbookFunctionsMinRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsMinRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsMinRequest instance
     */
    IWorkbookFunctionsMinRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
