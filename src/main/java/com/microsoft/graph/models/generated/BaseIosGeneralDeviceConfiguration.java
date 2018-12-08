// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;
import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.AppListItem;
import com.microsoft.graph.models.generated.AppListType;
import com.microsoft.graph.models.extensions.MediaContentRatingAustralia;
import com.microsoft.graph.models.extensions.MediaContentRatingCanada;
import com.microsoft.graph.models.extensions.MediaContentRatingFrance;
import com.microsoft.graph.models.extensions.MediaContentRatingGermany;
import com.microsoft.graph.models.extensions.MediaContentRatingIreland;
import com.microsoft.graph.models.extensions.MediaContentRatingJapan;
import com.microsoft.graph.models.extensions.MediaContentRatingNewZealand;
import com.microsoft.graph.models.extensions.MediaContentRatingUnitedKingdom;
import com.microsoft.graph.models.extensions.MediaContentRatingUnitedStates;
import com.microsoft.graph.models.extensions.IosNetworkUsageRule;
import com.microsoft.graph.models.generated.RatingAppsType;
import com.microsoft.graph.models.generated.RequiredPasswordType;
import com.microsoft.graph.models.generated.WebBrowserCookieSettings;
import com.microsoft.graph.models.extensions.DeviceConfiguration;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Ios General Device Configuration.
 */
public class BaseIosGeneralDeviceConfiguration extends DeviceConfiguration implements IJsonBackedObject {


    /**
     * The Account Block Modification.
     * Indicates whether or not to allow account modification when the device is in supervised mode.
     */
    @SerializedName("accountBlockModification")
    @Expose
    public Boolean accountBlockModification;

    /**
     * The Activation Lock Allow When Supervised.
     * Indicates whether or not to allow activation lock when the device is in the supervised mode.
     */
    @SerializedName("activationLockAllowWhenSupervised")
    @Expose
    public Boolean activationLockAllowWhenSupervised;

    /**
     * The Air Drop Blocked.
     * Indicates whether or not to allow AirDrop when the device is in supervised mode.
     */
    @SerializedName("airDropBlocked")
    @Expose
    public Boolean airDropBlocked;

    /**
     * The Air Drop Force Unmanaged Drop Target.
     * Indicates whether or not to cause AirDrop to be considered an unmanaged drop target (iOS 9.0 and later).
     */
    @SerializedName("airDropForceUnmanagedDropTarget")
    @Expose
    public Boolean airDropForceUnmanagedDropTarget;

    /**
     * The Air Play Force Pairing Password For Outgoing Requests.
     * Indicates whether or not to enforce all devices receiving AirPlay requests from this device to use a pairing password.
     */
    @SerializedName("airPlayForcePairingPasswordForOutgoingRequests")
    @Expose
    public Boolean airPlayForcePairingPasswordForOutgoingRequests;

    /**
     * The Apple Watch Block Pairing.
     * Indicates whether or not to allow Apple Watch pairing when the device is in supervised mode (iOS 9.0 and later).
     */
    @SerializedName("appleWatchBlockPairing")
    @Expose
    public Boolean appleWatchBlockPairing;

    /**
     * The Apple Watch Force Wrist Detection.
     * Indicates whether or not to force a paired Apple Watch to use Wrist Detection (iOS 8.2 and later).
     */
    @SerializedName("appleWatchForceWristDetection")
    @Expose
    public Boolean appleWatchForceWristDetection;

    /**
     * The Apple News Blocked.
     * Indicates whether or not to block the user from using News when the device is in supervised mode (iOS 9.0 and later).
     */
    @SerializedName("appleNewsBlocked")
    @Expose
    public Boolean appleNewsBlocked;

    /**
     * The Apps Single App Mode List.
     * Gets or sets the list of iOS apps allowed to autonomously enter Single App Mode. Supervised only. iOS 7.0 and later. This collection can contain a maximum of 500 elements.
     */
    @SerializedName("appsSingleAppModeList")
    @Expose
    public java.util.List<AppListItem> appsSingleAppModeList;

    /**
     * The Apps Visibility List.
     * List of apps in the visibility list (either visible/launchable apps list or hidden/unlaunchable apps list, controlled by AppsVisibilityListType) (iOS 9.3 and later). This collection can contain a maximum of 10000 elements.
     */
    @SerializedName("appsVisibilityList")
    @Expose
    public java.util.List<AppListItem> appsVisibilityList;

    /**
     * The Apps Visibility List Type.
     * Type of list that is in the AppsVisibilityList. Possible values are: none, appsInListCompliant, appsNotInListCompliant.
     */
    @SerializedName("appsVisibilityListType")
    @Expose
    public AppListType appsVisibilityListType;

