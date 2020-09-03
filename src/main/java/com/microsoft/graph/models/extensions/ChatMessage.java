// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.ChatMessageAttachment;
import com.microsoft.graph.models.extensions.ItemBody;
import com.microsoft.graph.models.extensions.IdentitySet;
import com.microsoft.graph.models.generated.ChatMessageImportance;
import com.microsoft.graph.models.extensions.ChatMessageMention;
import com.microsoft.graph.models.generated.ChatMessageType;
import com.microsoft.graph.models.extensions.ChatMessagePolicyViolation;
import com.microsoft.graph.models.extensions.ChatMessageReaction;
import com.microsoft.graph.models.extensions.ChatMessageHostedContent;
import com.microsoft.graph.models.extensions.ChatMessage;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.ChatMessageHostedContentCollectionResponse;
import com.microsoft.graph.requests.extensions.ChatMessageHostedContentCollectionPage;
import com.microsoft.graph.requests.extensions.ChatMessageCollectionResponse;
import com.microsoft.graph.requests.extensions.ChatMessageCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Chat Message.
 */
public class ChatMessage extends Entity implements IJsonBackedObject {


    /**
     * The Attachments.
     * Attached files. Attachments are currently read-only – sending attachments is not supported.
     */
    @SerializedName("attachments")
    @Expose
    public java.util.List<ChatMessageAttachment> attachments;

    /**
     * The Body.
     * Plaintext/HTML representation of the content of the chat message. Representation is specified by the contentType inside the body. The content is always in HTML if the chat message contains a chatMessageMention.
     */
    @SerializedName("body")
    @Expose
    public ItemBody body;

    /**
     * The Created Date Time.
     * Read only. Timestamp of when the chat message was created.
     */
    @SerializedName("createdDateTime")
    @Expose
    public java.util.Calendar createdDateTime;

    /**
     * The Deleted Date Time.
     * Read only. Timestamp at which the chat message was deleted, or null if not deleted.
     */
    @SerializedName("deletedDateTime")
    @Expose
    public java.util.Calendar deletedDateTime;

    /**
     * The Etag.
     * Read-only. Version number of the chat message.
     */
    @SerializedName("etag")
    @Expose
    public String etag;

    /**
     * The From.
     * Read only. Details of the sender of the chat message.
     */
    @SerializedName("from")
    @Expose
    public IdentitySet from;

    /**
     * The Importance.
     * The importance of the chat message. The possible values are: normal, high, urgent.
     */
    @SerializedName("importance")
    @Expose
    public ChatMessageImportance importance;

    /**
     * The Last Modified Date Time.
     * Read only. Timestamp of when the chat message is created or edited, including when a reply is made (if it's a root chat message in a channel) or a reaction is added or removed.
     */
    @SerializedName("lastModifiedDateTime")
    @Expose
    public java.util.Calendar lastModifiedDateTime;

    /**
     * The Locale.
     * Locale of the chat message set by the client.
     */
    @SerializedName("locale")
    @Expose
    public String locale;

    /**
     * The Mentions.
     * List of entities mentioned in the chat message. Currently supports user, bot, team, channel.
     */
    @SerializedName("mentions")
    @Expose
    public java.util.List<ChatMessageMention> mentions;

    /**
     * The Message Type.
     * The type of chat message. The possible values are: message.
     */
    @SerializedName("messageType")
    @Expose
    public ChatMessageType messageType;

    /**
     * The Policy Violation.
     * 
     */
    @SerializedName("policyViolation")
    @Expose
    public ChatMessagePolicyViolation policyViolation;

    /**
     * The Reactions.
     * 
     */
    @SerializedName("reactions")
    @Expose
    public java.util.List<ChatMessageReaction> reactions;

    /**
     * The Reply To Id.
     * Read-only. Id of the parent chat message or root chat message of the thread. (Only applies to chat messages in channels not chats)
     */
    @SerializedName("replyToId")
    @Expose
    public String replyToId;

    /**
     * The Subject.
     * The subject of the chat message, in plaintext.
     */
    @SerializedName("subject")
    @Expose
    public String subject;

    /**
     * The Summary.
     * Summary text of the chat message that could be used for push notifications and summary views or fall back views. Only applies to channel chat messages, not chat messages in a chat.
     */
    @SerializedName("summary")
    @Expose
    public String summary;

    /**
     * The Web Url.
     * 
     */
    @SerializedName("webUrl")
    @Expose
    public String webUrl;

    /**
     * The Hosted Contents.
     * 
     */
    public ChatMessageHostedContentCollectionPage hostedContents;

    /**
     * The Replies.
     * 
     */
    public ChatMessageCollectionPage replies;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;


        if (json.has("hostedContents")) {
            final ChatMessageHostedContentCollectionResponse response = new ChatMessageHostedContentCollectionResponse();
            if (json.has("hostedContents@odata.nextLink")) {
                response.nextLink = json.get("hostedContents@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("hostedContents").toString(), JsonObject[].class);
            final ChatMessageHostedContent[] array = new ChatMessageHostedContent[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ChatMessageHostedContent.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            hostedContents = new ChatMessageHostedContentCollectionPage(response, null);
        }

        if (json.has("replies")) {
            final ChatMessageCollectionResponse response = new ChatMessageCollectionResponse();
            if (json.has("replies@odata.nextLink")) {
                response.nextLink = json.get("replies@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("replies").toString(), JsonObject[].class);
            final ChatMessage[] array = new ChatMessage[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ChatMessage.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            replies = new ChatMessageCollectionPage(response, null);
        }
    }
}