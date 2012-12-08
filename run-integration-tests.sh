#!/bin/bash

lein clean
lein compile

EXPECTED="720"
ACTUAL=`echo "1234561" | lein trampoline run`

fail() {
    echo "Expected: " $1
    echo "Actual: " $2
    echo "FAIL"
    exit 1
}

[[ "$EXPECTED" == "$ACTUAL" ]] && echo "OK" || fail "$EXPECTED" "$ACTUAL"