    /**
     * The App Store Block Automatic Downloads.
     * Indicates whether or not to block the automatic downloading of apps purchased on other devices when the device is in supervised mode (iOS 9.0 and later).
     */
    @SerializedName("appStoreBlockAutomaticDownloads")
    @Expose
    public Boolean appStoreBlockAutomaticDownloads;

    /**
     * The App Store Blocked.
     * Indicates whether or not to block the user from using the App Store.
     */
    @SerializedName("appStoreBlocked")
    @Expose
    public Boolean appStoreBlocked;

    /**
     * The App Store Block In App Purchases.
     * Indicates whether or not to block the user from making in app purchases.
     */
    @SerializedName("appStoreBlockInAppPurchases")
    @Expose
    public Boolean appStoreBlockInAppPurchases;

    /**
     * The App Store Block UIApp Installation.
     * Indicates whether or not to block the App Store app, not restricting installation through Host apps. Applies to supervised mode only (iOS 9.0 and later).
     */
    @SerializedName("appStoreBlockUIAppInstallation")
    @Expose
    public Boolean appStoreBlockUIAppInstallation;

    /**
     * The App Store Require Password.
     * Indicates whether or not to require a password when using the app store.
     */
    @SerializedName("appStoreRequirePassword")
    @Expose
    public Boolean appStoreRequirePassword;

    /**
     * The Bluetooth Block Modification.
     * Indicates whether or not to allow modification of Bluetooth settings when the device is in supervised mode (iOS 10.0 and later).
     */
    @SerializedName("bluetoothBlockModification")
    @Expose
    public Boolean bluetoothBlockModification;

    /**
     * The Camera Blocked.
     * Indicates whether or not to block the user from accessing the camera of the device.
     */
    @SerializedName("cameraBlocked")
    @Expose
    public Boolean cameraBlocked;

    /**
     * The Cellular Block Data Roaming.
     * Indicates whether or not to block data roaming.
     */
    @SerializedName("cellularBlockDataRoaming")
    @Expose
    public Boolean cellularBlockDataRoaming;

    /**
     * The Cellular Block Global Background Fetch While Roaming.
     * Indicates whether or not to block global background fetch while roaming.
     */
    @SerializedName("cellularBlockGlobalBackgroundFetchWhileRoaming")
    @Expose
    public Boolean cellularBlockGlobalBackgroundFetchWhileRoaming;

    /**
     * The Cellular Block Per App Data Modification.
     * Indicates whether or not to allow changes to cellular app data usage settings when the device is in supervised mode.
     */
    @SerializedName("cellularBlockPerAppDataModification")
    @Expose
    public Boolean cellularBlockPerAppDataModification;

    /**
     * The Cellular Block Personal Hotspot.
     * Indicates whether or not to block Personal Hotspot.
     */
    @SerializedName("cellularBlockPersonalHotspot")
    @Expose
    public Boolean cellularBlockPersonalHotspot;

    /**
     * The Cellular Block Voice Roaming.
     * Indicates whether or not to block voice roaming.
     */
    @SerializedName("cellularBlockVoiceRoaming")
    @Expose
    public Boolean cellularBlockVoiceRoaming;

    /**
     * The Certificates Block Untrusted Tls Certificates.
     * Indicates whether or not to block untrusted TLS certificates.
     */
    @SerializedName("certificatesBlockUntrustedTlsCertificates")
    @Expose
    public Boolean certificatesBlockUntrustedTlsCertificates;

    /**
     * The Classroom App Block Remote Screen Observation.
     * Indicates whether or not to allow remote screen observation by Classroom app when the device is in supervised mode (iOS 9.3 and later).
     */
    @SerializedName("classroomAppBlockRemoteScreenObservation")
    @Expose
    public Boolean classroomAppBlockRemoteScreenObservation;

    /**
     * The Classroom App Force Unprompted Screen Observation.
     * Indicates whether or not to automatically give permission to the teacher of a managed course on the Classroom app to view a student's screen without prompting when the device is in supervised mode.
     */
    @SerializedName("classroomAppForceUnpromptedScreenObservation")
    @Expose
    public Boolean classroomAppForceUnpromptedScreenObservation;

    /**
     * The Compliant Apps List.
     * List of apps in the compliance (either allow list or block list, controlled by CompliantAppListType). This collection can contain a maximum of 10000 elements.
     */
    @SerializedName("compliantAppsList")
    @Expose
    public java.util.List<AppListItem> compliantAppsList;

