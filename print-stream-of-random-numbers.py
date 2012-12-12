#!/usr/bin/env python
import sys
import random

r = random.Random()

try:
    for _ in range(0, int(sys.argv[1])):
        sys.stdout.write(str(r.randint(0, 9)))
except KeyboardInterrupt:
    sys.exit()

