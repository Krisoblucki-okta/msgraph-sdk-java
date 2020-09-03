// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsF_Inv_RTRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions F_Inv_RTRequest Builder.
 */
public interface IWorkbookFunctionsF_Inv_RTRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsF_Inv_RTRequest
     *
     * @return the IWorkbookFunctionsF_Inv_RTRequest instance
     */
    IWorkbookFunctionsF_Inv_RTRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsF_Inv_RTRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsF_Inv_RTRequest instance
     */
    IWorkbookFunctionsF_Inv_RTRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