    /**
     * The Compliant App List Type.
     * List that is in the AppComplianceList. Possible values are: none, appsInListCompliant, appsNotInListCompliant.
     */
    @SerializedName("compliantAppListType")
    @Expose
    public AppListType compliantAppListType;

    /**
     * The Configuration Profile Block Changes.
     * Indicates whether or not to block the user from installing configuration profiles and certificates interactively when the device is in supervised mode.
     */
    @SerializedName("configurationProfileBlockChanges")
    @Expose
    public Boolean configurationProfileBlockChanges;

    /**
     * The Definition Lookup Blocked.
     * Indicates whether or not to block definition lookup when the device is in supervised mode (iOS 8.1.3 and later ).
     */
    @SerializedName("definitionLookupBlocked")
    @Expose
    public Boolean definitionLookupBlocked;

    /**
     * The Device Block Enable Restrictions.
     * Indicates whether or not to allow the user to enables restrictions in the device settings when the device is in supervised mode.
     */
    @SerializedName("deviceBlockEnableRestrictions")
    @Expose
    public Boolean deviceBlockEnableRestrictions;

    /**
     * The Device Block Erase Content And Settings.
     * Indicates whether or not to allow the use of the 'Erase all content and settings' option on the device when the device is in supervised mode.
     */
    @SerializedName("deviceBlockEraseContentAndSettings")
    @Expose
    public Boolean deviceBlockEraseContentAndSettings;

    /**
     * The Device Block Name Modification.
     * Indicates whether or not to allow device name modification when the device is in supervised mode (iOS 9.0 and later).
     */
    @SerializedName("deviceBlockNameModification")
    @Expose
    public Boolean deviceBlockNameModification;

    /**
     * The Diagnostic Data Block Submission.
     * Indicates whether or not to block diagnostic data submission.
     */
    @SerializedName("diagnosticDataBlockSubmission")
    @Expose
    public Boolean diagnosticDataBlockSubmission;

    /**
     * The Diagnostic Data Block Submission Modification.
     * Indicates whether or not to allow diagnostics submission settings modification when the device is in supervised mode (iOS 9.3.2 and later).
     */
    @SerializedName("diagnosticDataBlockSubmissionModification")
    @Expose
    public Boolean diagnosticDataBlockSubmissionModification;

    /**
     * The Documents Block Managed Documents In Unmanaged Apps.
     * Indicates whether or not to block the user from viewing managed documents in unmanaged apps.
     */
    @SerializedName("documentsBlockManagedDocumentsInUnmanagedApps")
    @Expose
    public Boolean documentsBlockManagedDocumentsInUnmanagedApps;

    /**
     * The Documents Block Unmanaged Documents In Managed Apps.
     * Indicates whether or not to block the user from viewing unmanaged documents in managed apps.
     */
    @SerializedName("documentsBlockUnmanagedDocumentsInManagedApps")
    @Expose
    public Boolean documentsBlockUnmanagedDocumentsInManagedApps;

    /**
     * The Email In Domain Suffixes.
     * An email address lacking a suffix that matches any of these strings will be considered out-of-domain.
     */
    @SerializedName("emailInDomainSuffixes")
    @Expose
    public java.util.List<String> emailInDomainSuffixes;

    /**
     * The Enterprise App Block Trust.
     * Indicates whether or not to block the user from trusting an enterprise app.
     */
    @SerializedName("enterpriseAppBlockTrust")
    @Expose
    public Boolean enterpriseAppBlockTrust;

    /**
     * The Enterprise App Block Trust Modification.
     * Indicates whether or not to block the user from modifying the enterprise app trust settings.
     */
    @SerializedName("enterpriseAppBlockTrustModification")
    @Expose
    public Boolean enterpriseAppBlockTrustModification;

    /**
     * The Face Time Blocked.
     * Indicates whether or not to block the user from using FaceTime.
     */
    @SerializedName("faceTimeBlocked")
    @Expose
    public Boolean faceTimeBlocked;

    /**
     * The Find My Friends Blocked.
     * Indicates whether or not to block Find My Friends when the device is in supervised mode.
     */
    @SerializedName("findMyFriendsBlocked")
    @Expose
    public Boolean findMyFriendsBlocked;

    /**
     * The Gaming Block Game Center Friends.
     * Indicates whether or not to block the user from having friends in Game Center.
     */
    @SerializedName("gamingBlockGameCenterFriends")
    @Expose
    public Boolean gamingBlockGameCenterFriends;

    /**
     * The Gaming Block Multiplayer.
     * Indicates whether or not to block the user from using multiplayer gaming.
     */
    @SerializedName("gamingBlockMultiplayer")
    @Expose
    public Boolean gamingBlockMultiplayer;

