/*
 * Copyright (c) 2016 Nick Guo
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.nick.scalpel.core.os;

import android.content.Context;
import android.os.IPowerManager;

import com.android.internal.telephony.ITelephony;
import com.nick.commands.sca.IScaService;

public enum ServiceType {

    AUTO(null, null),
    SCA("sca", IScaService.class),
    POWER(Context.POWER_SERVICE, IPowerManager.class),
    TELEPHONY(Context.TELEPHONY_SERVICE, ITelephony.class),
    PACKAGE("package", null);

    public String name;
    public Class clz;

    ServiceType(String name, Class clz) {
        this.name = name;
        this.clz = clz;
    }
}