// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.AudioConferencing;
import com.microsoft.graph.models.extensions.ChatInfo;
import com.microsoft.graph.models.extensions.ItemBody;
import com.microsoft.graph.models.extensions.MeetingParticipants;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Online Meeting.
 */
public class OnlineMeeting extends Entity implements IJsonBackedObject {


    /**
     * The Audio Conferencing.
     * The phone access (dial-in) information for an online meeting. Read-only.
     */
    @SerializedName("audioConferencing")
    @Expose
    public AudioConferencing audioConferencing;

    /**
     * The Chat Info.
     * The chat information associated with this online meeting.
     */
    @SerializedName("chatInfo")
    @Expose
    public ChatInfo chatInfo;

    /**
     * The Creation Date Time.
     * The meeting creation time in UTC. Read-only.
     */
    @SerializedName("creationDateTime")
    @Expose
    public java.util.Calendar creationDateTime;

    /**
     * The End Date Time.
     * The meeting end time in UTC.
     */
    @SerializedName("endDateTime")
    @Expose
    public java.util.Calendar endDateTime;

    /**
     * The External Id.
     * 
     */
    @SerializedName("externalId")
    @Expose
    public String externalId;

    /**
     * The Join Information.
     * The join information in the language and locale variant specified in the Accept-Language request HTTP header. Read-only.
     */
    @SerializedName("joinInformation")
    @Expose
    public ItemBody joinInformation;

    /**
     * The Join Web Url.
     * The join URL of the online meeting. Read-only.
     */
    @SerializedName("joinWebUrl")
    @Expose
    public String joinWebUrl;

    /**
     * The Participants.
     * The participants associated with the online meeting.  This includes the organizer and the attendees.
     */
    @SerializedName("participants")
    @Expose
    public MeetingParticipants participants;

    /**
     * The Start Date Time.
     * The meeting start time in UTC.
     */
    @SerializedName("startDateTime")
    @Expose
    public java.util.Calendar startDateTime;

    /**
     * The Subject.
     * The subject of the online meeting.
     */
    @SerializedName("subject")
    @Expose
    public String subject;

    /**
     * The Video Teleconference Id.
     * The video teleconferencing ID. Read-only.
     */
    @SerializedName("videoTeleconferenceId")
    @Expose
    public String videoTeleconferenceId;


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

    }
}