    /**
     * The Game Center Blocked.
     * Indicates whether or not to block the user from using Game Center when the device is in supervised mode.
     */
    @SerializedName("gameCenterBlocked")
    @Expose
    public Boolean gameCenterBlocked;

    /**
     * The Host Pairing Blocked.
     * indicates whether or not to allow host pairing to control the devices an iOS device can pair with when the iOS device is in supervised mode.
     */
    @SerializedName("hostPairingBlocked")
    @Expose
    public Boolean hostPairingBlocked;

    /**
     * The IBooks Store Blocked.
     * Indicates whether or not to block the user from using the iBooks Store when the device is in supervised mode.
     */
    @SerializedName("iBooksStoreBlocked")
    @Expose
    public Boolean iBooksStoreBlocked;

    /**
     * The IBooks Store Block Erotica.
     * Indicates whether or not to block the user from downloading media from the iBookstore that has been tagged as erotica.
     */
    @SerializedName("iBooksStoreBlockErotica")
    @Expose
    public Boolean iBooksStoreBlockErotica;

    /**
     * The ICloud Block Activity Continuation.
     * Indicates whether or not to block  the the user from continuing work they started on iOS device to another iOS or macOS device.
     */
    @SerializedName("iCloudBlockActivityContinuation")
    @Expose
    public Boolean iCloudBlockActivityContinuation;

    /**
     * The ICloud Block Backup.
     * Indicates whether or not to block iCloud backup.
     */
    @SerializedName("iCloudBlockBackup")
    @Expose
    public Boolean iCloudBlockBackup;

    /**
     * The ICloud Block Document Sync.
     * Indicates whether or not to block iCloud document sync.
     */
    @SerializedName("iCloudBlockDocumentSync")
    @Expose
    public Boolean iCloudBlockDocumentSync;

    /**
     * The ICloud Block Managed Apps Sync.
     * Indicates whether or not to block Managed Apps Cloud Sync.
     */
    @SerializedName("iCloudBlockManagedAppsSync")
    @Expose
    public Boolean iCloudBlockManagedAppsSync;

    /**
     * The ICloud Block Photo Library.
     * Indicates whether or not to block iCloud Photo Library.
     */
    @SerializedName("iCloudBlockPhotoLibrary")
    @Expose
    public Boolean iCloudBlockPhotoLibrary;

    /**
     * The ICloud Block Photo Stream Sync.
     * Indicates whether or not to block iCloud Photo Stream Sync.
     */
    @SerializedName("iCloudBlockPhotoStreamSync")
    @Expose
    public Boolean iCloudBlockPhotoStreamSync;

    /**
     * The ICloud Block Shared Photo Stream.
     * Indicates whether or not to block Shared Photo Stream.
     */
    @SerializedName("iCloudBlockSharedPhotoStream")
    @Expose
    public Boolean iCloudBlockSharedPhotoStream;

    /**
     * The ICloud Require Encrypted Backup.
     * Indicates whether or not to require backups to iCloud be encrypted.
     */
    @SerializedName("iCloudRequireEncryptedBackup")
    @Expose
    public Boolean iCloudRequireEncryptedBackup;

    /**
     * The ITunes Block Explicit Content.
     * Indicates whether or not to block the user from accessing explicit content in iTunes and the App Store.
     */
    @SerializedName("iTunesBlockExplicitContent")
    @Expose
    public Boolean iTunesBlockExplicitContent;

    /**
     * The ITunes Block Music Service.
     * Indicates whether or not to block Music service and revert Music app to classic mode when the device is in supervised mode (iOS 9.3 and later and macOS 10.12 and later).
     */
    @SerializedName("iTunesBlockMusicService")
    @Expose
    public Boolean iTunesBlockMusicService;

    /**
     * The ITunes Block Radio.
     * Indicates whether or not to block the user from using iTunes Radio when the device is in supervised mode (iOS 9.3 and later).
     */
    @SerializedName("iTunesBlockRadio")
    @Expose
    public Boolean iTunesBlockRadio;

    /**
     * The Keyboard Block Auto Correct.
     * Indicates whether or not to block keyboard auto-correction when the device is in supervised mode (iOS 8.1.3 and later).
     */
    @SerializedName("keyboardBlockAutoCorrect")
    @Expose
    public Boolean keyboardBlockAutoCorrect;

    /**
     * The Keyboard Block Dictation.
     * Indicates whether or not to block the user from using dictation input when the device is in supervised mode.
     */
    @SerializedName("keyboardBlockDictation")
    @Expose
    public Boolean keyboardBlockDictation;

