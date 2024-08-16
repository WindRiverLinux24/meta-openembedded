require python-django.inc
inherit setuptools3

SRC_URI[sha256sum] = "ebe859c9da6fead9c9ee6dbfa4943b04f41342f4cea2c4d8c978ef0d10694f2b"

RDEPENDS:${PN} += "\
    python3-sqlparse \
    python3-asgiref \
"
