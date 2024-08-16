SUMMARY = "Library for IPv6 Neighbor Discovery Protocol"
HOMEPAGE = "http://libndp.org/"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=4fbd65380cdd255951079008b364516c"

SRC_URI = "git://github.com/jpirko/libndp;branch=master;protocol=https \
           "
# tag for v1.9
SRCREV = "2730638bf88984b09531813974f9bd14e1a50165"
S = "${WORKDIR}/git"

inherit autotools