    /**
     * The Keyboard Block Predictive.
     * Indicates whether or not to block predictive keyboards when device is in supervised mode (iOS 8.1.3 and later).
     */
    @SerializedName("keyboardBlockPredictive")
    @Expose
    public Boolean keyboardBlockPredictive;

    /**
     * The Keyboard Block Shortcuts.
     * Indicates whether or not to block keyboard shortcuts when the device is in supervised mode (iOS 9.0 and later).
     */
    @SerializedName("keyboardBlockShortcuts")
    @Expose
    public Boolean keyboardBlockShortcuts;

    /**
     * The Keyboard Block Spell Check.
     * Indicates whether or not to block keyboard spell-checking when the device is in supervised mode (iOS 8.1.3 and later).
     */
    @SerializedName("keyboardBlockSpellCheck")
    @Expose
    public Boolean keyboardBlockSpellCheck;

    /**
     * The Kiosk Mode Allow Assistive Speak.
     * Indicates whether or not to allow assistive speak while in kiosk mode.
     */
    @SerializedName("kioskModeAllowAssistiveSpeak")
    @Expose
    public Boolean kioskModeAllowAssistiveSpeak;

    /**
     * The Kiosk Mode Allow Assistive Touch Settings.
     * Indicates whether or not to allow access to the Assistive Touch Settings while in kiosk mode.
     */
    @SerializedName("kioskModeAllowAssistiveTouchSettings")
    @Expose
    public Boolean kioskModeAllowAssistiveTouchSettings;

    /**
     * The Kiosk Mode Allow Auto Lock.
     * Indicates whether or not to allow device auto lock while in kiosk mode.
     */
    @SerializedName("kioskModeAllowAutoLock")
    @Expose
    public Boolean kioskModeAllowAutoLock;

    /**
     * The Kiosk Mode Allow Color Inversion Settings.
     * Indicates whether or not to allow access to the Color Inversion Settings while in kiosk mode.
     */
    @SerializedName("kioskModeAllowColorInversionSettings")
    @Expose
    public Boolean kioskModeAllowColorInversionSettings;

    /**
     * The Kiosk Mode Allow Ringer Switch.
     * Indicates whether or not to allow use of the ringer switch while in kiosk mode.
     */
    @SerializedName("kioskModeAllowRingerSwitch")
    @Expose
    public Boolean kioskModeAllowRingerSwitch;

    /**
     * The Kiosk Mode Allow Screen Rotation.
     * Indicates whether or not to allow screen rotation while in kiosk mode.
     */
    @SerializedName("kioskModeAllowScreenRotation")
    @Expose
    public Boolean kioskModeAllowScreenRotation;

    /**
     * The Kiosk Mode Allow Sleep Button.
     * Indicates whether or not to allow use of the sleep button while in kiosk mode.
     */
    @SerializedName("kioskModeAllowSleepButton")
    @Expose
    public Boolean kioskModeAllowSleepButton;

    /**
     * The Kiosk Mode Allow Touchscreen.
     * Indicates whether or not to allow use of the touchscreen while in kiosk mode.
     */
    @SerializedName("kioskModeAllowTouchscreen")
    @Expose
    public Boolean kioskModeAllowTouchscreen;

    /**
     * The Kiosk Mode Allow Voice Over Settings.
     * Indicates whether or not to allow access to the voice over settings while in kiosk mode.
     */
    @SerializedName("kioskModeAllowVoiceOverSettings")
    @Expose
    public Boolean kioskModeAllowVoiceOverSettings;

    /**
     * The Kiosk Mode Allow Volume Buttons.
     * Indicates whether or not to allow use of the volume buttons while in kiosk mode.
     */
    @SerializedName("kioskModeAllowVolumeButtons")
    @Expose
    public Boolean kioskModeAllowVolumeButtons;

    /**
     * The Kiosk Mode Allow Zoom Settings.
     * Indicates whether or not to allow access to the zoom settings while in kiosk mode.
     */
    @SerializedName("kioskModeAllowZoomSettings")
    @Expose
    public Boolean kioskModeAllowZoomSettings;

    /**
     * The Kiosk Mode App Store Url.
     * URL in the app store to the app to use for kiosk mode. Use if KioskModeManagedAppId is not known.
     */
    @SerializedName("kioskModeAppStoreUrl")
    @Expose
    public String kioskModeAppStoreUrl;

    /**
     * The Kiosk Mode Built In App Id.
     * ID for built-in apps to use for kiosk mode. Used when KioskModeManagedAppId and KioskModeAppStoreUrl are not set.
     */
    @SerializedName("kioskModeBuiltInAppId")
    @Expose
    public String kioskModeBuiltInAppId;

