SUMMARY = "Hello World"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "git://github.com/nadaved1/hello.git;protocol=https;branch=main"

SRCREV = "aed049e48bc289cff92073887a10c38212b16ae8"
SRC_URI[sha256sum] = "1ca3c205a8d8369434f8fcc9be7ba8d36c3e9176f9bfaef960953bd942846205"

# Set LDFLAGS options provided by the build system
TARGET_CC_ARCH += "${LDFLAGS}"

# Change source directory to work directory where hello.c is
S = "${WORKDIR}/git"

do_compile() {
    ${CC} -Wall hello.c -o hello
}

# Install binary to final directory /usr/bin
do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/hello ${D}${bindir}
}

