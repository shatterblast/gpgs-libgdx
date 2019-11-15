# gpgs-libgdx
Obfuscation-focused OAuth 2 library for LibGDX with Google Play.
#

This library is based off the repository at:  https://github.com/MrStahlfelge/gdx-gamesvcs

LibGDX's site is available at:  https://libgdx.badlogicgames.com/
#

While this library comes primarily meant for my purposes, I release it in the hope that it helps others that use LibGDX.  This version comes designed to work with Allatori.  I also establish my OpenID Connect research off this code base, but that implementation is not publicly available.

Because this library intends to allow Allatori to properly work with LibGDX, none of Android's standard obfuscation rules come ingrained.

I left this library partially compatible with the gdx-gamesvcs repository.  Some refactoring is required to get the two to work together, but this library works just fine in its present form.  Google will phase out match-making and a few other multiplayer services somewhere between December 2019 and January 2020.  I left the services that I understood will stay supported, so it should work beyond that time frame.

Thank you.