    /**
     * The Kiosk Mode Require Assistive Touch.
     * Indicates whether or not to require assistive touch while in kiosk mode.
     */
    @SerializedName("kioskModeRequireAssistiveTouch")
    @Expose
    public Boolean kioskModeRequireAssistiveTouch;

    /**
     * The Kiosk Mode Require Color Inversion.
     * Indicates whether or not to require color inversion while in kiosk mode.
     */
    @SerializedName("kioskModeRequireColorInversion")
    @Expose
    public Boolean kioskModeRequireColorInversion;

    /**
     * The Kiosk Mode Require Mono Audio.
     * Indicates whether or not to require mono audio while in kiosk mode.
     */
    @SerializedName("kioskModeRequireMonoAudio")
    @Expose
    public Boolean kioskModeRequireMonoAudio;

    /**
     * The Kiosk Mode Require Voice Over.
     * Indicates whether or not to require voice over while in kiosk mode.
     */
    @SerializedName("kioskModeRequireVoiceOver")
    @Expose
    public Boolean kioskModeRequireVoiceOver;

    /**
     * The Kiosk Mode Require Zoom.
     * Indicates whether or not to require zoom while in kiosk mode.
     */
    @SerializedName("kioskModeRequireZoom")
    @Expose
    public Boolean kioskModeRequireZoom;

    /**
     * The Kiosk Mode Managed App Id.
     * Managed app id of the app to use for kiosk mode. If KioskModeManagedAppId is specified then KioskModeAppStoreUrl will be ignored.
     */
    @SerializedName("kioskModeManagedAppId")
    @Expose
    public String kioskModeManagedAppId;

    /**
     * The Lock Screen Block Control Center.
     * Indicates whether or not to block the user from using control center on the lock screen.
     */
    @SerializedName("lockScreenBlockControlCenter")
    @Expose
    public Boolean lockScreenBlockControlCenter;

    /**
     * The Lock Screen Block Notification View.
     * Indicates whether or not to block the user from using the notification view on the lock screen.
     */
    @SerializedName("lockScreenBlockNotificationView")
    @Expose
    public Boolean lockScreenBlockNotificationView;

    /**
     * The Lock Screen Block Passbook.
     * Indicates whether or not to block the user from using passbook when the device is locked.
     */
    @SerializedName("lockScreenBlockPassbook")
    @Expose
    public Boolean lockScreenBlockPassbook;

    /**
     * The Lock Screen Block Today View.
     * Indicates whether or not to block the user from using the Today View on the lock screen.
     */
    @SerializedName("lockScreenBlockTodayView")
    @Expose
    public Boolean lockScreenBlockTodayView;

    /**
     * The Media Content Rating Australia.
     * Media content rating settings for Australia
     */
    @SerializedName("mediaContentRatingAustralia")
    @Expose
    public MediaContentRatingAustralia mediaContentRatingAustralia;

    /**
     * The Media Content Rating Canada.
     * Media content rating settings for Canada
     */
    @SerializedName("mediaContentRatingCanada")
    @Expose
    public MediaContentRatingCanada mediaContentRatingCanada;

    /**
     * The Media Content Rating France.
     * Media content rating settings for France
     */
    @SerializedName("mediaContentRatingFrance")
    @Expose
    public MediaContentRatingFrance mediaContentRatingFrance;

    /**
     * The Media Content Rating Germany.
     * Media content rating settings for Germany
     */
    @SerializedName("mediaContentRatingGermany")
    @Expose
    public MediaContentRatingGermany mediaContentRatingGermany;

    /**
     * The Media Content Rating Ireland.
     * Media content rating settings for Ireland
     */
    @SerializedName("mediaContentRatingIreland")
    @Expose
    public MediaContentRatingIreland mediaContentRatingIreland;

    /**
     * The Media Content Rating Japan.
     * Media content rating settings for Japan
     */
    @SerializedName("mediaContentRatingJapan")
    @Expose
    public MediaContentRatingJapan mediaContentRatingJapan;

    /**
     * The Media Content Rating New Zealand.
     * Media content rating settings for New Zealand
     */
    @SerializedName("mediaContentRatingNewZealand")
    @Expose
    public MediaContentRatingNewZealand mediaContentRatingNewZealand;

    /**
     * The Media Content Rating United Kingdom.
     * Media content rating settings for United Kingdom
     */
    @SerializedName("mediaContentRatingUnitedKingdom")
    @Expose
    public MediaContentRatingUnitedKingdom mediaContentRatingUnitedKingdom;

