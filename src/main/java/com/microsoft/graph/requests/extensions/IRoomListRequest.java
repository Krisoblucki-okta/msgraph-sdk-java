// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.RoomList;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Room List Request.
 */
public interface IRoomListRequest extends IHttpRequest {

    /**
     * Gets the RoomList from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<RoomList> callback);

    /**
     * Gets the RoomList from the service
     *
     * @return the RoomList from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    RoomList get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<RoomList> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this RoomList with a source
     *
     * @param sourceRoomList the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final RoomList sourceRoomList, final ICallback<RoomList> callback);

    /**
     * Patches this RoomList with a source
     *
     * @param sourceRoomList the source object with updates
     * @return the updated RoomList
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    RoomList patch(final RoomList sourceRoomList) throws ClientException;

    /**
     * Posts a RoomList with a new object
     *
     * @param newRoomList the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final RoomList newRoomList, final ICallback<RoomList> callback);

    /**
     * Posts a RoomList with a new object
     *
     * @param newRoomList the new object to create
     * @return the created RoomList
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    RoomList post(final RoomList newRoomList) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IRoomListRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IRoomListRequest expand(final String value);

}

