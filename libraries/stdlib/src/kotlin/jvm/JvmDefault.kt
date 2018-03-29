/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */
@file:JvmVersion
package kotlin.jvm

import kotlin.internal.RequireKotlin
import kotlin.internal.RequireKotlinVersionKind

@SinceKotlin("1.2")
@RequireKotlin("1.2.40", versionKind = RequireKotlinVersionKind.COMPILER_VERSION)
annotation class JvmDefault
