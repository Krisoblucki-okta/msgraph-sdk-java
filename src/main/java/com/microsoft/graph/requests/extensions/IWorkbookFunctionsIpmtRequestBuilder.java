// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsIpmtRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Ipmt Request Builder.
 */
public interface IWorkbookFunctionsIpmtRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsIpmtRequest
     *
     * @return the IWorkbookFunctionsIpmtRequest instance
     */
    IWorkbookFunctionsIpmtRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsIpmtRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsIpmtRequest instance
     */
    IWorkbookFunctionsIpmtRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
