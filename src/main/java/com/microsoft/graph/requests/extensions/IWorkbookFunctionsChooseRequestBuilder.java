// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsChooseRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Choose Request Builder.
 */
public interface IWorkbookFunctionsChooseRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsChooseRequest
     *
     * @return the IWorkbookFunctionsChooseRequest instance
     */
    IWorkbookFunctionsChooseRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsChooseRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsChooseRequest instance
     */
    IWorkbookFunctionsChooseRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
