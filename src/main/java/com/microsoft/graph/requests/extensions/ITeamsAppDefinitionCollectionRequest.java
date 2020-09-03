// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TeamsApp;
import com.microsoft.graph.models.extensions.TeamsAppDefinition;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Teams App Definition Collection Request.
 */
public interface ITeamsAppDefinitionCollectionRequest {

    void get(final ICallback<ITeamsAppDefinitionCollectionPage> callback);

    ITeamsAppDefinitionCollectionPage get() throws ClientException;

    void post(final TeamsAppDefinition newTeamsAppDefinition, final ICallback<TeamsAppDefinition> callback);

    TeamsAppDefinition post(final TeamsAppDefinition newTeamsAppDefinition) throws ClientException;

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ITeamsAppDefinitionCollectionRequest expand(final String value);

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ITeamsAppDefinitionCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    ITeamsAppDefinitionCollectionRequest top(final int value);

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    ITeamsAppDefinitionCollectionRequest skip(final int value);

    /**
	 * Sets the skip token value for the request
	 * 
	 * @param skipToken value for pagination
     *
	 * @return the updated request
	 */
	ITeamsAppDefinitionCollectionRequest skipToken(String skipToken);
}