/**
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 *
 * This Source Code Form is "Incompatible With Secondary Licenses", as
 * defined by the Mozilla Public License, v. 2.0.
 */
package org.epilink.bot.http.data

// See the Api.md documentation file for more information
@Suppress("KDocMissingDocumentation")
data class RegistrationInformation(
    val discordUsername: String?,
    val discordAvatarUrl: String?,
    val presentOnMonitoredServers: Boolean?,
    val email: String?
)
