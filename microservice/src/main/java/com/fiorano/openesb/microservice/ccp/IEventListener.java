/*
 * Copyright (c) Fiorano Software Pte. Ltd. and affiliates. All rights reserved. http://www.fiorano.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package com.fiorano.openesb.microservice.ccp;

import com.fiorano.openesb.microservice.ccp.event.ComponentCCPEvent;

public interface IEventListener {
    void onEvent(ComponentCCPEvent event) throws Exception;
    String getId();
}