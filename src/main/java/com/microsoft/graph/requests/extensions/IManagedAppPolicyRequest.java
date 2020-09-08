// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ManagedAppPolicy;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Managed App Policy Request.
 */
public interface IManagedAppPolicyRequest extends IHttpRequest {

    /**
     * Gets the ManagedAppPolicy from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<ManagedAppPolicy> callback);

    /**
     * Gets the ManagedAppPolicy from the service
     *
     * @return the ManagedAppPolicy from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ManagedAppPolicy get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<ManagedAppPolicy> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this ManagedAppPolicy with a source
     *
     * @param sourceManagedAppPolicy the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final ManagedAppPolicy sourceManagedAppPolicy, final ICallback<ManagedAppPolicy> callback);

    /**
     * Patches this ManagedAppPolicy with a source
     *
     * @param sourceManagedAppPolicy the source object with updates
     * @return the updated ManagedAppPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ManagedAppPolicy patch(final ManagedAppPolicy sourceManagedAppPolicy) throws ClientException;

    /**
     * Posts a ManagedAppPolicy with a new object
     *
     * @param newManagedAppPolicy the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final ManagedAppPolicy newManagedAppPolicy, final ICallback<ManagedAppPolicy> callback);

    /**
     * Posts a ManagedAppPolicy with a new object
     *
     * @param newManagedAppPolicy the new object to create
     * @return the created ManagedAppPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ManagedAppPolicy post(final ManagedAppPolicy newManagedAppPolicy) throws ClientException;

    /**
     * Posts a ManagedAppPolicy with a new object
     *
     * @param newManagedAppPolicy the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final ManagedAppPolicy newManagedAppPolicy, final ICallback<ManagedAppPolicy> callback);

    /**
     * Posts a ManagedAppPolicy with a new object
     *
     * @param newManagedAppPolicy the object to create/update
     * @return the created ManagedAppPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ManagedAppPolicy put(final ManagedAppPolicy newManagedAppPolicy) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IManagedAppPolicyRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IManagedAppPolicyRequest expand(final String value);

}

