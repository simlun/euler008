#!/bin/bash
set -e

./build.sh

OUTPUT=`./print-stream-of-random-numbers.py 9999 | ./run.sh 2>&1 | head -n 1`
ERROR='Exception in thread "main" java.lang.StackOverflowError'

fail() {
    echo "FAILED with StackOverflowError"
    exit 1
}

[[ "$OUTPUT" != "$ERROR" ]] && echo "OK" || fail

