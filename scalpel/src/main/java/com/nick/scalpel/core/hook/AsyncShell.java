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

package com.nick.scalpel.core.hook;

import android.text.TextUtils;

import com.nick.scalpel.core.opt.SharedExecutor;

public class AsyncShell extends Shell {

    @Override
    public boolean exec(final String command, final FeedbackReceiver receiver) {
        if (TextUtils.isEmpty(command)) return false;
        SharedExecutor.get().execute(new Runnable() {
            @Override
            public void run() {
                AsyncShell.super.exec(command, receiver);
            }
        });
        return true;
    }
}
