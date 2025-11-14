SUMMARY = "Packages for early access users of NILE"
LICENSE = "MIT"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

# avahi was specifically requested so it can be pulled into a NIBuild third party export
RDEPENDS:${PN} += "\
    avahi \
"
