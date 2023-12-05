#!/bin/sh
# Example for use of GNU gettext.
# This file is in the public domain.
#
# Script for cleaning all autogenerated files.

test ! -f Makefile || make distclean
rm -rf autom4te.cache

# Brought in by explicit copy.
rm -f gettext.h

# Brought in by autopoint.
rm -f ABOUT-NLS
rm -f config.rpath
rm -f m4/gettext.m4
rm -f m4/host-cpu-c-abi.m4
rm -f m4/iconv.m4
rm -f m4/intlmacosx.m4
rm -f m4/lib-ld.m4
rm -f m4/lib-link.m4
rm -f m4/lib-prefix.m4
rm -f m4/nls.m4
rm -f m4/po.m4
rm -f m4/progtest.m4
rm -f po/Makefile.in.in
rm -f po/remove-potcdate.sin

# Generated by aclocal.
rm -f aclocal.m4

# Generated by autoconf.
rm -f configure

# Generated or brought in by automake.
rm -f Makefile.in
rm -f m4/Makefile.in
rm -f compile
rm -f install-sh
rm -f missing
rm -f config.guess
rm -f config.sub
rm -f po/*.pot
rm -f po/stamp-po
rm -f po/*.gmo