    /**
     * The Media Content Rating United States.
     * Media content rating settings for United States
     */
    @SerializedName("mediaContentRatingUnitedStates")
    @Expose
    public MediaContentRatingUnitedStates mediaContentRatingUnitedStates;

    /**
     * The Network Usage Rules.
     * List of managed apps and the network rules that applies to them. This collection can contain a maximum of 1000 elements.
     */
    @SerializedName("networkUsageRules")
    @Expose
    public java.util.List<IosNetworkUsageRule> networkUsageRules;

    /**
     * The Media Content Rating Apps.
     * Media content rating settings for Apps. Possible values are: allAllowed, allBlocked, agesAbove4, agesAbove9, agesAbove12, agesAbove17.
     */
    @SerializedName("mediaContentRatingApps")
    @Expose
    public RatingAppsType mediaContentRatingApps;

    /**
     * The Messages Blocked.
     * Indicates whether or not to block the user from using the Messages app on the supervised device.
     */
    @SerializedName("messagesBlocked")
    @Expose
    public Boolean messagesBlocked;

    /**
     * The Notifications Block Settings Modification.
     * Indicates whether or not to allow notifications settings modification (iOS 9.3 and later).
     */
    @SerializedName("notificationsBlockSettingsModification")
    @Expose
    public Boolean notificationsBlockSettingsModification;

    /**
     * The Passcode Block Fingerprint Unlock.
     * Indicates whether or not to block fingerprint unlock.
     */
    @SerializedName("passcodeBlockFingerprintUnlock")
    @Expose
    public Boolean passcodeBlockFingerprintUnlock;

    /**
     * The Passcode Block Fingerprint Modification.
     * Block modification of registered Touch ID fingerprints when in supervised mode.
     */
    @SerializedName("passcodeBlockFingerprintModification")
    @Expose
    public Boolean passcodeBlockFingerprintModification;

    /**
     * The Passcode Block Modification.
     * Indicates whether or not to allow passcode modification on the supervised device (iOS 9.0 and later).
     */
    @SerializedName("passcodeBlockModification")
    @Expose
    public Boolean passcodeBlockModification;

    /**
     * The Passcode Block Simple.
     * Indicates whether or not to block simple passcodes.
     */
    @SerializedName("passcodeBlockSimple")
    @Expose
    public Boolean passcodeBlockSimple;

    /**
     * The Passcode Expiration Days.
     * Number of days before the passcode expires. Valid values 1 to 65535
     */
    @SerializedName("passcodeExpirationDays")
    @Expose
    public Integer passcodeExpirationDays;

    /**
     * The Passcode Minimum Length.
     * Minimum length of passcode. Valid values 4 to 14
     */
    @SerializedName("passcodeMinimumLength")
    @Expose
    public Integer passcodeMinimumLength;

    /**
     * The Passcode Minutes Of Inactivity Before Lock.
     * Minutes of inactivity before a passcode is required.
     */
    @SerializedName("passcodeMinutesOfInactivityBeforeLock")
    @Expose
    public Integer passcodeMinutesOfInactivityBeforeLock;

    /**
     * The Passcode Minutes Of Inactivity Before Screen Timeout.
     * Minutes of inactivity before the screen times out.
     */
    @SerializedName("passcodeMinutesOfInactivityBeforeScreenTimeout")
    @Expose
    public Integer passcodeMinutesOfInactivityBeforeScreenTimeout;

    /**
     * The Passcode Minimum Character Set Count.
     * Number of character sets a passcode must contain. Valid values 0 to 4
     */
    @SerializedName("passcodeMinimumCharacterSetCount")
    @Expose
    public Integer passcodeMinimumCharacterSetCount;

    /**
     * The Passcode Previous Passcode Block Count.
     * Number of previous passcodes to block. Valid values 1 to 24
     */
    @SerializedName("passcodePreviousPasscodeBlockCount")
    @Expose
    public Integer passcodePreviousPasscodeBlockCount;

    /**
     * The Passcode Sign In Failure Count Before Wipe.
     * Number of sign in failures allowed before wiping the device. Valid values 4 to 11
     */
    @SerializedName("passcodeSignInFailureCountBeforeWipe")
    @Expose
    public Integer passcodeSignInFailureCountBeforeWipe;

    /**
     * The Passcode Required Type.
     * Type of passcode that is required. Possible values are: deviceDefault, alphanumeric, numeric.
     */
    @SerializedName("passcodeRequiredType")
    @Expose
    public RequiredPasswordType passcodeRequiredType;

    /**
     * The Passcode Required.
     * Indicates whether or not to require a passcode.
     */
    @SerializedName("passcodeRequired")
    @Expose
    public Boolean passcodeRequired;

