inherit core-image

DESCRIPTION = "A small image for tetsing wifi configurations on \
virtual wifi cards."

IMAGE_FEATURES += "dev-pkgs"

IMAGE_INSTALL += "kernel-module-tun kernel-module-*"
IMAGE_INSTALL += "htop"
IMAGE_INSTALL += "hostapd"
IMAGE_INSTALL += "networkmanager"

#IMAGE_FEATURES += "read-only-rootfs"

