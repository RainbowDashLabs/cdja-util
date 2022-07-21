/*
 *     SPDX-License-Identifier: AGPL-3.0-only
 *
 *     Copyright (C) 2022 RainbowDashLabs and Contributor
 */

package de.chojo.jdautil.interactions.user.builder;

import de.chojo.jdautil.interactions.user.UserHandler;

public interface PartialUserBuilder {
    UserBuilder handler(UserHandler handler);
}
