#!/bin/sh
docker run \
    --user $UID \
    --volume /Users/elenapliakas/build-cache-node:/data \
    --publish 80:5071 \
    gradle/build-cache-node:14.0 \
    start
