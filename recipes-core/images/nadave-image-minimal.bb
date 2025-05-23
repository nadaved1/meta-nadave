SUMMARY = "nadave minimal image"
DESCRIPTION = "removed some extra packages, added others"

LICENSE = "MIT"

inherit core-image

export IMAGE_BASE_NAME = "nadave-image-minimal"
MACHINE_NAME ?= "${MACHINE}"
IMAGE_NAME = "${MACHINE_NAME}_${IMAGE_BASE_NAME}"

IMAGE_INSTALL:append = "htop"

IMAGE_INSTALL:remove = "vim-help valgrind gstreamer1.0-plugins-bad-debugutilsbad"

