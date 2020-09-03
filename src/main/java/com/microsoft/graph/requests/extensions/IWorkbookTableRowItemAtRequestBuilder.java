// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookTableRowItemAtRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Table Row Item At Request Builder.
 */
public interface IWorkbookTableRowItemAtRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookTableRowItemAtRequest
     *
     * @return the IWorkbookTableRowItemAtRequest instance
     */
    IWorkbookTableRowItemAtRequest buildRequest();

    /**
     * Creates the IWorkbookTableRowItemAtRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookTableRowItemAtRequest instance
     */
    IWorkbookTableRowItemAtRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
