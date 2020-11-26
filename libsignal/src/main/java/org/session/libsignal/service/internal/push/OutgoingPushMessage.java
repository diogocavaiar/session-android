/**
 * Copyright (C) 2014-2016 Open Whisper Systems
 *
 * Licensed according to the LICENSE file in this repository.
 */

package org.session.libsignal.service.internal.push;


import com.fasterxml.jackson.annotation.JsonProperty;

public class OutgoingPushMessage {

  @JsonProperty
  public int    type;
  @JsonProperty
  private int    destinationDeviceId;
  @JsonProperty
  private int    destinationRegistrationId;
  @JsonProperty
  public String content;

  public OutgoingPushMessage(int type,
                             int destinationDeviceId,
                             int destinationRegistrationId,
                             String content)
  {
    this.type                      = type;
    this.destinationDeviceId       = destinationDeviceId;
    this.destinationRegistrationId = destinationRegistrationId;
    this.content                   = content;
  }
}