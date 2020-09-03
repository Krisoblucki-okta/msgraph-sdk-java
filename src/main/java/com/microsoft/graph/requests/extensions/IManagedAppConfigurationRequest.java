// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ManagedAppConfiguration;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Managed App Configuration Request.
 */
public interface IManagedAppConfigurationRequest extends IHttpRequest {

    /**
     * Gets the ManagedAppConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<ManagedAppConfiguration> callback);

    /**
     * Gets the ManagedAppConfiguration from the service
     *
     * @return the ManagedAppConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ManagedAppConfiguration get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<ManagedAppConfiguration> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this ManagedAppConfiguration with a source
     *
     * @param sourceManagedAppConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final ManagedAppConfiguration sourceManagedAppConfiguration, final ICallback<ManagedAppConfiguration> callback);

    /**
     * Patches this ManagedAppConfiguration with a source
     *
     * @param sourceManagedAppConfiguration the source object with updates
     * @return the updated ManagedAppConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ManagedAppConfiguration patch(final ManagedAppConfiguration sourceManagedAppConfiguration) throws ClientException;

    /**
     * Posts a ManagedAppConfiguration with a new object
     *
     * @param newManagedAppConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final ManagedAppConfiguration newManagedAppConfiguration, final ICallback<ManagedAppConfiguration> callback);

    /**
     * Posts a ManagedAppConfiguration with a new object
     *
     * @param newManagedAppConfiguration the new object to create
     * @return the created ManagedAppConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ManagedAppConfiguration post(final ManagedAppConfiguration newManagedAppConfiguration) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IManagedAppConfigurationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IManagedAppConfigurationRequest expand(final String value);

}

