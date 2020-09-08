// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ChatMessage;
import com.microsoft.graph.requests.extensions.IChatMessageCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.ChatMessageCollectionPage;
import com.microsoft.graph.requests.extensions.ChatMessageCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Chat Message Collection Page.
 */
public class ChatMessageCollectionPage extends BaseCollectionPage<ChatMessage, IChatMessageCollectionRequestBuilder> implements IChatMessageCollectionPage {

    /**
     * A collection page for ChatMessage
     *
     * @param response the serialized ChatMessageCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ChatMessageCollectionPage(final ChatMessageCollectionResponse response, final IChatMessageCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
