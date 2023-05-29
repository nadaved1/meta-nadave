SUMMARY = "Example of how to build an external Linux kernel module"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

inherit module

SRCREV = "4f082b755fdf2ef8da30adf2dfbca6fc0745cd2f"
SRC_URI = " \
    git://github.com/toradex/hello-mod.git;branch=main;protocol=https \
"

PV = "1.0+git${SRCPV}"

S = "${WORKDIR}/git"

RPROVIDES_${PN} += "kernel-module-hello" 
