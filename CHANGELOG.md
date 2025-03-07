# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/), and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased] (0.7.0)

⚠️ You may need to delete cached rulebooks. They will be regenerated on the next startup.

### Added

* Added new `httpGet` utility functions ([#241](https://github.com/EpiLink/EpiLink/pull/241))
* Added a Swagger document in the documentation ([#256](https://github.com/EpiLink/EpiLink/pull/256))
* Added a simple notice in `.hasFrontend` file telling people to not remove it ([#280](https://github.com/EpiLink/EpiLink/pull/280))
* Added a new `count` command that counts the number of users that correspond to a target ([#286](https://github.com/EpiLink/EpiLink/pull/286))
* Added information in the documentation on guest accounts on Microsoft tenants and a hint for troubleshooting permission issues ([#290](https://github.com/EpiLink/EpiLink/pull/290))
* Added the ability to change the host address the server is bound to in the configuration file ([#290](https://github.com/EpiLink/EpiLink/pull/290))
* Added a searchbar on the documentation website ([#315](https://github.com/EpiLink/EpiLink/pull/315))
* The following are internal changes that are worth mentioning but do not impact the feature set:
  * Added the [Gradle wrapper validation action](https://github.com/gradle/wrapper-validation-action) ([#315](https://github.com/EpiLink/EpiLink/pull/315))

### Changed

* **BREAKING CHANGE** Changed the way custom roles are triggered ([#253](https://github.com/EpiLink/EpiLink/pull/241))
  * The `roles` in the Discord config have been deleted
  * A new `requires` field should be configured for each server instead
* Updated to Java 17 ([#315](https://github.com/EpiLink/EpiLink/pull/315))
* Updated to Kotlin 1.6 ([#315](https://github.com/EpiLink/EpiLink/pull/315))
* `httpGet` utility functions now have eager authentication on by default ([#241](https://github.com/EpiLink/EpiLink/pull/241))
* Dependencies versions bumped ([#277](https://github.com/EpiLink/EpiLink/pull/277), [#280](https://github.com/EpiLink/EpiLink/pull/280) and [#287](https://github.com/EpiLink/EpiLink/pull/287))
* Updated the Discord logo and color ([#283](https://github.com/EpiLink/EpiLink/pull/283))
* Migrated front-end to Vue 3 ([#316](https://github.com/EpiLink/EpiLink/pull/316))
* The following are worth mentioning, though they are internal changes that don't impact the actual feature set. ([#280](https://github.com/EpiLink/EpiLink/pull/280))
  * The CI is now more thorough in order to improve our release quality.
  * The front-end is now bundled as a separate JAR that is *then* integrated as a regular library in the back-end. This significantly simplifies the `withFrontend` variant build.
  * Let Gradle automatically replace the correct version string in the docs via a simple template.
  * Also used Gradle's `layout` feature to avoid hard-coding build paths.
  * Renamed internal classes to remove the "Link" prefix ([#289](https://github.com/EpiLink/EpiLink/pull/289))
  * Added the `detekt` tool in the build process and fixed the internal issues it found ([#299](https://github.com/EpiLink/EpiLink/pull/299))
  * Now using Gradle's version catalog feature for dependency management ([#303](https://github.com/EpiLink/EpiLink/pull/303))
  * Now using `-Werror` in Kotlin's compilation options ([#303](https://github.com/EpiLink/EpiLink/pull/303))
  * Switch to the Temurin JDK for CI builds (version 17) ([#315](https://github.com/EpiLink/EpiLink/pull/315))
  * Revamped Gradle setup ([#315](https://github.com/EpiLink/EpiLink/pull/315))
  * Updated CI actions ([#315](https://github.com/EpiLink/EpiLink/pull/315))

## [0.6.2] - 2021-04-14

### Changed

* Dependencies updated for both frontend and backend ([#264](https://github.com/EpiLink/EpiLink/pull/264))
* Improved httpGetJson to improve authentication and permit custom return types ([#264](https://github.com/EpiLink/EpiLink/pull/264))

### Deprecated

* Deprecated the old httpGetJson method, which has to be replaced by the new ones ([#264](https://github.com/EpiLink/EpiLink/pull/264))

### Fixed

* Fixed an issue where Ktor would cut a response if too long, causing crashes on the id access logs (profile page) ([#264](https://github.com/EpiLink/EpiLink/pull/264))
* Fixed an issue where Logback would cause a stack overflow during a cyclic exception stack trace logging ([#264](https://github.com/EpiLink/EpiLink/pull/264))
* Fixed an issue where httpGetJson calls by rulebooks would cause thread leaking ([#262](https://github.com/EpiLink/EpiLink/issues/262))
* Increased login popup windows so that the Discord QR code can be displayed ([#250](https://github.com/EpiLink/EpiLink/issues/250))

## [0.6.1] - 2020-09-13

Although there is a number of additions that would theoretically count as a minor update, these are very minimal and invisible to all users except maintainers, and do not break anything.

### Added

* Added rate limiting profiles ([#105](https://github.com/EpiLink/EpiLink/issues/105))
* The Discord bot now adds reactions to messages after a role update is done ([#236](https://github.com/EpiLink/EpiLink/issues/236))
* Added an admin badge on the user profile page if the user is privileged ([#237](https://github.com/EpiLink/EpiLink/issues/237))
* Added information on user endpoint on whether the user is privileged or not ([#237](https://github.com/EpiLink/EpiLink/issues/237))

### Fixed

* Fixed long usernames "pushing" UI elements to the right or going out of frame in the user pages ([#237](https://github.com/EpiLink/EpiLink/issues/237))
* Bypass sticky rules in case of a ban ([#105](https://github.com/EpiLink/EpiLink/issues/235))
* Fully fix all SQLite related errors ([#237](https://github.com/EpiLink/EpiLink/issues/237))

## [0.6.0] - 2020-09-10

### Added

* Added the ability to disable admin endpoints ([#227](https://github.com/EpiLink/EpiLink/issues/227))
* Added sticky roles ([#228](https://github.com/EpiLink/EpiLink/issues/228))
* Added an initial logging entry that contains the version. ([#230](https://github.com/EpiLink/EpiLink/issues/230))
* Added half of the Identity Provider ID Hash's hex representation to the "already linked" error message. ([#226](https://github.com/EpiLink/EpiLink/issues/226))
* Added an administration endpoint for deleting users ([#220](https://github.com/EpiLink/EpiLink/issues/220) / [#7](https://github.com/EpiLink/EpiLink/issues/7))
* Added a configurable cooldown for identity removal ([#169](https://github.com/EpiLink/EpiLink/issues/169))
* Added a search endpoint ([#229](https://github.com/EpiLink/EpiLink/pull/229))

### Changed

* Dependencies updated ([#221](https://github.com/EpiLink/EpiLink/issues/221))
* Slight adjustments to the GDPR report ([#229](https://github.com/EpiLink/EpiLink/issues/229))

### Fixed

* Fix rulebooks failing silently if an exception was thrown during initial execution ([#232](https://github.com/EpiLink/EpiLink/issues/232))
* Fix potential database locking issues for SQLite ([#229](https://github.com/EpiLink/EpiLink/pull/229))
* Fixed avatar-less users icons on the front-end ([#222](https://github.com/EpiLink/EpiLink/issues/222))
* Fixed the maintenance front-end message not working on Chromium (or at least Edge Chromium) ([#225](https://github.com/EpiLink/EpiLink/issues/225))

## [0.5.1] - 2020-08-11

### Fixed

* Fixed issues with Discord messages ([#217](https://github.com/EpiLink/EpiLink/pull/217), [#218](https://github.com/EpiLink/EpiLink/pull/218))
* Fixed an i18n issue on the front-end ([#216](https://github.com/EpiLink/EpiLink/pull/216)) 

## [0.5.0] - 2020-08-10

### Added

* Added compatibility with any OpenID Connect compatible service ([#214](https://github.com/EpiLink/EpiLink/pull/214))
  * **BREAKING CHANGE:** If you were using EpiLink before this version, you must add an `idProvider` section in your configuration file and **enable the Microsoft backwards compatibility option.** See the docs for more details.
* Added an asset system ([#214](https://github.com/EpiLink/EpiLink/pull/214))
  * **BREAKING CHANGE:** If you still want to an URL, replace the URL string with `{ url: "your_url" }`
* Added a background ([#214](https://github.com/EpiLink/EpiLink/pull/214))
* Added I18n support on the back-end, including Discord I18n with the `e!lang` command. ([#204](https://github.com/EpiLink/EpiLink/pull/204))
* Added the `_notIdentified` EpiLink role. You can now attribute roles to users who are registered but do not have their identity stored in the database. ([#211](https://github.com/EpiLink/EpiLink/pull/211))

### Changed

* Made some startup steps asynchronous for better startup speed ([#214](https://github.com/EpiLink/EpiLink/pull/214))
* The tab icon now shows the instance's icon instead of the EpiLink icon ([#203](https://github.com/EpiLink/EpiLink/pull/203))
* Reworked some Discord embeds
* Updated dependencies and Discord4J ([#212](https://github.com/EpiLink/EpiLink/pull/212))
    * **BREAKING CHANGE:** Some color names no longer work properly because we are now parsing Discord4J color names instead of Java AWT color names. Use the Discord4J color names or use hexadecimal color values directly (`#123abc`)

### Fixed

* Fixed a front-end popup bug on Safari
* Use the new `discord.com` URLs instead of `discordapp.com` (except for the CDN URLs) ([#208](https://github.com/EpiLink/EpiLink/issues/208))

## [0.4.0] - 2020-07-08

### Added

* Added Discord commands ([#178](https://github.com/EpiLink/EpiLink/pull/178))
* Added the Interactive Rule Tester (IRT) ([#191](https://github.com/EpiLink/EpiLink/pull/191))
* Added Rulebook caching ([#195](https://github.com/EpiLink/EpiLink/pull/195))

### Changed

* Moved rulebook settings to the root section instead of the Discord section ([#193](https://github.com/EpiLink/EpiLink/pull/193))
    * **BREAKING CHANGE:** Move `rulebook` and `rulebookFile` options out of the Discord section. You can place it anywhere "in the root" (i.e. at the same level as the `redis` or `db` option)
* Updated back-end dependencies
* Use Discord bot assets from the master branch instead of the dev one ([#182](https://github.com/EpiLink/EpiLink/pull/182))
* Changed the rate-limited message for a clearer one ([#188](https://github.com/EpiLink/EpiLink/issues/188))
* Expanded the ToS and Privacy Policy pages to improve the PDF readability ([#198](https://github.com/EpiLink/EpiLink/pull/198))
* Added meta description and robots.txt file ([#198](https://github.com/EpiLink/EpiLink/pull/198))
* Improved and translated common error messages ([#198](https://github.com/EpiLink/EpiLink/pull/198))
* The `/api/v1/admin/gdprreport` is now a POST instead of a GET ([#196](https://github.com/EpiLink/EpiLink/issues/196))

### Fixed

* Fixed the GitHub links pointing to the previous (internal) repository, Litarvan/EpiLink, point to EpiLink/EpiLink instead.
* Fixed the "Download this PDF file" not working because of ad-blockers. Serve the real URL instead of the pre-loaded blob. ([#190](https://github.com/EpiLink/EpiLink/issues/190))

## [0.3.1] - 2020-06-29

### Changed

* Improved the profile page layout on small screens

### Fixed

* Fixed iOS layout glitch on the settings page

## [0.3.0] - 2020-06-29

### Added

* Added PDF support for ToS and Privacy Policy documents ([#175](https://github.com/EpiLink/EpiLink/pull/175))
* Added GDPR report generation ([#173](https://github.com/EpiLink/EpiLink/pull/173))
* Added ban notifications ([#168](https://github.com/EpiLink/EpiLink/pull/168))
* Added administration endpoints (and its documentation) ([#161](https://github.com/EpiLink/EpiLink/pull/161))
* Added banning abilities ([#161](https://github.com/EpiLink/EpiLink/pull/161))
    * **BREAKING CHANGE:** The Bans table of the database was improved significantly in a non-backwards-compatible way: delete it (you could not ban people before anyways) and EpiLink will re-create it for you.
    * Note: While banning logic has been in place for a while, there was no way of creating or revoking a ban. This adds banning and revoking abilities.
* Added manual ID access ([#161](https://github.com/EpiLink/EpiLink/pull/161))
* Added retrieving additional information about users ([#161](https://github.com/EpiLink/EpiLink/pull/161))
* Added full mobile / small screens support ([#180](https://github.com/EpiLink/EpiLink/pull/180))
* On meta text pages, the back button now works when accessing the page by its URL ([#170](https://github.com/EpiLink/EpiLink/issues/170))

### Changed

* Updated the logo ([#181](https://github.com/EpiLink/EpiLink/pull/181))
* Use logos from the GitHub repository instead of Discord's CDN in embeds ([#167](https://github.com/EpiLink/EpiLink/pull/167))
* Refactored `LinkServerDatabase` so much that it doesn't exist anymore ([#165](https://github.com/EpiLink/EpiLink/pull/165))
* Refactored the back-end APIs ([#161](https://github.com/EpiLink/EpiLink/pull/161))

### Removed

* Removed rate limiting code from this codebase. It is known available as a separate, reusable library, [ktor-rate-limit](https://github.com/utybo/ktor-rate-limit). ([#172](https://github.com/EpiLink/EpiLink/pull/172))

### Fixed

* Fixed the ToS being served on both ToS and PP pages ([#175](https://github.com/EpiLink/EpiLink/pull/175))
* Reduced the amount of calls to `getUser`, resulting in better performance with fewer calls to the DB ([#165](https://github.com/EpiLink/EpiLink/pull/165)).
* Re-added the server(s) name(s) in the "could not authenticate you" Discord embed ([#161](https://github.com/EpiLink/EpiLink/pull/161))
* Fixed an extra newline in an embed ([#161](https://github.com/EpiLink/EpiLink/pull/161))
* Fixed some Discord crashes called by the client deciding that it does not want to exist ([#161](https://github.com/EpiLink/EpiLink/pull/161)) 

## [0.2.0] - 2020-05-05

### Added

* Added an error for when the `frontendUrl` configuration property does not have a trailing slash ([150](https://github.com/EpiLink/EpiLink/pull/150))
* Added the "Instance" page on the front-end ([#148](https://github.com/EpiLink/EpiLink/issues/148))
* Added maintainer information in the back-end configuration + endpoints ([#148](https://github.com/EpiLink/EpiLink/issues/148))
* Added a back arrow button on the meta text pages ([#141](https://github.com/EpiLink/EpiLink/issues/141))
* Added a [documentation site](https://epilink.zoroark.guru) ([#142](https://github.com/EpiLink/EpiLink/issues/142))
* Added the logo configured on the back-end to the front-end ([#146](https://github.com/EpiLink/EpiLink/issues/146))
* Rule caching added: rules' outputs can now be cached to avoid calling a rule again and again ([#135](https://github.com/EpiLink/EpiLink/issues/135))
    * **NOTE:** `_INDEX_` is now a reserved rule name
* You can now run EpiLink with `DEBUG` output by using the `-v` command-line argument ([#135](https://github.com/EpiLink/EpiLink/issues/135)) 
* EpiLink now shows how much time some services took to be launched ([#135](https://github.com/EpiLink/EpiLink/issues/135))
* Added more helpers for manipulating received objects in rulebooks (and documented networking capabilities) ([#132](https://github.com/EpiLink/EpiLink/issues/132))
* Added the home page in the footer navigation ([#123](https://github.com/EpiLink/EpiLink/issues/123))
* Added a [Docker image](https://hub.docker.com/r/litarvan/epilink) 

### Changed

* Moved `LICENSE_HEADER` to `LHEADER` ([#144](https://github.com/EpiLink/EpiLink/issues/144))
* Changed some front-end logging to be `TRACE` instead of `DEBUG` to reduce verbosity ([#140](https://github.com/EpiLink/EpiLink/issues/140))
* Changed the internal management of cache-related utilities, now using a unified interface for generating session management and rule caching objects ([#135](https://github.com/EpiLink/EpiLink/issues/135))
* Refactored the role management code for better readability ([#135](https://github.com/EpiLink/EpiLink/issues/135))
* Changed the way EpiLink launches initial services ([#135](https://github.com/EpiLink/EpiLink/issues/135))
* Rounded the favicon ([#126](https://github.com/EpiLink/EpiLink/issues/126))
* Reversed the order of the ID accesses on the profile page ([#129](https://github.com/EpiLink/EpiLink/issues/129))
* Removing the e-mail after registration ([#131](https://github.com/EpiLink/EpiLink/issues/131))

### Removed

* Removed the footer links for "Terms of Services" and "Privacy" ([#148](https://github.com/EpiLink/EpiLink/issues/148))
    * These are now available from the new Instance page, and are still accessible from the registration process

### Fixed

* Fixed the ordering of ID accesses on the profile page ([#141](https://github.com/EpiLink/EpiLink/issues/141))
* Properly handle exceptions in the role manager, rate limiter memory and Discord client ([#144](https://github.com/EpiLink/EpiLink/issues/144))
* Fixed the about page punctuation ([#130](https://github.com/EpiLink/EpiLink/issues/130))

## [0.1.1] - 2020-04-25

Emergency fixes.

### Added

* Added the ability to set a logo on the back-end ([#111](https://github.com/EpiLink/EpiLink/issues/111))

### Fixed

* Fixed error on back-end on invalid session ([#127](https://github.com/EpiLink/EpiLink/issues/127))
* Fixed the 'remember me' checkbox on the profile page sometimes not being selected when it should be ([#124](https://github.com/EpiLink/EpiLink/issues/124))
* Fixed CORS support on HTTPS ([#115](https://github.com/EpiLink/EpiLink/issues/115))
* Various building fixes ([#118](https://github.com/EpiLink/EpiLink/issues/118), [#110](https://github.com/EpiLink/EpiLink/issues/110))

### Removed

* Removed HTTPS redirection options ([#120](https://github.com/EpiLink/EpiLink/issues/120)). 
  * **BREAKING CHANGE:** Delete the `enableHttpsRedirect` option in your configuration file.

## [0.1.0] - 2020-04-25

Initial release. Introduces so many things it will make your eyes hurt, probably.

### Added

* Added license checking for the project ([#103](https://github.com/EpiLink/EpiLink/issues/103))
* Added profile page ([#107](https://github.com/EpiLink/EpiLink/issues/107))
* Added reverse proxy and HTTPS redirection support ([#93](https://github.com/EpiLink/EpiLink/issues/93), [#98](https://github.com/EpiLink/EpiLink/issues/98))
* Added rate-limiting ([#93](https://github.com/EpiLink/EpiLink/issues/93))
* Added relinking endpoints and front-end support ([#85](https://github.com/EpiLink/EpiLink/issues/85), [#107](https://github.com/EpiLink/EpiLink/issues/107))
* Added i18n support to the front-end ([#84](https://github.com/EpiLink/EpiLink/issues/84), [#107](https://github.com/EpiLink/EpiLink/issues/107))
* Added e-mail validation to rulebooks ([#80](https://github.com/EpiLink/EpiLink/issues/80))
* Added logging all over the place ([#74](https://github.com/EpiLink/EpiLink/issues/74))
* Added `/user` endpoints ([#60](https://github.com/EpiLink/EpiLink/issues/60), [#76](https://github.com/EpiLink/EpiLink/issues/76), [#102](https://github.com/EpiLink/EpiLink/issues/102))
* Added `/meta` endpoints ([#59](https://github.com/EpiLink/EpiLink/issues/59))
* Added testing ([#49](https://github.com/EpiLink/EpiLink/issues/49), [#79](https://github.com/EpiLink/EpiLink/issues/79))
* Added Redis server support ([#48](https://github.com/EpiLink/EpiLink/issues/48))
* Added embeds for ID access notifications and greetings message ([#44](https://github.com/EpiLink/EpiLink/issues/44))
* Added proper error-handling ([#36](https://github.com/EpiLink/EpiLink/issues/36), [#42](https://github.com/EpiLink/EpiLink/issues/42))
* Added automated ID access notifications ([#31](https://github.com/EpiLink/EpiLink/issues/31) but this predates that PR)
* Use dependency injection for everything via Koin ([#24](https://github.com/EpiLink/EpiLink/issues/24))
* Added the front-end ([#23](https://github.com/EpiLink/EpiLink/issues/23), [#89](https://github.com/EpiLink/EpiLink/issues/89), [#90](https://github.com/EpiLink/EpiLink/issues/90), [#91](https://github.com/EpiLink/EpiLink/issues/91), [#92](https://github.com/EpiLink/EpiLink/issues/92), )
* Added rulebooks ([#19](https://github.com/EpiLink/EpiLink/issues/19))
* Added Discord bot ([#18](https://github.com/EpiLink/EpiLink/issues/18))
* Added the maintainer guide ([#17](https://github.com/EpiLink/EpiLink/issues/17))
* Added registration on the back-end ([#16](https://github.com/EpiLink/EpiLink/issues/16))
* Added the ability for the front-end to be bundled to the back-end ([#14](https://github.com/EpiLink/EpiLink/issues/14))
* Added some documentation (all PRs, notably [#47](https://github.com/EpiLink/EpiLink/issues/47), [#77](https://github.com/EpiLink/EpiLink/issues/77), [#87](https://github.com/EpiLink/EpiLink/issues/87))
* Added the back-end API ([#13](https://github.com/EpiLink/EpiLink/issues/13)) 
* Added CLI arguments support ([#12](https://github.com/EpiLink/EpiLink/issues/12))
* Added database support ([#8](https://github.com/EpiLink/EpiLink/issues/8))
* Added Ktor server and back-end server ([#5](https://github.com/EpiLink/EpiLink/issues/5), [#13](https://github.com/EpiLink/EpiLink/issues/13))
* Added basic GitHub project management via CI and code owners ([#4](https://github.com/EpiLink/EpiLink/issues/4), [#49](https://github.com/EpiLink/EpiLink/issues/49))
* Added basic Gradle project ([#2](https://github.com/EpiLink/EpiLink/issues/2))

[Unreleased]: https://github.com/EpiLink/EpiLink/compare/v0.6.2...dev
[0.6.2]: https://github.com/EpiLink/EpiLink/releases/tag/v0.6.2
[0.6.1]: https://github.com/EpiLink/EpiLink/releases/tag/v0.6.1
[0.6.0]: https://github.com/EpiLink/EpiLink/releases/tag/v0.6.0
[0.5.1]: https://github.com/EpiLink/EpiLink/releases/tag/v0.5.1
[0.5.0]: https://github.com/EpiLink/EpiLink/releases/tag/v0.5.0
[0.4.0]: https://github.com/EpiLink/EpiLink/releases/tag/v0.4.0
[0.3.1]: https://github.com/EpiLink/EpiLink/releases/tag/v0.3.1
[0.3.0]: https://github.com/EpiLink/EpiLink/releases/tag/v0.3.0
[0.2.0]: https://github.com/EpiLink/EpiLink/releases/tag/v0.2.0
[0.1.1]: https://github.com/EpiLink/EpiLink/releases/tag/v0.1.1
[0.1.0]: https://github.com/EpiLink/EpiLink/releases/tag/v0.1
