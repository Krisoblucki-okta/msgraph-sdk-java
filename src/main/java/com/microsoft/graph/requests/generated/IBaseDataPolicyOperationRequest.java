// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.models.extensions.DataPolicyOperation;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Data Policy Operation Request.
 */
public interface IBaseDataPolicyOperationRequest extends IHttpRequest {

    /**
     * Gets the DataPolicyOperation from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<DataPolicyOperation> callback);

    /**
     * Gets the DataPolicyOperation from the service
     *
     * @return the DataPolicyOperation from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DataPolicyOperation get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<DataPolicyOperation> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this DataPolicyOperation with a source
     *
     * @param sourceDataPolicyOperation the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DataPolicyOperation sourceDataPolicyOperation, final ICallback<DataPolicyOperation> callback);

    /**
     * Patches this DataPolicyOperation with a source
     *
     * @param sourceDataPolicyOperation the source object with updates
     * @return the updated DataPolicyOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DataPolicyOperation patch(final DataPolicyOperation sourceDataPolicyOperation) throws ClientException;

    /**
     * Posts a DataPolicyOperation with a new object
     *
     * @param newDataPolicyOperation the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DataPolicyOperation newDataPolicyOperation, final ICallback<DataPolicyOperation> callback);

    /**
     * Posts a DataPolicyOperation with a new object
     *
     * @param newDataPolicyOperation the new object to create
     * @return the created DataPolicyOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DataPolicyOperation post(final DataPolicyOperation newDataPolicyOperation) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseDataPolicyOperationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseDataPolicyOperationRequest expand(final String value);

}

