SUMMARY = "My Custom Image"
DESCRIPTION = "This is my customized image containing a simple hello"

LICENSE = "MIT"

inherit core-image

export IMAGE_BASENAME = "nadave-image"
MACHINE_NAME ?= "${MACHINE}"
IMAGE_NAME = "${MACHINE_NAME}_${IMAGE_BASENAME}"

IMAGE_INSTALL:append = " \
    hello hello-mod \
"

