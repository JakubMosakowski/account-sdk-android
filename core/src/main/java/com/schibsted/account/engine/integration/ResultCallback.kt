/*
 * Copyright (c) 2018 Schibsted Products & Technology AS. Licensed under the terms of the MIT license. See LICENSE in the project root.
 */

package com.schibsted.account.engine.integration

import com.schibsted.account.model.error.ClientError

interface ResultCallback {
    fun onSuccess()
    fun onError(error: ClientError)
}