    /**
     * The Podcasts Blocked.
     * Indicates whether or not to block the user from using podcasts on the supervised device (iOS 8.0 and later).
     */
    @SerializedName("podcastsBlocked")
    @Expose
    public Boolean podcastsBlocked;

    /**
     * The Safari Block Autofill.
     * Indicates whether or not to block the user from using Auto fill in Safari.
     */
    @SerializedName("safariBlockAutofill")
    @Expose
    public Boolean safariBlockAutofill;

    /**
     * The Safari Block Java Script.
     * Indicates whether or not to block JavaScript in Safari.
     */
    @SerializedName("safariBlockJavaScript")
    @Expose
    public Boolean safariBlockJavaScript;

    /**
     * The Safari Block Popups.
     * Indicates whether or not to block popups in Safari.
     */
    @SerializedName("safariBlockPopups")
    @Expose
    public Boolean safariBlockPopups;

    /**
     * The Safari Blocked.
     * Indicates whether or not to block the user from using Safari.
     */
    @SerializedName("safariBlocked")
    @Expose
    public Boolean safariBlocked;

    /**
     * The Safari Cookie Settings.
     * Cookie settings for Safari. Possible values are: browserDefault, blockAlways, allowCurrentWebSite, allowFromWebsitesVisited, allowAlways.
     */
    @SerializedName("safariCookieSettings")
    @Expose
    public WebBrowserCookieSettings safariCookieSettings;

    /**
     * The Safari Managed Domains.
     * URLs matching the patterns listed here will be considered managed.
     */
    @SerializedName("safariManagedDomains")
    @Expose
    public java.util.List<String> safariManagedDomains;

    /**
     * The Safari Password Auto Fill Domains.
     * Users can save passwords in Safari only from URLs matching the patterns listed here. Applies to devices in supervised mode (iOS 9.3 and later).
     */
    @SerializedName("safariPasswordAutoFillDomains")
    @Expose
    public java.util.List<String> safariPasswordAutoFillDomains;

    /**
     * The Safari Require Fraud Warning.
     * Indicates whether or not to require fraud warning in Safari.
     */
    @SerializedName("safariRequireFraudWarning")
    @Expose
    public Boolean safariRequireFraudWarning;

    /**
     * The Screen Capture Blocked.
     * Indicates whether or not to block the user from taking Screenshots.
     */
    @SerializedName("screenCaptureBlocked")
    @Expose
    public Boolean screenCaptureBlocked;

    /**
     * The Siri Blocked.
     * Indicates whether or not to block the user from using Siri.
     */
    @SerializedName("siriBlocked")
    @Expose
    public Boolean siriBlocked;

    /**
     * The Siri Blocked When Locked.
     * Indicates whether or not to block the user from using Siri when locked.
     */
    @SerializedName("siriBlockedWhenLocked")
    @Expose
    public Boolean siriBlockedWhenLocked;

    /**
     * The Siri Block User Generated Content.
     * Indicates whether or not to block Siri from querying user-generated content when used on a supervised device.
     */
    @SerializedName("siriBlockUserGeneratedContent")
    @Expose
    public Boolean siriBlockUserGeneratedContent;

    /**
     * The Siri Require Profanity Filter.
     * Indicates whether or not to prevent Siri from dictating, or speaking profane language on supervised device.
     */
    @SerializedName("siriRequireProfanityFilter")
    @Expose
    public Boolean siriRequireProfanityFilter;

    /**
     * The Spotlight Block Internet Results.
     * Indicates whether or not to block Spotlight search from returning internet results on supervised device.
     */
    @SerializedName("spotlightBlockInternetResults")
    @Expose
    public Boolean spotlightBlockInternetResults;

    /**
     * The Voice Dialing Blocked.
     * Indicates whether or not to block voice dialing.
     */
    @SerializedName("voiceDialingBlocked")
    @Expose
    public Boolean voiceDialingBlocked;

    /**
     * The Wallpaper Block Modification.
     * Indicates whether or not to allow wallpaper modification on supervised device (iOS 9.0 and later) .
     */
    @SerializedName("wallpaperBlockModification")
    @Expose
    public Boolean wallpaperBlockModification;

    /**
     * The Wi Fi Connect Only To Configured Networks.
     * Indicates whether or not to force the device to use only Wi-Fi networks from configuration profiles when the device is in supervised mode.
     */
    @SerializedName("wiFiConnectOnlyToConfiguredNetworks")
    @Expose
    public Boolean wiFiConnectOnlyToConfiguredNetworks;


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
